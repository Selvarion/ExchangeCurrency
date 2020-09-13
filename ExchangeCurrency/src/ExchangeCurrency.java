import java.util.*;

public class ExchangeCurrency {
    public static void main(String[] args) {

        final double CHF = 4.1207;
        final double USD = 3.7391;
        final double EUR = 4.4324;
        final double GBP = 4.7835;

        System.out.println("Wolcome to Exchange Currency! ");
        System.out.println("How much PLN do you want to exchange? ");

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextDouble()) {
            System.out.println("Value not found.");
            scan.next();
        }

        double cash = scan.nextDouble();

        System.out.println("CHF: " + (cash * CHF));
        System.out.println("EUR: "+(cash * EUR));
        System.out.println("GBP: "+(cash * GBP));
        System.out.println("USD: "+(cash * USD));


    }
}


