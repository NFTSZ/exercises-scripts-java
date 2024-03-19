import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    
 
    String[] p1 = sc.nextLine().split(" ");
    double x1 = Double.parseDouble(p1[0]);
    double y1 = Double.parseDouble(p1[1]);
    
    String[] p2 = sc.nextLine().split(" ");
    double x2 = Double.parseDouble(p2[0]);
    double y2 = Double.parseDouble(p2[1]);
    
    double c1 = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
    double c2 = Math.sqrt(c1);
    
    System.out.printf("%.4f%n", (c2));
    }
 
}