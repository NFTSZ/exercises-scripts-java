import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int number, hours;
        double moneyPerHour, salary;
        Scanner sc = new Scanner(System.in);
        
        number = sc.nextInt();
        hours = sc.nextInt();
        moneyPerHour = sc.nextDouble();
        
        salary = moneyPerHour*hours;
        
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", (salary));
    }
 
}