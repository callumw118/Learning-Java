public class Error {

    public static void main(String[] args) {

        countLetter();

    }

    //Introduces try and catch. Test the code in try and if there is an error then do the catch
    public static void tryCatch() {

        try {
            double x = 10;
            double y = 10;
            double z = x / y;

            System.out.println(z);
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }
    }

    public static void m1() {
        try {
            System.out.println("Method One - m1");
            m2();
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }
    }

    //Cannot divide by zero
    public static void m2() {

        int x = 10;
        int y = 0;
        double z = x / y;

        System.out.println(z);
        System.out.println("Method Two - m2");

    }

    //Counts how many times the letter g appears in the work Debugging
    public static void countLetter() {

        int letterCount = 0;
        String checkWord = "Debugging";
        String singleLetter = "";

        for (int i = 0; i < checkWord.length(); i++) {
            singleLetter = checkWord.substring(i, i + 1);

            if (singleLetter.equals("g")) {
                letterCount++;
            }
        }
        System.out.println("G was found " + letterCount + " times.");
    }


}
