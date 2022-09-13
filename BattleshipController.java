package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.event.ActionEvent;
import java.util.*;
import java.util.Arrays;

public class BattleshipController {


    // The FXML code for all the cells on the two (player and computer) 10x10 boards
    // And also all of the extra buttons needed for the game.
    @FXML
    public TextField enterTextField;

    @FXML
    private Label bLabel;

    @FXML
    private Label aLabel;

    @FXML
    private Label wLabel;

    @FXML
    private Label iLabel;

    @FXML
    private Label nLabel;

    @FXML
    private Label n2Label;

    @FXML
    private Label eLabel;

    @FXML
    private Label rLabel;

    @FXML
    private Label i2Label;

    @FXML
    private Label pLabel;

    @FXML
    private TextField pcFireTextField;

    @FXML
    private TextField hmFireTextField;

    @FXML
    private ToggleButton destroyer1;

    @FXML
    private ToggleButton destroyer2;

    @FXML
    private ToggleButton destroyer3;

    @FXML
    private ToggleButton A4;

    @FXML
    private ToggleButton A5;

    @FXML
    private ToggleButton A6;

    @FXML
    private ToggleButton A7;

    @FXML
    private ToggleButton A8;

    @FXML
    private ToggleButton A9;

    @FXML
    private ToggleButton A10;

    @FXML
    private ToggleButton A11;

    @FXML
    private ToggleButton A12;

    @FXML
    private ToggleButton A13;

    @FXML
    private ToggleButton A14;

    @FXML
    private ToggleButton A15;

    @FXML
    private ToggleButton A16;

    @FXML
    private ToggleButton A17;

    @FXML
    private ToggleButton A19;

    @FXML
    private ToggleButton A20;

    @FXML
    private ToggleButton B1;

    @FXML
    private ToggleButton B2;

    @FXML
    private ToggleButton B3;

    @FXML
    private ToggleButton B4;

    @FXML
    private ToggleButton B5;

    @FXML
    private ToggleButton B6;

    @FXML
    private ToggleButton B7;

    @FXML
    private ToggleButton B8;

    @FXML
    private ToggleButton B9;

    @FXML
    private ToggleButton B10;

    @FXML
    private ToggleButton B11;

    @FXML
    private ToggleButton B12;

    @FXML
    private ToggleButton B13;

    @FXML
    private ToggleButton B14;

    @FXML
    private ToggleButton B16;

    @FXML
    private ToggleButton B17;

    @FXML
    private ToggleButton B19;

    @FXML
    private ToggleButton B20;

    @FXML
    private ToggleButton C1;

    @FXML
    private ToggleButton C2;

    @FXML
    private ToggleButton C3;

    @FXML
    private ToggleButton C4;

    @FXML
    private ToggleButton cruiser1;

    @FXML
    private ToggleButton cruiser2;

    @FXML
    private ToggleButton cruiser3;

    @FXML
    private ToggleButton cruiser4;

    @FXML
    private ToggleButton C9;

    @FXML
    private ToggleButton C10;

    @FXML
    private ToggleButton C11;

    @FXML
    private ToggleButton C12;

    @FXML
    private ToggleButton C13;

    @FXML
    private ToggleButton C14;

    @FXML
    private ToggleButton C16;

    @FXML
    private ToggleButton C17;

    @FXML
    private ToggleButton C19;

    @FXML
    private ToggleButton C20;

    @FXML
    private ToggleButton D1;

    @FXML
    private ToggleButton D2;

    @FXML
    private ToggleButton D3;

    @FXML
    private ToggleButton D4;

    @FXML
    private ToggleButton D5;

    @FXML
    private ToggleButton D6;

    @FXML
    private ToggleButton D7;

    @FXML
    private ToggleButton D8;

    @FXML
    private ToggleButton D9;

    @FXML
    private ToggleButton D10;

    @FXML
    private ToggleButton D11;

    @FXML
    private ToggleButton D12;

    @FXML
    private ToggleButton D13;

    @FXML
    private ToggleButton D14;

    @FXML
    private ToggleButton D16;

    @FXML
    private ToggleButton D17;

    @FXML
    private ToggleButton D18;

    @FXML
    private ToggleButton D19;

    @FXML
    private ToggleButton D20;

    @FXML
    private ToggleButton E1;

    @FXML
    private ToggleButton E2;

    @FXML
    private ToggleButton E3;

    @FXML
    private ToggleButton E4;

    @FXML
    private ToggleButton E5;

    @FXML
    private ToggleButton E6;

    @FXML
    private ToggleButton battleship1;

    @FXML
    private ToggleButton E8;

    @FXML
    private ToggleButton E9;

    @FXML
    private ToggleButton E10;

    @FXML
    private ToggleButton E11;

    @FXML
    private ToggleButton E12;

    @FXML
    private ToggleButton E13;

    @FXML
    private ToggleButton E14;

    @FXML
    private ToggleButton E15;

    @FXML
    private ToggleButton E16;

    @FXML
    private ToggleButton E17;

    @FXML
    private ToggleButton E18;

    @FXML
    private ToggleButton E19;

    @FXML
    private ToggleButton E20;

    @FXML
    private ToggleButton patrolBoat1;

    @FXML
    private ToggleButton F2;

    @FXML
    private ToggleButton F3;

    @FXML
    private ToggleButton F4;

    @FXML
    private ToggleButton F5;

    @FXML
    private ToggleButton F6;

    @FXML
    private ToggleButton battleship2;

    @FXML
    private ToggleButton F8;

    @FXML
    private ToggleButton F9;

    @FXML
    private ToggleButton F10;

    @FXML
    private ToggleButton F11;

    @FXML
    private ToggleButton F12;

    @FXML
    private ToggleButton F13;

    @FXML
    private ToggleButton F14;

    @FXML
    private ToggleButton F16;

    @FXML
    private ToggleButton F17;

    @FXML
    private ToggleButton F19;

    @FXML
    private ToggleButton F20;

    @FXML
    private ToggleButton patrolBoat2;

    @FXML
    private ToggleButton G2;

    @FXML
    private ToggleButton G3;

    @FXML
    private ToggleButton G4;

    @FXML
    private ToggleButton G5;

    @FXML
    private ToggleButton G6;

    @FXML
    private ToggleButton battleship3;

    @FXML
    private ToggleButton G8;

    @FXML
    private ToggleButton G9;

    @FXML
    private ToggleButton G10;

