public class ShortHand {
    public static void main(String[] args) {
        /*
        It can be used to replace multiple lines of code with a single line,
        and is most often used to replace simple if else statements:
        */

        // variable = (condition) ? expressionTrue :  expressionFalse;
        int time = 20;
        String result = (time < 18) ? "Good Day." : "Good Night.";
        System.out.println(result);

        // is the same of
        int newTime = 17;
        if (newTime < 18) {
            System.out.println("Good Day.");
        } else {
            System.out.println("Good night.");
        }
    }
}