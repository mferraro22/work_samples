// Matthew Ferraro
// CSC 331
// Spring 2020

// This program calculates Pythagorean sides.

public class PythagoreanFerraroMatthew {

    public static void main(String[] args) {

        // This program calculates Pythagorean Triples up to 500.

        int count = 0;
        System.out.println("Side A" + " " + "Side B" + " " + "Hypotenuse");
        for (int a = 1; a <= 500; a++) {
            for (int b = 1; b <= 500; b++) {
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    if (a * a + b * b == hypotenuse * hypotenuse) {
                        count++;
                        String spaceA; String spaceB; String spaceHypotenuse;

                        // Resolves spacing issues.

                        if (a < 10) {
                            spaceA = "     ";
                        } else if (a < 100) {
                            spaceA = "    ";
                        } else {
                            spaceA = "   ";
                        }
                        if (b < 10) {
                            spaceB = "      ";
                        } else if (b < 100) {
                            spaceB = "     ";
                        } else {
                            spaceB = "    ";
                        }
                        if (hypotenuse < 10) {
                            spaceHypotenuse = "          ";
                        } else if (hypotenuse < 100) {
                            spaceHypotenuse = "         ";
                        } else {
                            spaceHypotenuse = "        ";
                        }
                        System.out.println(spaceA + a + spaceB + b + spaceHypotenuse + hypotenuse);
                        }
                    }
                }
            }
        System.out.println();
        System.out.println(count + " Triples Found");
        }
    }