    @FXML
    private ToggleButton G11;

    @FXML
    private ToggleButton G12;

    @FXML
    private ToggleButton G14;

    @FXML
    private ToggleButton G16;

    @FXML
    private ToggleButton G17;

    @FXML
    private ToggleButton G19;

    @FXML
    private ToggleButton G20;

    @FXML
    private ToggleButton H1;

    @FXML
    private ToggleButton H2;

    @FXML
    private ToggleButton H3;

    @FXML
    private ToggleButton H4;

    @FXML
    private ToggleButton H5;

    @FXML
    private ToggleButton H6;

    @FXML
    private ToggleButton H7;

    @FXML
    private ToggleButton H8;

    @FXML
    private ToggleButton H9;

    @FXML
    private ToggleButton H10;

    @FXML
    private ToggleButton H11;

    @FXML
    private ToggleButton H12;

    @FXML
    private ToggleButton H14;

    @FXML
    private ToggleButton H16;

    @FXML
    private ToggleButton H17;

    @FXML
    private ToggleButton H19;

    @FXML
    private ToggleButton H20;

    @FXML
    private ToggleButton I1;

    @FXML
    private ToggleButton I2;

    @FXML
    private ToggleButton I3;

    @FXML
    private ToggleButton I4;

    @FXML
    private ToggleButton I5;

    @FXML
    private ToggleButton I6;

    @FXML
    private ToggleButton I7;

    @FXML
    private ToggleButton I8;

    @FXML
    private ToggleButton I9;

    @FXML
    private ToggleButton I10;

    @FXML
    private ToggleButton I11;

    @FXML
    private ToggleButton I12;

    @FXML
    private ToggleButton I13;

    @FXML
    private ToggleButton I14;

    @FXML
    private ToggleButton I16;

    @FXML
    private ToggleButton I17;

    @FXML
    private ToggleButton I19;

    @FXML
    private ToggleButton I20;

    @FXML
    private ToggleButton J1;

    @FXML
    private ToggleButton J2;

    @FXML
    private ToggleButton J3;

    @FXML
    private ToggleButton J4;

    @FXML
    private ToggleButton J5;

    @FXML
    private ToggleButton J11;

    @FXML
    private ToggleButton J12;

    @FXML
    private ToggleButton J13;

    @FXML
    private ToggleButton J14;

    @FXML
    private ToggleButton J15;

    @FXML
    private ToggleButton J16;

    @FXML
    private ToggleButton J17;

    @FXML
    private ToggleButton J19;

    @FXML
    private ToggleButton J20;

    @FXML
    private ToggleButton aircraft1;

    @FXML
    private ToggleButton aircraft2;

    @FXML
    private ToggleButton aircraft3;

    @FXML
    private ToggleButton aircraft4;

    @FXML
    private ToggleButton aircraft5;

    @FXML
    private ToggleButton playerPatrol1;

    @FXML
    private ToggleButton playerPatrol2;

    @FXML
    private ToggleButton playerDestroyer1;

    @FXML
    private ToggleButton playerDestroyer2;

    @FXML
    private ToggleButton playerDestroyer3;

    @FXML
    private ToggleButton playerCruiser1;

    @FXML
    private ToggleButton playerCruiser2;

    @FXML
    private ToggleButton playerCruiser3;

    @FXML
    private ToggleButton playerCruiser4;

    @FXML
    private ToggleButton playerBattleship1;

    @FXML
    private ToggleButton playerBattleship2;

    @FXML
    private ToggleButton playerBattleship3;

    @FXML
    private ToggleButton playerAircraft1;

    @FXML
    private ToggleButton playerAircraft2;

    @FXML
    private ToggleButton playerAircraft3;

    @FXML
    private ToggleButton playerAircraft4;

    @FXML
    private ToggleButton playerAircraft5;

    @FXML
    private Label play;

    @FXML
    private Label again;

    @FXML
    private TextField playAgainTextField;

    @FXML
    private TextField fireTextField;

    // Initialize two counters, one for the player and one for the computer.
    // Each increments after a successful hit.
    static int winCounter = 0;
    static int pcWinCounter = 0;

    @FXML
    public void enterButtonPressed(ActionEvent actionEvent) {
        enterTextField.setText("");
        shipPositions.removeAll(computerShipPositions);
        computerShipPositions.addAll(shipPositions);
        shipPositionsCom.removeAll(playerShipPositions);
        playerShipPositions.addAll(shipPositionsCom);
        finishGame();
    }

    @FXML
    private void fireButtonPressed(ActionEvent actionEvent) {
        playerTurn();
    }

    @FXML
    public void onEnter(ActionEvent event) {
        playerTurn();
    }

    private void hitMark() {
        //If the entered move is a Hit, change the hmFireTextField to "HIT!"
        //Update the hmFireTextField text-fill and background-color
        //Increment the winCounter by 1
        hmFireTextField.setText("HIT!");
        hmFireTextField.setStyle("-fx-text-fill: red; -fx-background-color: teal;");
        winCounter += 1;
        checkWinner();
    }

    private void hitMarkCom() {
        // the entered move is a Hit, change the hmFireTextField to "HIT!"
        //Update the hmFireTextField text-fill and background-color
        //Increment the pcWinCounter by 1
        pcFireTextField.setText("HIT!");
        pcFireTextField.setStyle("-fx-text-fill: red; -fx-background-color: teal;");
        pcWinCounter += 1;
        checkWinnerCom();
    }

    private void missAction() {
        //Update the hmFireTextField to say "MISS!"
        //Execute computerTurn()
        //Request focus places the cursor back into the fireTextField for the players next move
        hmFireTextField.setText("MISS!");
        hmFireTextField.setStyle("-fx-text-fill: blue; -fx-background-color: teal;");
        computerTurn();
    }

    private void missActionCom() {
        //Update the hmFireTextField to say "MISS!"
        //Execute computerTurn()
        //Request focus places the cursor back into the fireTextField for the players next move
        pcFireTextField.setText("MISS!");
        pcFireTextField.setStyle("-fx-text-fill: blue; -fx-background-color: teal;");
        fireTextField.clear();
        fireTextField.requestFocus();
        fireTextField.end();
    }

    // Replenishes List
    List<String> shipPositions = new ArrayList<>(Arrays.asList(
        "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10",
        "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10",
        "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10",
        "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10",
        "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10",
        "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10",
        "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10",
        "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10",
        "I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10",
        "J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10"));

