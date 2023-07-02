package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder builder = new StringBuilder();
        String row = "";

        for(int i = 0; i < (numberOfRows - 1);i++){
            for (int j = 0; j < i; j++){
                row += "*";
            }
            row += "*\n";
        }
       return row;
    }

    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i = 0; i < numberOfStars; i++){
            row += "*";
        }
        return row;
    }

    public static String getSmallTriangle() {
        //StringBuilder builder = new StringBuilder();
        String row = "";

        for(int i = 0; i < 4;i++){
            for (int j = 0; j < i; j++){
                row += "*";
            }
            //can concatenate to a string this way without a string builder
            row += "*\n";
        }
        return row;
    }

    public static String getLargeTriangle() {

        String triangle = "";

        //Evaluate the condition if its true or false
        //if the condition is false, skip the body and go to the next statement
        //if true execute the body and go back to step 1
        //draw out how j changes in regards to i
        for(int i = 0; i < 9; i++){
            //can also do stuff here before it enters the j loop
            for (int j = 0; j < i; j++){
                triangle += "*";
                //after j exits this loop its set to zero again and
                //the loop will behave differently after i get incremented
            }
            //execute this after the j loop exits
            triangle += "*\n";

        }
        return triangle;
    }
}
