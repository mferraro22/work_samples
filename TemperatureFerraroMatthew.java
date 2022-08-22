// Matthew Ferraro
// CSC 331
// Spring 2020

// This program calculates high, low, and average temperature for September 2020.

public class TemperatureFerraroMatthew {

    public static void main(String[] args) {

        // This code executes a high, low, and average temperature.

        int tempCheck = 0;
        int[] tempArray = {91, 95, 96, 97, 90, 87, 85, 79, 89, 87, 87, 82, 88, 89, 83, 81, 79, 82, 83, 77, 74, 78, 81,
                           82, 81, 80, 76, 82, 81, 81};
        int length = tempArray.length;
        System.out.println("September 2020 Temperature High: " + highMethod(tempArray, tempCheck));
        System.out.println("September 2020 Temperature Low: " + lowMethod(tempArray, tempCheck));
        System.out.println("September 2020 Temperature Average: " + avgMethod(tempArray, tempCheck, length));
    }

        public static int highMethod (int[] tempArray, int tempCheck) {
            for (int tempH : tempArray) {
                if (tempH > tempCheck) {
                    tempCheck = tempH;
                }
            }
            return tempCheck;
        }

        public static int lowMethod (int[] tempArray, int tempCheck) {
            tempCheck = highMethod(tempArray, tempCheck);
            for (int tempL : tempArray) {
                if (tempL < tempCheck) {
                    tempCheck = tempL;
            }
        }
            return tempCheck;
    }

        public static int avgMethod (int[] tempArray, int tempCheck, int length) {
            for (int tempA : tempArray) {
                tempCheck += tempA;
        }
            tempCheck /= length;
            return tempCheck;
    }
}
