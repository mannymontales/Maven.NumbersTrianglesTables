package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        //while i is less than the multiplication table make a ANOTHER NEW ROW
        //but after the j loop is done print create a new ROW LINE
        for (int i = 1; i <= tableSize; i++){
            for (int j = 1; j <= tableSize; j++) {
                //i dictate the multiplicand ex. 1 2 3 4 5 and
                //j dictates the multiplier till it reaches the given multiplication table
                //after it reaches the assigned multiplication table the loop will exit
                //j is printing rows of multiplication tables
                int result = i * j;
                //format for numbers between 10 and 99
                if (result > 9 && result <= 99) {
                    table += (" " + result + " |");
                    //format for integers with 3 digits
                } else if (result > 99) {
                    table += (result + " |");
                    //format for single digit integers
                } else {
                    table += ("  " + result + " |");
                }
            }
            //create a new row after the j loop finishes
            table += "\n";
        }

        return table;
    }
}
