public class Hello {
    public static void main(String[] args) {

        // System.out.println("Hello, Tim");

        // boolean isAlien = false;
        // if (isAlien == false) {
        //     System.out.println("It is not an alien!");
        //     System.out.println("And I am scared of aliens");
        // }

        // int topScore = 80;
        // if (topScore < 100) {
        //     System.out.println("You got a top score!");
        // }

        // int secondTopScore = 95;
        // if ((topScore > secondTopScore) && (topScore < 100)) {
        //     System.out.println("Greater than second top score and less than 100");
        // }

        // if ((topScore > 90) || (secondTopScore <= 90)) {
        //     System.out.println("Either or both of the conditions are true");
        // }

        // int newValue = 50;
        // if (newValue == 50) {
        //     System.out.println("This is true");
        // }

        // boolean isCar = false;
        // if (isCar == true) {
        //     System.out.println("This is not supposed to happen");
        // }

        // String makeOfCar = "Volkswagen";
        // boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        // if (isDomestic) {
        //     System.out.println("This car is domestic to our country");
        // }

        // int ageOfClient = 20;
        // String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
        // System.out.println("Our client is " + ageText);

        // String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        // System.out.println(s);

        double doubleOne = 20.00d;
        double doubleTwo = 80.00d;
        double myTotal = (doubleOne + doubleTwo) * 100.00d;
        double remainder = myTotal % 40.00;
        boolean isItZero = remainder == 0 ? true : false;
        if (!isItZero) {
            System.out.print("got some remainder");
        }

    } 
}
