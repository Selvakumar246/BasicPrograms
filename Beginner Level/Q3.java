//question 3: find simple interest.
import java.util.Scanner;
public class Q3 {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("enter principle amount (in ₹):");
            float p=input.nextFloat();
            System.out.print("enter time period(yrs):");
            int t= input.nextInt();
            System.out.print("enter Rate of interest (in %):");
            float r= input.nextFloat();

            float si=(p*t*r)/100;
            System.out.println("simple interest Amount is: "+si);

        }
}
