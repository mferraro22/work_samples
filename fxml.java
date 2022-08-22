<?xml version="1.0" encoding="UTF-8"?>

        <?import javafx.geometry.Insets?>

        <?import javafx.scene.control.Button?>

        <?import javafx.scene.control.Label?>

        <?import javafx.scene.control.Slider?>

        <?import javafx.scene.control.TextField?>

        <?import javafx.scene.layout.ColumnConstraints?>

        <?import javafx.scene.layout.GridPane?>

        <?import javafx.scene.layout.RowConstraints?>

<GridPane hgap="8.0" maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" xmlns="http://javafx.com/javafx/8.0.60" xmlns:fx="http://javafx.com/fxml/1" fx:controller="TipCalculatorController">

<columnConstraints>

<ColumnConstraints halignment="RIGHT" hgrow="SOMETIMES" minWidth="10.0" />

<ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" />

</columnConstraints>

<rowConstraints>

<RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />

<RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />

<RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />

<RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />

<RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />

</rowConstraints>

<children>

<Label text="Amount" />

<Label fx:id="tipPercentageLabel" text="15%" GridPane.rowIndex="1" />

<Label text="Tip" GridPane.rowIndex="2" />

<Label text="Total" GridPane.rowIndex="3" />

<TextField fx:id="amountTextField" GridPane.columnIndex="1" />

<TextField fx:id="tipTextField" editable="false" focusTraversable="false" GridPane.columnIndex="1" GridPane.rowIndex="2" />

<TextField fx:id="totalTextField" editable="false" focusTraversable="false" GridPane.columnIndex="1" GridPane.rowIndex="3" />

<Slider fx:id="tipPercentageSlider" blockIncrement="5.0" max="30.0" value="15.0" GridPane.columnIndex="1" GridPane.rowIndex="1" />

<Button maxWidth="1.7976931348623157E308" mnemonicParsing="false" onAction="#calculateButtonPressed" text="Calculate" GridPane.columnIndex="1" GridPane.rowIndex="4" />

</children>

<padding>

<Insets bottom="14.0" left="14.0" right="14.0" top="14.0" />

</padding>

</GridPane>
