package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    //rewrite methods so they only take returnExponent method
    public static String getEvenNumbers(int start, int stop) {
        //declare StringBuilder object with the name of builder
        StringBuilder builder = new StringBuilder();

        //traverse the length of the range of start and stop
        while (start < stop){
            if(start % 2 == 0){
                builder.append(start);
                start +=1;
            } else {
                start += 1;
            }
        }
        String completedString = builder.toString();

        return completedString;
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder builder = new StringBuilder();

        while(start < stop){
            if (start % 2 != 0){
                builder.append(start);
                start += 1;
            } else {
                start +=1;
            }
        }
        String completedString = builder.toString();
        return completedString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder builder = new StringBuilder();


        while (start < stop){
            //store the squared value of the number before appending it to the string builder
            //but also before incrementing
            int squaredNums =+ (start * start);
            builder.append(squaredNums);
            start += step;
        }
        String completedString = builder.toString();
        return completedString;
    }

    //name for tests is testGetRangeA
    public static String getRange(int stop) {

        //create new StringBuilder object and declare with name of builder
        StringBuilder builder = new StringBuilder();

        int total = 0; //total is used to loop through int stop value

        //initialize i, use total to exit loop once it hits stop but
        //not INCLUDING STOP
        for(int i = 0; total < stop; i++ ){

            builder.append(total);// appends total to builder object
            total += 1;// add 1 to total till total < stop
        }
        String completedString = builder.toString(); //initialized completed string with builder object with toString method
        return completedString;
    }

    //name for tests is testGetRangeB
    public static String getRange(int start, int stop) {
        //declare new StringBuilder object with builder variable name
        StringBuilder builder = new StringBuilder();

        //used method parameters to get range for the "for loop"
        //get used to not initializing int i = 0
        /* for (int i = start; start < stop; start++){
            builder.append(start);
        }
         */
        while(start < stop){
            builder.append(start);
            start += 1;
        }
        String completedString = builder.toString();
        return completedString;
    }

    //name for tests is testGetRangeC
    public static String getRange(int start, int stop, int step) {
        //declare new StringBuilder object with the name of builder
        StringBuilder builder = new StringBuilder();

        //started with for loop trying to use the three parameters
        //within the conditions but a using a while loop idk
        while (start < stop){
            builder.append(start);
            start += step;
        }

        String completedString = builder.toString();
        return completedString;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder builder = new StringBuilder();

        while (start < stop){
            int result = 1;
            // while is less than the exponent
            //keep adding the number times itself
            //keeping the total and appending the result
            for (int i = 0; i < exponent; i++) {
                result = start * result;
            }
            builder.append(result);
            start += step;
        }
        String completedString = builder.toString();
        return completedString;
    }
}
