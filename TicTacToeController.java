// The class contains a private 3-by-3 two-dimensional array.
import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeController {

    private Position[][] board;

    public TicTacToeController() {
    }

    public TicTacToeController(Position[][] board) {
        this.board = board;
    }

    // Use construct to set the board elements to EMPTY.

    public static Board game = new Board(new Position[][] {
            {Position.EMPTY, Position.EMPTY, Position.EMPTY},
            {Position.EMPTY, Position.EMPTY, Position.EMPTY},
            {Position.EMPTY, Position.EMPTY, Position.EMPTY}
    });

    public void boardPositions() {
        System.out.println("Player Choices");
        System.out.println(" ");
        System.out.println("  1  " + "|" + "  2  " + "|" + "  3  ");
        System.out.println("  4  " + "|" + "  5  " + "|" + "  6  ");
        System.out.println("  7  " + "|" + "  8  " + "|" + "  9  ");
        System.out.println();
    }

    // Turn this into method named Board Positions
    public void currentBoard() {
        System.out.println("Current Board");
        System.out.println(" ");
        System.out.println("  " + game.board[0][0] + "  |  " + game.board[0][1] + "  |  " + game.board[0][2] + "  ");
        System.out.println("  " + game.board[1][0] + "  |  " + game.board[1][1] + "  |  " + game.board[1][2] + "  ");
        System.out.println("  " + game.board[2][0] + "  |  " + game.board[2][1] + "  |  " + game.board[2][2] + "  ");
        System.out.println();
    }

    int comCheck = 0;
    public void computerPlayerOption() {
        System.out.println(" ");
        int selectionCom = 0;
        Scanner inputScannerCom = new Scanner(System.in);
        do {
            System.out.println("Please select Manual Game(1) or Computer Game(2)");
            try {
                selectionCom = inputScannerCom.nextInt();
                if (selectionCom < 1 || selectionCom > 2) {
                    System.out.println("**Must be Yes(1) or No(2)\n");
                } else {
                    switch (selectionCom) {
                        case 1 -> {
                            boardPositions();
                            currentBoard();
                            playerXPick();
                        }
                        case 2 -> {
                            System.out.println("**Computer X player goes first\n");
                            comCheck += 1;
                            boardPositions();
                            currentBoard();
                            playerXCom();
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("**Must be Yes(1) or No(2)\n");
                inputScannerCom.next();
            }
        } while (selectionCom < 1 || selectionCom > 2);
            System.out.println(" ");
    }

// Computer X pick
    public void playerXCom() {
        Random random = new Random();
        int posCom = random.nextInt(10);
        switch (posCom) {
            case 1:
                if (game.board[0][0] == Position.EMPTY) {
                    game.board[0][0] = Position.X;
                    crisCrossX();
                } else {
                    playerXCom();
                }
                break;
            case 2:
                if (game.board[0][1] == Position.EMPTY) {
                    game.board[0][1] = Position.X;
                    crisCrossX();
                } else {
                    playerXCom();
                }
                break;
            case 3:
                if (game.board[0][2] == Position.EMPTY) {
                    game.board[0][2] = Position.X;
                    crisCrossX();
                } else {
                    playerXCom();
                }
                break;
            case 4:
                if (game.board[1][0] == Position.EMPTY) {
                    game.board[1][0] = Position.X;
                    crisCrossX();
                } else {
                    playerXCom();
                }
                break;
            case 5:
                if (game.board[1][1] == Position.EMPTY) {
                    game.board[1][1] = Position.X;
                    crisCrossX();
                } else {
                    playerXCom();
                }
                break;
            case 6:
                if (game.board[1][2] == Position.EMPTY) {
                    game.board[1][2] = Position.X;
                    crisCrossX();
                } else {
                    playerXCom();
                }
                break;
            case 7:
                if (game.board[2][0] == Position.EMPTY) {
                    game.board[2][0] = Position.X;
                    crisCrossX();
                } else {
                    playerXCom();
                }
                break;
            case 8:
                if (game.board[2][1] == Position.EMPTY) {
                    game.board[2][1] = Position.X;
                    crisCrossX();
                } else {
                    playerXCom();
                }
                break;
            case 9:
                if (game.board[2][2] == Position.EMPTY) {
                    game.board[2][2] = Position.X;
                    crisCrossX();
                } else {
                    playerXCom();
                }
                break;
        }
    }

    // player X pick
    public void playerXPick() {
        int positionX = 0;
        System.out.println("Player X - Your Turn");
        Scanner inputScanner1 = new Scanner(System.in);
        do {
            System.out.println("Pick an open position (1-9): ");
            try {
                positionX = inputScanner1.nextInt();
                if (positionX < 1 || positionX > 9) {
                    System.out.println("**Position must be 1-9\n");
                    System.out.println(" ");
                } else {
                    switch (positionX) {
                        case 1:
                            if (game.board[0][0] == Position.EMPTY) {
                                game.board[0][0] = Position.X;
                                crisCrossX();
                            } else {
                                System.out.println("**Position is taken");
                                playerXPick();
                            }
                            break;
                        case 2:
                            if (game.board[0][1] == Position.EMPTY) {
                                game.board[0][1] = Position.X;
                                crisCrossX();
                            } else {
                                System.out.println("**Position is taken");
                                playerXPick();
                            }
                            break;
                        case 3:
                            if (game.board[0][2] == Position.EMPTY) {
                                game.board[0][2] = Position.X;
                                crisCrossX();
                            } else {
                                System.out.println("**Position is taken");
                                playerXPick();
                            }
                            break;
                        case 4:
                            if (game.board[1][0] == Position.EMPTY) {
                                game.board[1][0] = Position.X;
                                crisCrossX();
                            } else {
                                System.out.println("**Position is taken");
                                playerXPick();
                            }
                            break;
                        case 5:
                            if (game.board[1][1] == Position.EMPTY) {
                                game.board[1][1] = Position.X;
                                crisCrossX();
                            } else {
                                System.out.println("**Position is taken");
                                playerXPick();
                            }
                            break;
                        case 6:
                            if (game.board[1][2] == Position.EMPTY) {
                                game.board[1][2] = Position.X;
                                crisCrossX();
                            } else {
                                System.out.println("**Position is taken");
                                playerXPick();
                            }
                            break;
                        case 7:
                            if (game.board[2][0] == Position.EMPTY) {
                                game.board[2][0] = Position.X;
                                crisCrossX();
                            } else {
                                System.out.println("**Position is taken");
                                playerXPick();
                            }
                            break;
                        case 8:
                            if (game.board[2][1] == Position.EMPTY) {
                                game.board[2][1] = Position.X;
                                crisCrossX();
                            } else {
                                System.out.println("**Position is taken");
                                playerXPick();
                            }
                            break;
                        case 9:
                            if (game.board[2][2] == Position.EMPTY) {
                                game.board[2][2] = Position.X;
                                crisCrossX();
                            } else {
                                System.out.println("**Position is taken");
                                playerXPick();
                            }
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("**Position must be 1-9\n");
                inputScanner1.next();
            }
        } while (positionX < 1 || positionX > 9);
        System.out.println(" ");
    }


    // player O pick
    public void playerOPick() {
        int positionO = 0;
        System.out.println("Player O - Your Turn");
        Scanner inputScanner2 = new Scanner(System.in);
        do {
            System.out.println("Pick an open position (1-9): ");
            try {
                positionO = inputScanner2.nextInt();
                if (positionO < 1 || positionO > 9) {
                    System.out.println("**Position must be 1-9\n");
                } else {
                    switch (positionO) {
                        case 1:
                            if (game.board[0][0] == Position.EMPTY) {
                                game.board[0][0] = Position.O;
                                crisCrossO();
                            } else {
                                System.out.println("**Position is taken");
                                playerOPick();
                            }
                            break;
                        case 2:
                            if (game.board[0][1] == Position.EMPTY) {
                                game.board[0][1] = Position.O;
                                crisCrossO();
                            } else {
                                System.out.println("**Position is taken");
                                playerOPick();
                            }
                            break;
                        case 3:
                            if (game.board[0][2] == Position.EMPTY) {
                                game.board[0][2] = Position.O;
                                crisCrossO();
                            } else {
                                System.out.println("**Position is taken");
                                playerOPick();
                            }
                            break;
                        case 4:
                            if (game.board[1][0] == Position.EMPTY) {
                                game.board[1][0] = Position.O;
                                crisCrossO();
                            } else {
                                System.out.println("**Position is taken");
                                playerOPick();
                            }
                            break;
                        case 5:
                            if (game.board[1][1] == Position.EMPTY) {
                                game.board[1][1] = Position.O;
                                crisCrossO();
                            } else {
                                System.out.println("**Position is taken");
                                playerOPick();
                            }
                            break;
                        case 6:
                            if (game.board[1][2] == Position.EMPTY) {
                                game.board[1][2] = Position.O;
                                crisCrossO();
                            } else {
                                System.out.println("**Position is taken");
                                playerOPick();
                            }
                            break;
                        case 7:
                            if (game.board[2][0] == Position.EMPTY) {
                                game.board[2][0] = Position.O;
                                crisCrossO();
                            } else {
                                System.out.println("**Position is taken");
                                playerOPick();
                            }
                            break;
                        case 8:
                            if (game.board[2][1] == Position.EMPTY) {
                                game.board[2][1] = Position.O;
                                crisCrossO();
                            } else {
                                System.out.println("**Position is taken");
                                playerOPick();
                            }
                            break;
                        case 9:
                            if (game.board[2][2] == Position.EMPTY) {
                                game.board[2][2] = Position.O;
                                crisCrossO();
                            } else {
                                System.out.println("**Position is taken");
                                playerOPick();
                            }
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("**Position must be 1-9\n");
                inputScanner2.next();
            }
        } while (positionO < 1 || positionO > 9);
        System.out.println(" ");
    }

    // diagonal X win CHECK
    public void crisCrossX() {
        if (game.board[0][0] == Position.X && game.board[1][1] == Position.X &&
            game.board[2][2] == Position.X || game.board[0][2] == Position.X &&
            game.board[1][1] == Position.X && game.board[2][0] == Position.X) {
            System.out.println("*** Player X wins diagonally! ***");
            System.out.println("*** Game Over! ***\n");
            resetGame();
        } else {
            downUpX();
        }
    }

    // vertical X win
    public void downUpX() {
        if (game.board[0][0] == Position.X && game.board[1][0] == Position.X &&
            game.board[2][0] == Position.X || game.board[0][1] == Position.X &&
            game.board[1][1] == Position.X && game.board[2][1] == Position.X ||
            game.board[0][2] == Position.X && game.board[1][2] == Position.X &&
                    game.board[2][2] == Position.X) {
            System.out.println("*** Player X wins by Vertically! ***");
            System.out.println("*** Game Over ***\n");
            resetGame();
        } else {
            leftRightX();
        }
    }

    // horizontal X win
    public void leftRightX() {
        if (game.board[0][0] == Position.X && game.board[0][1] == Position.X &&
            game.board[0][2] == Position.X || game.board[1][0] == Position.X &&
            game.board[1][1] == Position.X && game.board[1][2] == Position.X ||
            game.board[2][0] == Position.X && game.board[2][1] == Position.X &&
                    game.board[2][2] == Position.X) {
            System.out.println("*** Player X wins horizontally! ***");
            System.out.println("*** Game Over! ***\n");
            resetGame();
        } else {
            tieX();
        }
    }

    // determines tied X game
    public void tieX() {
        if
        (game.board[0][0] != Position.EMPTY &&
            game.board[0][1] != Position.EMPTY &&
            game.board[0][2] != Position.EMPTY &&
            game.board[1][0] != Position.EMPTY &&
            game.board[1][1] != Position.EMPTY &&
            game.board[1][2] != Position.EMPTY &&
            game.board[2][0] != Position.EMPTY &&
            game.board[2][1] != Position.EMPTY &&
            game.board[2][2] != Position.EMPTY) {
            System.out.println("*** It's a tie! *** ");
            System.out.println("*** Game Over! ***\n");
            resetGame();
        } else {
            boardPositions();
            currentBoard();
            playerOPick();
        }
    }

    // diagonal O win
    public void crisCrossO() {
        if (game.board[0][0] == Position.O && game.board[1][1] == Position.O &&
            game.board[2][2] == Position.O || game.board[0][2] == Position.O &&
            game.board[1][1] == Position.O && game.board[2][0] == Position.O) {
            System.out.println("*** Player O wins diagonally! ***");
            System.out.println("*** Game Over! ***\n");
            resetGame();
        } else {
            downUpO();
        }
    }

    // vertical O win
    public void downUpO() {
        if (game.board[0][0] == Position.O && game.board[1][0] == Position.O &&
            game.board[2][0] == Position.O || game.board[0][1] == Position.O &&
            game.board[1][1] == Position.O && game.board[2][1] == Position.O ||
            game.board[0][2] == Position.O && game.board[1][2] == Position.O &&
                    game.board[2][2] == Position.X) {
            System.out.println("*** Player O wins by vertically! ***");
            System.out.println("*** Game Over ***\n");
            resetGame();
        } else {
            leftRightO();
        }
    }

    // horizontal O win
    public void leftRightO() {
        if (game.board[0][0] == Position.O && game.board[0][1] == Position.O &&
            game.board[0][2] == Position.O || game.board[1][0] == Position.O &&
            game.board[1][1] == Position.O && game.board[1][2] == Position.O ||
            game.board[2][0] == Position.O && game.board[2][1] == Position.O &&
                    game.board[2][2] == Position.X) {
            System.out.println("*** Player O wins horizontally! ***");
            System.out.println("*** Game Over! ***\n");
            resetGame();
        } else {
            tieO();
        }
    }

    // determines tied O game
    public void tieO() {
        if
        (game.board[0][0] != Position.EMPTY &&
            game.board[0][1] != Position.EMPTY &&
            game.board[0][2] != Position.EMPTY &&
            game.board[1][0] != Position.EMPTY &&
            game.board[1][1] != Position.EMPTY &&
            game.board[1][2] != Position.EMPTY &&
            game.board[2][0] != Position.EMPTY &&
            game.board[2][1] != Position.EMPTY &&
            game.board[2][2] != Position.EMPTY) {
            System.out.println("*** It's a tie! ***");
            System.out.println("*** Game Over! ***\n");
            resetGame();
        } else if (comCheck == 1) {
            playerXCom();
        } else {
            boardPositions();
            currentBoard();
            playerXPick();
        }
    }
// check if selectionCom was chosen
    // operates game
    public void playGame() {
        computerPlayerOption();
    }

    // clears board
    public void resetGame() {
        comCheck = 0;
        currentBoard();
        game.board[0][0] = Position.EMPTY;
        game.board[0][1] = Position.EMPTY;
        game.board[0][2] = Position.EMPTY;
        game.board[1][0] = Position.EMPTY;
        game.board[1][1] = Position.EMPTY;
        game.board[1][2] = Position.EMPTY;
        game.board[2][0] = Position.EMPTY;
        game.board[2][1] = Position.EMPTY;
        game.board[2][2] = Position.EMPTY;
        int selection = 0;
        Scanner inputScanner2 = new Scanner(System.in);
        do {
            System.out.println("Would you like to play again? Yes(1) or No(2)");
            try {
                selection = inputScanner2.nextInt();
                if (selection < 1 || selection > 2) {
                    System.out.println("**Must be Yes(1) or No(2)\n");
                } else {
                    switch (selection) {
                        case 1 -> computerPlayerOption();
                        case 2 -> {
                            System.out.println("Thanks for playing, goodbye!");
                            System.exit(0);
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("**Must be Yes(1) or No(2)\n");
                inputScanner2.next();
            }
        } while (selection < 1 || selection > 2);
        System.out.println(" ");
    }
}
