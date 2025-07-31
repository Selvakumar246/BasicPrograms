//Question 5:convert rupees into dollars.
import java.util.Scanner;
public class Q5 {
            public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("enter the rupees (in ₹):");
            float amount=input.nextFloat();
            System.out.println("\n-----converting into dollar------");
            float dollar=amount/85.95f;
            System.out.printf("\n the dollar for the amount %.2f is :%.2f ($)",amount,dollar);
        }
    }
