//public class TicTacToeFerraroMatthew {
//
//    public enum Position {
//        X, O, EMPTY;
//        layout;
//
//        private Position[][] = new layout[3][3];
//
//
//
//        }
//    }
//}






//
//         Player(EMPTY, EMPTY, EMPTY) {
//             this(new EMPTY, EMPTY,EMPTY)
//         }
//
//         public Player() {
//             this.playerChoices = EMPTY + EMPTY + EMPTY;
////             this.row2 = EMPTY + EMPTY + EMPTY;
////             this.row3 = EMPTY + EMPTY + EMPTY;
//         }
//
//         public static void main(String[] args) {
//
//         }
//     }
//         String[] row1, String[] row2, String[] row3
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
//
//// The constructor should initialize the board elements to EMPTY.
//// Use an enum type to represent the value in each cell of the array.
//// The class contains a private 3-by-3 two-dimensional array.
//
//
//
//        // This program plays a Tic Tac Toe game.
//
//    int[][] playerChoices = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//
//    int[] boardP;
//    int[] cBoard;
//    int[] a = new int[9];
//
//    // calculate the length of each row
//
//    System.out.println("Length of row 1: " + a[0].length);
//    System.out.println("Length of row 2: " + a[1].length);
//    System.out.println("Length of row 3: " + a[2].length);
//    }
//}
//
//        int[] playerChoices = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};  // board positions
//        int[] emptySlots = {'_', '_', '_', '_', '_', '_', '_', '_', '_'};  // current board
//    }
//// board positions
//        public static String boardP() {
//            System.out.println("Board Positions:");
//            System.out.println(" " + boardP[0] + " " + boardP[1] + " " + boardP[2]);
//            System.out.println(" " + boardP[3] + " " + boardP[4] + " " + boardP[5]);
//            System.out.println(" " + boardP[6] + " " + boardP[7] + " " + boardP[8]);
//        }
//// current positions
//        public static String cBoard () {
//            System.out.println("Current Board:");
//            System.out.println(" " + cBoard[0] + " "  + cBoard[1] + " " + cBoard[2]);
//            System.out.println(" " + cBoard[3] + " " + cBoard[4] + " " + cBoard[5]);
//            System.out.println(" " + cBoard[6] + " " + cBoard[7] + " " + cBoard[8]);
//        }
//        boardPositions()
//        System.out.println()
//        currentBoard()
//        System.out.println()
//
//// player x pick
//        def playerXpick():
//        while True:
//        try:
//        System.out.println("Player X - Your Turn");
//        global position
//        position = int(input("PlayerX, pick an open position (0-8): "))
//        except ValueError:
//        System.out.println();
//        System.out.println("Make a valid selection!");
//        System.out.println();
//        continue
//        if position < 0 or position > 8 or cBoard[position] != "_":
//        System.out.println();
//        System.out.println("Make a valid selection!");
//        System.out.println();
//        continue
//        else:
//        System.out.println();
//        boardPositions()
//        System.out.println();
//        cBoard[position] = 'X'
//        currentBoard()
//        System.out.println();
//        break
//
//// player O pick
//        def playerOpick():
//        while True:
//        try:
//        System.out.println("Player O - Your Turn");
//        global position2
//        position2 = int(input("PlayerO, pick an open position (0-8): "));
//        except ValueError:
//        System.out.println();
//        System.out.println("Make a valid selection!");
//        System.out.println();
//        continue
//        if position2 < 0 or position2 > 8 or cBoard[position2] !=  '_':
//        System.out.println();
//        System.out.println("Make a valid selection!");
//        System.out.println();
//        continue
//        else:
//        System.out.println();
//        boardPositions()
//        System.out.println();
//        cBoard[position2] = 'O';
//        currentBoard()
//        System.out.println();
//        break
//
//// wins for X
//
//        def crissCrossX():
//        while True:
//        if cBoard[0] == 'X' and cBoard[4] == 'X' and \
//        cBoard[8] == 'X' or cBoard[2] == 'X' and \
//        cBoard[4] == 'X' and cBoard[6] == 'X':
//        System.out.println("*** Player X wins diagonally! ***");
//        System.out.println("*** Game Over! ***");
//        resetGame()
//        else:
//        break
//                def leftRightX():
//        while True:
//        if cBoard[0] == 'X' and cBoard[1] == 'X' and \
//        cBoard[2] == 'X' or cBoard[3] == 'X' and \
//        cBoard[4] == 'X' and cBoard[5] == 'X' or \
//        cBoard[6] == 'X' and cBoard[7] == 'X' and \
//        cBoard[8] == 'X':
//        System.out.println("*** Player X wins by horizontally! ***");
//        System.out.println("*** Game Over ***");
//        resetGame()
//        else:
//        break
//                def downUpX():
//        while True:
//        if cBoard[0] == 'X' and cBoard[3] == 'X' and \
//        cBoard[6] == 'X' or cBoard[1] == 'X' and \
//        cBoard[4] == 'X' and cBoard[7] == 'X' or \
//        cBoard[2] == 'X' and cBoard[5] == 'X' and \
//        cBoard[8] == 'X':
//        System.out.println("*** Player X wins vertically! ***");
//        System.out.println("*** Game Over! ***");
//        resetGame()
//        else:
//        break
//
//                def winLoseX():
//        crissCrossX()
//        leftRightX()
//        downUpX()
//
//// wins for O
//
//        def crissCrossO():
//        while True:
//        if cBoard[0] == 'O' and cBoard[4] == 'O' and \
//        cBoard[8] == 'O' or cBoard[2] == 'O' and \
//        cBoard[4] == 'O' and cBoard[6] == 'O':
//        System.out.println("*** Player O wins diagonally! ***");
//        System.out.println("*** Game Over! ***");
//        resetGame()
//        else:
//        break
//                def leftRightO():
//        while True:
//        if cBoard[0] == 'O' and cBoard[1] == 'O' and \
//        cBoard[2] == 'O' or cBoard[3] == 'O' and \
//        cBoard[4] == 'O' and cBoard[5] == 'O' or \
//        cBoard[6] == 'O' and cBoard[7] == 'O' and \
//        cBoard[8] == 'O':
//        System.out.println("*** Player O wins horizontally! ***");
//        System.out.println("*** Game Over! ***");
//        resetGame()
//        else:
//        break
//                def downUpO():
//        while True:
//        if cBoard[0] == 'O' and cBoard[3] == 'O' and \
//        cBoard[6] == 'O' or cBoard[1] == 'O' and \
//        cBoard[4] == 'O' and cBoard[7] == 'O' or \
//        cBoard[2] == 'O' and cBoard[5] == 'O' and \
//        cBoard[8] == 'O':
//        System.out.println("*** Player O wins vertically! ***");
//        System.out.println("*** Game Over! ***");
//        resetGame()
//        else:
//        break
//
//                def tie():
//        while True:
//        if '_' not in cBoard:
//        System.out.println("Tie!");
//        resetGame()
//        else:
//        break
//
//                def winLoseO():
//        crissCrossO()
//        leftRightO()
//        downUpO()
//
//        def playGame():
//        while True:
//        playerXpick()
//        winLoseX()
//        tie()
//        playerOpick()
//        winLoseO()
//        tie()
//
//        def resetGame():
//        while True:
//        position = 0
//        position1 = 1
//        position2 = 2
//        position3 = 3
//        position4 = 4
//        position5 = 5
//        position6 = 6
//        position7 = 7
//        position8 = 8
//        cBoard[position] = '_'
//        cBoard[position1] = '_'
//        cBoard[position2] = '_'
//        cBoard[position3] = '_'
//        cBoard[position4] = '_'
//        cBoard[position5] = '_'
//        cBoard[position6] = '_'
//        cBoard[position7] = '_'
//        cBoard[position8] = '_'
//        System.out.println('');
//        try:
//        answer = input("Would you like to play again Yes(Y) or No(N)? ")
//        answer = answer.capitalize()
//        except ValueError:
//        System.out.println("Answer must be Yes(Y) or No(No)");
//        continue
//                y = 'Y'
//        n = 'N'
//        x = [y,n]
//        if answer not in x:
//        continue
//        else:
//        break
//        if answer == n:
//        sys.exit("Thanks for playing, goodbye!");
//        elif answer == y:
//        System.out.println();
//        boardPositions()
//        System.out.println();
//        currentBoard()
//        System.out.println();
//        playGame()
//        playGame()
//
//    }
//}
