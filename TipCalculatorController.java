// Matthew Ferraro
// CSC 331
// 04/14/21

package application;

import javafx.fxml.FXML;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class TipCalculatorController {
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private BigDecimal tipPercentage = new BigDecimal(0.15);

    @FXML
    private TextField tipTextField;

    @FXML
    private Slider tipPercentageSlider;

    @FXML
    private Label tipPercentageLabel;

    @FXML
    private TextField amountTextField;

    @FXML
    private TextField totalTextField;

    @FXML
    private TextField splitTextField;

    @FXML
    private TextField partyTextField;

    @FXML
    private void resetButtonPressed(ActionEvent event) {
        amountTextField.setStyle("-fx-text-fill: green; -fx-font-size: 16px;");
        tipPercentageSlider.setValue(15);
        tipTextField.clear();
        partyTextField.clear();
        splitTextField.clear();
        totalTextField.clear();
        amountTextField.setDisable(false);
        tipPercentageSlider.setDisable(true);
        partyTextField.setDisable(true);

// Initial Calculate button removed as implied in instructions
//        try {
//            BigDecimal amount = new BigDecimal(amountTextField.getText());
//            BigDecimal party = new BigDecimal(partyTextField.getText());
//            BigDecimal tip = amount.multiply(tipPercentage);
//            BigDecimal total = amount.add(tip);
//            BigDecimal splitBill = total.divide(party);
//            tipTextField.setText(currency.format(tip));
//            totalTextField.setText(currency.format(total));
//            splitTextField.setText(currency.format(splitBill));
//        } catch (NumberFormatException ex) {
//            amountTextField.setText("Enter amount");
//            amountTextField.selectAll();
//            amountTextField.requestFocus();
//        }
    }

    public void initialize() {
        tipPercentageSlider.setDisable(true);
        partyTextField.setDisable(true);
        currency.setRoundingMode(RoundingMode.HALF_UP);

        // amount listener
        amountTextField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                if (amountTextField.getText().isEmpty()) {
                    tipTextField.clear();
                    totalTextField.clear();
                }
                BigDecimal amount = new BigDecimal(amountTextField.getText());
                BigDecimal setTipField = amount.multiply(tipPercentage);
                BigDecimal setTotalField = amount.multiply(tipPercentage).add(amount);
                tipTextField.setText(currency.format(setTipField));
                totalTextField.setText(currency.format(setTotalField));
                tipPercentageSlider.setDisable(false);
            }
        });

        // bound label to slider here
        tipPercentageLabel.textProperty().bind(tipPercentageSlider.valueProperty().asString("%.0f%%"));
        tipPercentageSlider.setShowTickLabels(true);
        tipPercentageSlider.setMajorTickUnit(5);

        // slider listener
        tipPercentageSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                amountTextField.setDisable(true);
                tipPercentage = BigDecimal.valueOf(newValue.intValue() / 100.0);
                BigDecimal amount = new BigDecimal(amountTextField.getText());
                BigDecimal setTipField = amount.multiply(tipPercentage);
                BigDecimal setTotalField = amount.multiply(tipPercentage).add(amount);
                tipTextField.setText(currency.format(setTipField));
                totalTextField.setText(currency.format(setTotalField));
                partyTextField.setDisable(false);
            }
        });

        // party size listener
        partyTextField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                if (partyTextField.getText().isEmpty()) {
                    splitTextField.clear();
                }
                tipPercentageSlider.setDisable(true);
                BigDecimal party = new BigDecimal(partyTextField.getText());
                BigDecimal amount = new BigDecimal(amountTextField.getText());
                BigDecimal setTipField = amount.multiply(tipPercentage);
                BigDecimal setTotalField = amount.multiply(tipPercentage).add(amount);
                BigDecimal setSplitField = amount.multiply(tipPercentage).add(amount).divide(party, RoundingMode.HALF_UP);
                splitTextField.setText(currency.format(setSplitField));
                tipTextField.setText(currency.format(setTipField));
                totalTextField.setText(currency.format(setTotalField));
            }
        });
    }
}