    // Makes a list of all possible moves on the player's side of the board
    List<String> computerShipPositions = new ArrayList<>(Arrays.asList(
        "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10",
        "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10",
        "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10",
        "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10",
        "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10",
        "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10",
        "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10",
        "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10",
        "I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10",
        "J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10"));

    private void playerTurn() {
        String hit = fireTextField.getText().toUpperCase();
        // Takes user input, then if it was a hit, changes that spot's background to red
        // These are all the ship locations
        for (String boardPosition : computerShipPositions) {
            if (boardPosition.equals(hit)) {
                switch (hit) {
                    case "J6" -> {
                        aircraft1.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("J6"));
                        hitMark();
                    }
                    case "J7" -> {
                        aircraft2.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("J7"));
                        hitMark();
                    }
                    case "J8" -> {
                        aircraft3.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("J8"));
                        hitMark();
                    }
                    case "J9" -> {
                        aircraft4.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("J9"));
                        hitMark();
                    }
                    case "J10" -> {
                        aircraft5.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("J10"));
                        hitMark();
                    }

                    case "F1" -> {
                        patrolBoat1.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("F1"));
                        hitMark();
                    }
                    case "G1" -> {
                        patrolBoat2.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("G1"));
                        hitMark();
                    }
                    case "A1" -> {
                        destroyer1.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("A1"));
                        hitMark();
                    }
                    case "A2" -> {
                        destroyer2.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("A2"));
                        hitMark();
                    }
                    case "A3" -> {
                        destroyer3.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("A3"));
                        hitMark();
                    }
                    case "C5" -> {
                        cruiser1.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("C5"));
                        hitMark();
                    }
                    case "C6" -> {
                        cruiser2.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("C6"));
                        hitMark();
                    }
                    case "C7" -> {
                        cruiser3.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("C7"));
                        hitMark();
                    }
                    case "C8" -> {
                        cruiser4.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("C8"));
                        hitMark();
                    }
                    case "E7" -> {
                        battleship1.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("E7"));
                        hitMark();
                    }
                    case "F7" -> {
                        battleship2.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("F7"));
                        hitMark();
                    }
                    case "G7" -> {
                        battleship3.setStyle("-fx-background-color: red;");
                        computerShipPositions.removeIf(pos -> pos.contains("G7"));
                        hitMark();
                    }

                    // Here are the all the locations that do not have a ship
                    // Column A
                    case "A4" -> {
                        A4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("A4"));
                        missAction();
                    }
                    case "A5" -> {
                        A5.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("A5"));
                        missAction();
                    }
                    case "A6" -> {
                        A6.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("A6"));
                        missAction();
                    }
                    case "A7" -> {
                        A7.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("A7"));
                        missAction();
                    }
                    case "A8" -> {
                        A8.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("A8"));
                        missAction();
                    }
                    case "A9" -> {
                        A9.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("A9"));
                        missAction();
                    }
                    case "A10" -> {
                        A10.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("A10"));
                        missAction();
                    }

                    // Column B
                    case "B1" -> {
                        B1.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B1"));
                        missAction();
                    }
                    case "B2" -> {
                        B2.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B2"));
                        missAction();
                    }
                    case "B3" -> {
                        B3.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B3"));
                        missAction();
                    }
                    case "B4" -> {
                        B4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B4"));
                        missAction();
                    }
                    case "B5" -> {
                        B5.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B5"));
                        missAction();
                    }
                    case "B6" -> {
                        B6.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B6"));
                        missAction();
                    }
                    case "B7" -> {
                        B7.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B7"));
                        missAction();
                    }
                    case "B8" -> {
                        B8.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B8"));
                        missAction();
                    }
                    case "B9" -> {
                        B9.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B9"));
                        missAction();
                    }
                    case "B10" -> {
                        B10.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("B10"));
                        missAction();
                    }

                    // Column C
                    case "C1" -> {
                        C1.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("C1"));
                        missAction();
                    }
                    case "C2" -> {
                        C2.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("C2"));
                        missAction();
                    }
                    case "C3" -> {
                        C3.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("C3"));
                        missAction();
                    }
                    case "C4" -> {
                        C4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("C4"));
                        missAction();
                    }
                    case "C9" -> {
                        C9.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("C9"));
                        missAction();
                    }
                    case "C10" -> {
                        C10.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("C10"));
                        missAction();
                    }

                    // Column D
                    case "D1" -> {
                        D1.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D1"));
                        missAction();
                    }
                    case "D2" -> {
                        D2.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D2"));
                        missAction();
                    }
                    case "D3" -> {
                        D3.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D3"));
                        missAction();
                    }
                    case "D4" -> {
                        D4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D4"));
                        missAction();
                    }
                    case "D5" -> {
                        D5.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D5"));
                        missAction();
                    }
                    case "D6" -> {
                        D6.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D6"));
                        missAction();
                    }
                    case "D7" -> {
                        D7.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D7"));
                        missAction();
                    }
                    case "D8" -> {
                        D8.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D8"));
                        missAction();
                    }
                    case "D9" -> {
                        D9.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D9"));
                        missAction();
                    }
                    case "D10" -> {
                        D10.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("D10"));
                        missAction();
                    }

                    // Column E
                    case "E1" -> {
                        E1.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("E1"));
                        missAction();
                    }
                    case "E2" -> {
                        E2.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("E2"));
                        missAction();
                    }
                    case "E3" -> {
                        E3.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("E3"));
                        missAction();
                    }
                    case "E4" -> {
                        E4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("E4"));
                        missAction();
                    }
                    case "E5" -> {
                        E5.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("E5"));
                        missAction();
                    }
                    case "E6" -> {
                        E6.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("E6"));
                        missAction();
                    }
                    case "E8" -> {
                        E8.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("E8"));
                        missAction();
                    }
                    case "E9" -> {
                        E9.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("E9"));
                        missAction();
                    }
                    case "E10" -> {
                        E10.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("F10"));
                        missAction();
                    }

                    // Column F
                    case "F2" -> {
                        F2.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("F2"));
                        missAction();
                    }
                    case "F3" -> {
                        F3.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("F3"));
                        missAction();
                    }
                    case "F4" -> {
                        F4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("F4"));
                        missAction();
                    }
                    case "F5" -> {
                        F5.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("F5"));
                        missAction();
                    }
                    case "F6" -> {
                        F6.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("F6"));
                        missAction();
                    }
                    case "F8" -> {
                        F8.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("F8"));
                        missAction();
                    }
                    case "F9" -> {
                        F9.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("F9"));
                        missAction();
                    }
                    case "F10" -> {
                        F10.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("F10"));
                        missAction();
                    }

                    // Column G
                    case "G2" -> {
                        G2.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("G2"));
                        missAction();
                    }
                    case "G3" -> {
                        G3.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("G3"));
                        missAction();
                    }
                    case "G4" -> {
                        G4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("G4"));
                        missAction();
                    }
                    case "G5" -> {
                        G5.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("G5"));
                        missAction();
                    }
                    case "G6" -> {
                        G6.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("G6"));
                        missAction();
                    }
                    case "G8" -> {
                        G8.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("G8"));
                        missAction();
                    }
                    case "G9" -> {
                        G9.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("G9"));
                        missAction();
                    }
                    case "G10" -> {
                        G10.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("G10"));
                        missAction();
                    }

                    // Column H
                    case "H1" -> {
                        H1.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H1"));
                        missAction();
                    }
                    case "H2" -> {
                        H2.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H2"));
                        missAction();
                    }
                    case "H3" -> {
                        H3.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H3"));
                        missAction();
                    }
                    case "H4" -> {
                        H4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H4"));
                        missAction();
                    }
                    case "H5" -> {
                        H5.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H5"));
                        missAction();
                    }
                    case "H6" -> {
                        H6.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H6"));
                        missAction();
                    }
                    case "H7" -> {
                        H7.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H7"));
                        missAction();
                    }
                    case "H8" -> {
                        H8.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H8"));
                        missAction();
                    }
                    case "H9" -> {
                        H9.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H9"));
                        missAction();
                    }
                    case "H10" -> {
                        H10.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("H10"));
                        missAction();
                    }

                    // Column I
                    case "I1" -> {
                        I1.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I1"));
                        missAction();
                    }
                    case "I2" -> {
                        I2.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I2"));
                        missAction();
                    }
                    case "I3" -> {
                        I3.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I3"));
                        missAction();
                    }
                    case "I4" -> {
                        I4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I4"));
                        missAction();
                    }
                    case "I5" -> {
                        I5.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I5"));
                        missAction();
                    }
                    case "I6" -> {
                        I6.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I6"));
                        missAction();
                    }
                    case "I7" -> {
                        I7.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I7"));
                        missAction();
                    }
                    case "I8" -> {
                        I8.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I8"));
                        missAction();
                    }
                    case "I9" -> {
                        I9.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I9"));
                        missAction();
                    }
                    case "I10" -> {
                        I10.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("I10"));
                        missAction();
                    }

                    // Column J
                    case "J1" -> {
                        J1.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("J1"));
                        missAction();
                    }
                    case "J2" -> {
                        J2.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("J2"));
                        missAction();
                    }
                    case "J3" -> {
                        J3.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("J3"));
                        missAction();
                    }
                    case "J4" -> {
                        J4.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("J4"));
                        missAction();
                    }
                    case "J5" -> {
                        J5.setStyle("-fx-background-color: blue;");
                        computerShipPositions.removeIf(pos -> pos.contains("J5"));
                        missAction();
                    }
                }
            } else {
                hmFireTextField.setText("Invalid Position");
                checkWinnerCom();
            }
        }
    }


    // end player turn

    // replenishes ship positions
    List<String> shipPositionsCom = new ArrayList<>(Arrays.asList(
        "A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20",
        "B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20",
        "C11", "C12", "C13", "C14", "C15", "C16", "C17", "C18", "C19", "C20",
        "D11", "D12", "D13", "D14", "D15", "D16", "D17", "D18", "D19", "D20",
        "E11", "E12", "E13", "E14", "E15", "E16", "E17", "E18", "E19", "E20",
        "F11", "F12", "F13", "F14", "F15", "F16", "F17", "F18", "F19", "F20",
        "G11", "G12", "G13", "G14", "G15", "G16", "G17", "G18", "G19", "G20",
        "H11", "H12", "H13", "H14", "H15", "H16", "H17", "H18", "H19", "H20",
        "I11", "I12", "I13", "I14", "I15", "I16", "I17", "I18", "I19", "I20",
        "J11", "J12", "J13", "J14", "J15", "J16", "J17", "J18", "J19", "J20"));

    // Makes a list of all possible moves on the player's side of the board
    List<String> playerShipPositions = new ArrayList<>(Arrays.asList(
        "A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20",
        "B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20",
        "C11", "C12", "C13", "C14", "C15", "C16", "C17", "C18", "C19", "C20",
        "D11", "D12", "D13", "D14", "D15", "D16", "D17", "D18", "D19", "D20",
        "E11", "E12", "E13", "E14", "E15", "E16", "E17", "E18", "E19", "E20",
        "F11", "F12", "F13", "F14", "F15", "F16", "F17", "F18", "F19", "F20",
        "G11", "G12", "G13", "G14", "G15", "G16", "G17", "G18", "G19", "G20",
        "H11", "H12", "H13", "H14", "H15", "H16", "H17", "H18", "H19", "H20",
        "I11", "I12", "I13", "I14", "I15", "I16", "I17", "I18", "I19", "I20",
        "J11", "J12", "J13", "J14", "J15", "J16", "J17", "J18", "J19", "J20"));

    private void computerTurn() {
        //Generates a random move from a spot that is in the list of playerShipPositions
        //After the move is made, that spot is removed from the list so the move can only be made once
        int random = new Random().nextInt(playerShipPositions.size());
        String computerHit = playerShipPositions.get(random);
        if (playerShipPositions.size() > 1) {
            switch (computerHit) {
                case "G13" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("G13"));
                    playerPatrol1.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "H13" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("H13"));
                    playerPatrol2.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "B15" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("B15"));
                    playerDestroyer1.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "C15" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("C15"));
                    playerDestroyer2.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "D15" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("D15"));
                    playerDestroyer3.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "F15" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("F15"));
                    playerCruiser1.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "G15" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("G15"));
                    playerCruiser2.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "H15" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("H15"));
                    playerCruiser3.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "I15" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("I15"));
                    playerCruiser4.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "A18" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("A18"));
                    playerBattleship1.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "B18" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("B18"));
                    playerBattleship2.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "C18" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("C18"));
                    playerBattleship3.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "F18" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("F18"));
                    playerAircraft1.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "G18" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("G18"));
                    playerAircraft2.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "H18" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("H18"));
                    playerAircraft3.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "I18" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("I18"));
                    playerAircraft4.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }
                case "J18" -> {
                    playerShipPositions.removeIf(pos -> pos.contains("J18"));
                    playerAircraft5.setStyle("-fx-background-color: red;");
                    hitMarkCom();
                }

                //these are all the possible misses
                //Column A
                case "A11" -> {
                    A11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("A11"));
                    missActionCom();
                }
                case "A12" -> {
                    A12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("A12"));
                    missActionCom();
                }
                case "A13" -> {
                    A13.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("A13"));
                    missActionCom();
                }
                case "A14" -> {
                    A14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("A14"));
                    missActionCom();
                }
                case "A15" -> {
                    A15.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("A15"));
                    missActionCom();
                }
                case "A16" -> {
                    A16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("A16"));
                    missActionCom();
                }
                case "A17" -> {
                    A17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("A17"));
                    missActionCom();
                }
                case "A19" -> {
                    A19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("A19"));
                    missActionCom();
                }
                case "A20" -> {
                    A20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("A20"));
                    missActionCom();
                }

                // Column B
                case "B11" -> {
                    B11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("B11"));
                    missActionCom();
                }
                case "B12" -> {
                    B12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("B12"));
                    missActionCom();
                }
                case "B13" -> {
                    B13.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("B13"));
                    missActionCom();
                }
                case "B14" -> {
                    B14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("B14"));
                    missActionCom();
                }
                case "B16" -> {
                    B16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("B16"));
                    missActionCom();
                }
                case "B17" -> {
                    B17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("B17"));
                    missActionCom();
                }
                case "B19" -> {
                    B19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("B19"));
                    missActionCom();
                }
                case "B20" -> {
                    B20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("B20"));
                    missActionCom();
                }

                // Column C
                case "C11" -> {
                    C11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("C11"));
                    missActionCom();
                }
                case "C12" -> {
                    C12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("C12"));
                    missActionCom();
                }
                case "C13" -> {
                    C13.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("C13"));
                    missActionCom();
                }
                case "C14" -> {
                    C14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("C14"));
                    missActionCom();
                }
                case "C16" -> {
                    C16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("C16"));
                    missActionCom();
                }
                case "C17" -> {
                    C17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("C17"));
                    missActionCom();
                }
                case "C19" -> {
                    C19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("C19"));
                    missActionCom();
                }
                case "C20" -> {
                    C20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("C20"));
                    missActionCom();
                }

                // Column D
                case "D11" -> {
                    D11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("D11"));
                    missActionCom();
                }
                case "D12" -> {
                    D12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("D12"));
                    missActionCom();
                }
                case "D13" -> {
                    D13.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("D13"));
                    missActionCom();
                }
                case "D14" -> {
                    D14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("D14"));
                    missActionCom();
                }
                case "D16" -> {
                    D16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("D16"));
                    missActionCom();
                }
                case "D17" -> {
                    D17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("D17"));
                    missActionCom();
                }
                case "D19" -> {
                    D19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("D19"));
                    missActionCom();
                }
                case "D20" -> {
                    D20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("D20"));
                    missActionCom();
                }

                // Column E
                case "E11" -> {
                    E11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("E11"));
                    missActionCom();
                }
                case "E12" -> {
                    E12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("E12"));
                    missActionCom();
                }
                case "E13" -> {
                    E13.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("313"));
                    missActionCom();
                }
                case "E14" -> {
                    E14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("E14"));
                    missActionCom();
                }
                case "E15" -> {
                    E15.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("E15"));
                    missActionCom();
                }
                case "E16" -> {
                    E16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("E16"));
                    missActionCom();
                }
                case "E17" -> {
                    E17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("E17"));
                    missActionCom();
                }
                case "E18" -> {
                    E18.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("E18"));
                    missActionCom();
                }
                case "E19" -> {
                    E19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("E19"));
                    missActionCom();
                }
                case "E20" -> {
                    E20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("E20"));
                    missActionCom();
                }

                // Column F
                case "F11" -> {
                    F11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("F11"));
                    missActionCom();
                }
                case "F12" -> {
                    F12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("F12"));
                    missActionCom();
                }
                case "F13" -> {
                    F13.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("F13"));
                    missActionCom();
                }
                case "F14" -> {
                    F14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("F14"));
                    missActionCom();
                }
                case "F16" -> {
                    F16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("F16"));
                    missActionCom();
                }
                case "F17" -> {
                    F17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("F17"));
                    missActionCom();
                }
                case "F19" -> {
                    F19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("F19"));
                    missActionCom();
                }
                case "F20" -> {
                    F20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("F20"));
                    missActionCom();
                }

                // Column G
                case "G11" -> {
                    G11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("G11"));
                    missActionCom();
                }
                case "G12" -> {
                    G12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("G12"));
                    missActionCom();
                }
                case "G14" -> {
                    G14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("G14"));
                    missActionCom();
                }
                case "G16" -> {
                    G16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("G16"));
                    missActionCom();
                }
                case "G17" -> {
                    G17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("G17"));
                    missActionCom();
                }
                case "G19" -> {
                    G19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("G19"));
                    missActionCom();
                }
                case "G20" -> {
                    G20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("G20"));
                    missActionCom();
                }

                // Column H
                case "H11" -> {
                    H11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("H11"));
                    missActionCom();
                }
                case "H12" -> {
                    H12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("H12"));
                    missActionCom();
                }
                case "H14" -> {
                    H14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("H14"));
                    missActionCom();
                }
                case "H16" -> {
                    H16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("H16"));
                    missActionCom();
                }
                case "H17" -> {
                    H17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("H17"));
                    missActionCom();
                }
                case "H19" -> {
                    H19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("H19"));
                    missActionCom();
                }
                case "H20" -> {
                    H20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("H20"));
                    missActionCom();
                }

                // Column I
                case "I11" -> {
                    I11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("I11"));
                    missActionCom();
                }
                case "I12" -> {
                    I12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("I12"));
                    missActionCom();
                }
                case "I13" -> {
                    I13.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("I13"));
                    missActionCom();
                }
                case "I14" -> {
                    I14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("I14"));
                    missActionCom();
                }
                case "I16" -> {
                    I16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("I16"));
                    missActionCom();
                }
                case "I17" -> {
                    I17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("I17"));
                    missActionCom();
                }
                case "I19" -> {
                    I19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("I19"));
                    missActionCom();
                }
                case "I20" -> {
                    I20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("I20"));
                    missActionCom();
                }

                // Column J
                case "J11" -> {
                    J11.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("J11"));
                    missActionCom();
                }
                case "J12" -> {
                    J12.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("J12"));
                    missActionCom();
                }
                case "J13" -> {
                    J13.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("J13"));
                    missActionCom();
                }
                case "J14" -> {
                    J14.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("J14"));
                    missActionCom();
                }
                case "J15" -> {
                    J15.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("J15"));
                    missActionCom();
                }
                case "J16" -> {
                    J16.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("J16"));
                    missActionCom();
                }
                case "J17" -> {
                    J17.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("J17"));
                    missActionCom();
                }
                case "J19" -> {
                    J19.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("J19"));
                    missActionCom();
                }
                case "J20" -> {
                    J20.setStyle("-fx-background-color: blue;");
                    playerShipPositions.removeIf(pos -> pos.contains("J20"));
                    missActionCom();
                }
            }
        }
    }

    // end computer turn

    private void checkWinner () {
        //If the player has scored 17 hits, the game exits and displays the Winner message
        if (winCounter == 17) {
            bLabel.setText("");
            aLabel.setText("");
            wLabel.setText("W");
            wLabel.setStyle("-fx-text-fill: #5ddd70; -fx-background-color: black;");
            iLabel.setText("I");
            iLabel.setStyle("-fx-text-fill: #5ddd70; -fx-background-color: black;");
            nLabel.setText("N");
            nLabel.setStyle("-fx-text-fill: #5ddd70; -fx-background-color: black;");
            n2Label.setText("N");
            n2Label.setStyle("-fx-text-fill: #5ddd70; -fx-background-color: black;");
            eLabel.setText("E");
            eLabel.setStyle("-fx-text-fill: #5ddd70; -fx-background-color: black;");
            rLabel.setText("R");
            rLabel.setStyle("-fx-text-fill: #5ddd70; -fx-background-color: black;");
            i2Label.setText("");
            pLabel.setText("");
            finishGame();
        } else {
            //The player has not won yet, so the game continues
            computerTurn();
        }
    }

    private void checkWinnerCom () {
        //If the computer has scored 17 hits, the game exits and displays the Winner message
        if (pcWinCounter == 17) {
            bLabel.setText("");
            aLabel.setText("");
            wLabel.setText("D");
            wLabel.setStyle("-fx-text-fill: red; -fx-background-color: black;");
            iLabel.setText("E");
            iLabel.setStyle("-fx-text-fill: red; -fx-background-color: black;");
            nLabel.setText("F");
            nLabel.setStyle("-fx-text-fill: red; -fx-background-color: black;");
            n2Label.setText("E");
            n2Label.setStyle("-fx-text-fill: red; -fx-background-color: black;");
            eLabel.setText("A");
            eLabel.setStyle("-fx-text-fill: red; -fx-background-color: black;");
            rLabel.setText("T");
            rLabel.setStyle("-fx-text-fill: red; -fx-background-color: black;");
            i2Label.setText("");
            pLabel.setText("");
            finishGame();
        } else {
            //The Computer has not won yet, so the game continues
            fireTextField.clear();
            fireTextField.requestFocus();
            fireTextField.end();
        }
    }

    public void finishGame() {
        //Prompt the player to choose whether to play again or exit the program
        //If yes, the gameBoard resets
        //If no, the program exits
        playAgainTextField.requestFocus();
        playAgainTextField.end();
        fireTextField.setDisable(true);
        play.setText("Play");
        again.setText("Again?");
        play.setStyle("-fx-text-fill: green; -fx-background-color: black;");
        again.setStyle("-fx-text-fill: green; -fx-background-color: black;");
        enterTextField.setText("Enter");
        enterTextField.setStyle("-fx-text-fill: green; -fx-background-color: grey;");
        playAgainTextField.setPromptText("Yes or No");
        playAgainTextField.setStyle("-fx-background-color: white;");

        String playAgain = playAgainTextField.getText().toUpperCase();
        if (playAgain.equals("YES") || playAgain.equals("Y")) {
            // CLEAR BOARD HERE
            winCounter = 0;
            pcWinCounter = 0;
            fireTextField.setDisable(false);
            fireTextField.clear();
            hmFireTextField.clear();
            pcFireTextField.clear();
            playAgainTextField.clear();
            enterTextField.clear();
            playAgainTextField.clear();
            wLabel.setText("");
            iLabel.setText("");
            nLabel.setText("");
            n2Label.setText("");
            eLabel.setText("");
            rLabel.setText("");
            play.setText("");
            again.setText("");
            playAgainTextField.setPromptText("");
            enterTextField.setStyle("-fx-background-color: black;");
            bLabel.setText("B");
            bLabel.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            aLabel.setText("A");
            aLabel.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            wLabel.setText("T");
            wLabel.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            iLabel.setText("T");
            iLabel.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            nLabel.setText("L");
            nLabel.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            n2Label.setText("E");
            n2Label.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            eLabel.setText("S");
            eLabel.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            rLabel.setText("H");
            rLabel.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            i2Label.setText("I");
            i2Label.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            pLabel.setText("P");
            pLabel.setStyle("-fx-text-fill: orange; -fx-background-color: black;");
            fireTextField.requestFocus();
            fireTextField.end();

            // Resets the entire A column
            playAgainTextField.setStyle("-fx-background-color: black;");
            destroyer1.setStyle("-fx-background-color: #37B6E4;");
            destroyer2.setStyle("-fx-background-color: #37B6E4;");
            destroyer3.setStyle("-fx-background-color: #37B6E4;");
            A4.setStyle("-fx-background-color: #37B6E4;");
            A5.setStyle("-fx-background-color: #37B6E4;");
            A6.setStyle("-fx-background-color: #37B6E4;");
            A7.setStyle("-fx-background-color: #37B6E4;");
            A8.setStyle("-fx-background-color: #37B6E4;");
            A9.setStyle("-fx-background-color: #37B6E4;");
            A10.setStyle("-fx-background-color: #37B6E4;");
            A11.setStyle("-fx-background-color: #37B6E4;");
            A12.setStyle("-fx-background-color: #37B6E4;");
            A13.setStyle("-fx-background-color: #37B6E4;");
            A14.setStyle("-fx-background-color: #37B6E4;");
            A15.setStyle("-fx-background-color: #37B6E4;");
            A16.setStyle("-fx-background-color: #37B6E4;");
            A17.setStyle("-fx-background-color: #37B6E4;");
            playerBattleship1.setStyle("-fx-background-color: grey;");
            A19.setStyle("-fx-background-color: #37B6E4;");
            A20.setStyle("-fx-background-color: #37B6E4;");

            //Resets the entire B column
            B1.setStyle("-fx-background-color: #37B6E4;");
            B2.setStyle("-fx-background-color: #37B6E4;");
            B3.setStyle("-fx-background-color: #37B6E4;");
            B4.setStyle("-fx-background-color: #37B6E4;");
            B5.setStyle("-fx-background-color: #37B6E4;");
            B6.setStyle("-fx-background-color: #37B6E4;");
            B7.setStyle("-fx-background-color: #37B6E4;");
            B8.setStyle("-fx-background-color: #37B6E4;");
            B9.setStyle("-fx-background-color: #37B6E4;");
            B10.setStyle("-fx-background-color: #37B6E4;");
            B11.setStyle("-fx-background-color: #37B6E4;");
            B12.setStyle("-fx-background-color: #37B6E4;");
            B13.setStyle("-fx-background-color: #37B6E4;");
            B14.setStyle("-fx-background-color: #37B6E4;");
            playerDestroyer1.setStyle("-fx-background-color: grey;");
            B16.setStyle("-fx-background-color: #37B6E4;");
            B17.setStyle("-fx-background-color: #37B6E4;");
            playerBattleship2.setStyle("-fx-background-color: grey;");
            B19.setStyle("-fx-background-color: #37B6E4;");
            B20.setStyle("-fx-background-color: #37B6E4;");

            //Resets the entire C column
            C1.setStyle("-fx-background-color: #37B6E4;");
            C2.setStyle("-fx-background-color: #37B6E4;");
            C3.setStyle("-fx-background-color: #37B6E4;");
            C4.setStyle("-fx-background-color: #37B6E4;");
            cruiser1.setStyle("-fx-background-color: #37B6E4;");
            cruiser2.setStyle("-fx-background-color: #37B6E4;");
            cruiser3.setStyle("-fx-background-color: #37B6E4;");
            cruiser4.setStyle("-fx-background-color: #37B6E4;");
            C9.setStyle("-fx-background-color: #37B6E4;");
            C10.setStyle("-fx-background-color: #37B6E4;");
            C11.setStyle("-fx-background-color: #37B6E4;");
            C12.setStyle("-fx-background-color: #37B6E4;");
            C13.setStyle("-fx-background-color: #37B6E4;");
            C14.setStyle("-fx-background-color: #37B6E4;");
            playerDestroyer2.setStyle("-fx-background-color: grey;");
            C16.setStyle("-fx-background-color: #37B6E4;");
            C17.setStyle("-fx-background-color: #37B6E4;");
            playerBattleship3.setStyle("-fx-background-color: grey;");
            C19.setStyle("-fx-background-color: #37B6E4;");
            C20.setStyle("-fx-background-color: #37B6E4;");

            //Resets the entire D column
            D1.setStyle("-fx-background-color: #37B6E4;");
            D2.setStyle("-fx-background-color: #37B6E4;");
            D3.setStyle("-fx-background-color: #37B6E4;");
            D4.setStyle("-fx-background-color: #37B6E4;");
            D5.setStyle("-fx-background-color: #37B6E4;");
            D6.setStyle("-fx-background-color: #37B6E4;");
            D7.setStyle("-fx-background-color: #37B6E4;");
            D8.setStyle("-fx-background-color: #37B6E4;");
            D9.setStyle("-fx-background-color: #37B6E4;");
            D10.setStyle("-fx-background-color: #37B6E4;");
            D11.setStyle("-fx-background-color: #37B6E4;");
            D12.setStyle("-fx-background-color: #37B6E4;");
            D13.setStyle("-fx-background-color: #37B6E4;");
            D14.setStyle("-fx-background-color: #37B6E4;");
            playerDestroyer3.setStyle("-fx-background-color: grey;");
            D16.setStyle("-fx-background-color: #37B6E4;");
            D17.setStyle("-fx-background-color: #37B6E4;");
            D18.setStyle("-fx-background-color: #37B6E4;");
            D19.setStyle("-fx-background-color: #37B6E4;");
            D20.setStyle("-fx-background-color: #37B6E4;");

            // Resets the entire E column
            E1.setStyle("-fx-background-color: #37B6E4;");
            E2.setStyle("-fx-background-color: #37B6E4;");
            E3.setStyle("-fx-background-color: #37B6E4;");
            E4.setStyle("-fx-background-color: #37B6E4;");
            E5.setStyle("-fx-background-color: #37B6E4;");
            E6.setStyle("-fx-background-color: #37B6E4;");
            battleship1.setStyle("-fx-background-color: #37B6E4;");
            E8.setStyle("-fx-background-color: #37B6E4;");
            E9.setStyle("-fx-background-color: #37B6E4;");
            E10.setStyle("-fx-background-color: #37B6E4;");
            E11.setStyle("-fx-background-color: #37B6E4;");
            E12.setStyle("-fx-background-color: #37B6E4;");
            E13.setStyle("-fx-background-color: #37B6E4;");
            E14.setStyle("-fx-background-color: #37B6E4;");
            E15.setStyle("-fx-background-color: #37B6E4;");
            E16.setStyle("-fx-background-color: #37B6E4;");
            E17.setStyle("-fx-background-color: #37B6E4;");
            E18.setStyle("-fx-background-color: #37B6E4;");
            E19.setStyle("-fx-background-color: #37B6E4;");
            E20.setStyle("-fx-background-color: #37B6E4;");

            // Resets the entire F column
            patrolBoat1.setStyle("-fx-background-color: #37B6E4;");
            F2.setStyle("-fx-background-color: #37B6E4;");
            F3.setStyle("-fx-background-color: #37B6E4;");
            F4.setStyle("-fx-background-color: #37B6E4;");
            F5.setStyle("-fx-background-color: #37B6E4;");
            F6.setStyle("-fx-background-color: #37B6E4;");
            battleship2.setStyle("-fx-background-color: #37B6E4;");
            F8.setStyle("-fx-background-color: #37B6E4;");
            F9.setStyle("-fx-background-color: #37B6E4;");
            F10.setStyle("-fx-background-color: #37B6E4;");
            F11.setStyle("-fx-background-color: #37B6E4;");
            F12.setStyle("-fx-background-color: #37B6E4;");
            F13.setStyle("-fx-background-color: #37B6E4;");
            F14.setStyle("-fx-background-color: #37B6E4;");
            playerCruiser1.setStyle("-fx-background-color: grey;");
            F16.setStyle("-fx-background-color: #37B6E4;");
            F17.setStyle("-fx-background-color: #37B6E4;");
            playerAircraft1.setStyle("-fx-background-color: grey;");
            F19.setStyle("-fx-background-color: #37B6E4;");
            F20.setStyle("-fx-background-color: #37B6E4;");

            // Resets the entire G column
            patrolBoat2.setStyle("-fx-background-color: #37B6E4;");
            G2.setStyle("-fx-background-color: #37B6E4;");
            G3.setStyle("-fx-background-color: #37B6E4;");
            G4.setStyle("-fx-background-color: #37B6E4;");
            G5.setStyle("-fx-background-color: #37B6E4;");
            G6.setStyle("-fx-background-color: #37B6E4;");
            battleship3.setStyle("-fx-background-color: #37B6E4;");
            G8.setStyle("-fx-background-color: #37B6E4;");
            G9.setStyle("-fx-background-color: #37B6E4;");
            G10.setStyle("-fx-background-color: #37B6E4;");
            G11.setStyle("-fx-background-color: #37B6E4;");
            G12.setStyle("-fx-background-color: #37B6E4;");
            playerPatrol1.setStyle("-fx-background-color: grey;");
            G14.setStyle("-fx-background-color: #37B6E4;");
            playerCruiser2.setStyle("-fx-background-color: grey;");
            G16.setStyle("-fx-background-color: #37B6E4;");
            G17.setStyle("-fx-background-color: #37B6E4;");
            playerAircraft2.setStyle("-fx-background-color: grey;");
            G19.setStyle("-fx-background-color: #37B6E4;");
            G20.setStyle("-fx-background-color: #37B6E4;");

            // Resets the entire H column
            H1.setStyle("-fx-background-color: #37B6E4;");
            H2.setStyle("-fx-background-color: #37B6E4;");
            H3.setStyle("-fx-background-color: #37B6E4;");
            H4.setStyle("-fx-background-color: #37B6E4;");
            H5.setStyle("-fx-background-color: #37B6E4;");
            H6.setStyle("-fx-background-color: #37B6E4;");
            H7.setStyle("-fx-background-color: #37B6E4;");
            H8.setStyle("-fx-background-color: #37B6E4;");
            H9.setStyle("-fx-background-color: #37B6E4;");
            H10.setStyle("-fx-background-color: #37B6E4;");
            H11.setStyle("-fx-background-color: #37B6E4;");
            H12.setStyle("-fx-background-color: #37B6E4;");
            playerPatrol2.setStyle("-fx-background-color: grey;");
            H14.setStyle("-fx-background-color: #37B6E4;");
            playerCruiser3.setStyle("-fx-background-color: grey;");
            H16.setStyle("-fx-background-color: #37B6E4;");
            H17.setStyle("-fx-background-color: #37B6E4;");
            playerAircraft3.setStyle("-fx-background-color: grey;");
            H19.setStyle("-fx-background-color: #37B6E4;");
            H20.setStyle("-fx-background-color: #37B6E4;");

            // Resets the entire I column
            I1.setStyle("-fx-background-color: #37B6E4;");
            I2.setStyle("-fx-background-color: #37B6E4;");
            I3.setStyle("-fx-background-color: #37B6E4;");
            I4.setStyle("-fx-background-color: #37B6E4;");
            I5.setStyle("-fx-background-color: #37B6E4;");
            I6.setStyle("-fx-background-color: #37B6E4;");
            I7.setStyle("-fx-background-color: #37B6E4;");
            I8.setStyle("-fx-background-color: #37B6E4;");
            I9.setStyle("-fx-background-color: #37B6E4;");
            I10.setStyle("-fx-background-color: #37B6E4;");
            I11.setStyle("-fx-background-color: #37B6E4;");
            I12.setStyle("-fx-background-color: #37B6E4;");
            I13.setStyle("-fx-background-color: #37B6E4;");
            I14.setStyle("-fx-background-color: #37B6E4;");
            playerCruiser4.setStyle("-fx-background-color: grey;");
            I16.setStyle("-fx-background-color: #37B6E4;");
            I17.setStyle("-fx-background-color: #37B6E4;");
            playerAircraft4.setStyle("-fx-background-color: grey;");
            I19.setStyle("-fx-background-color: #37B6E4;");
            I20.setStyle("-fx-background-color: #37B6E4;");

            // Resets the entire J column
            J1.setStyle("-fx-background-color: #37B6E4;");
            J2.setStyle("-fx-background-color: #37B6E4;");
            J3.setStyle("-fx-background-color: #37B6E4;");
            J4.setStyle("-fx-background-color: #37B6E4;");
            J5.setStyle("-fx-background-color: #37B6E4;");
            aircraft1.setStyle("-fx-background-color: #37B6E4;");
            aircraft2.setStyle("-fx-background-color: #37B6E4;");
            aircraft3.setStyle("-fx-background-color: #37B6E4;");
            aircraft4.setStyle("-fx-background-color: #37B6E4;");
            aircraft5.setStyle("-fx-background-color: #37B6E4;");
            J11.setStyle("-fx-background-color: #37B6E4;");
            J12.setStyle("-fx-background-color: #37B6E4;");
            J13.setStyle("-fx-background-color: #37B6E4;");
            J14.setStyle("-fx-background-color: #37B6E4;");
            J15.setStyle("-fx-background-color: #37B6E4;");
            J16.setStyle("-fx-background-color: #37B6E4;");
            J17.setStyle("-fx-background-color: #37B6E4;");
            playerAircraft5.setStyle("-fx-background-color: grey;");
            J19.setStyle("-fx-background-color: #37B6E4;");
            J20.setStyle("-fx-background-color: #37B6E4;");

        } else if (playAgain.equals("NO") || playAgain.equals("N")) {
            System.exit(0);
        } else {
            //If the user enters anything other than 'yes' or 'no' the user is prompted for input again
            finishGame();
        }
    }
}
