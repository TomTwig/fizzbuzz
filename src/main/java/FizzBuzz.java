public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }
    public static String fizzBuzz(int number) {

        boolean isDividableBy3And5 = number % 3 == 0 && number % 5 == 0;
        boolean isDividableBy3 = number % 3 == 0;
        boolean isDividableBy5 = number % 5 == 0;

        /*
        3 / 3 = 1, Rest 0 = True
        4 / 3 = 1, Rest 1 = False
        5 / 3 = 1, Rest 2 = False
        5 / 3 = 2, Rest 0 = True
        If Rest = 0 = True
        If Rest = 0 + X = False
         */


        if (isDividableBy3And5) {
            return "fizzbuzz";

        } else if (isDividableBy3) {
            return "fizz";

        } else if (isDividableBy5) {
            return "buzz";
        }
            return String.valueOf(number);


    }
}
