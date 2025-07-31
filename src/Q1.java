//Question 1:check whether a number is odd or even.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int num= input.nextInt();
        if(num%2==0){
            System.out.println("it is even number");
        }
        else{
            System.out.println("it is odd number");
        }
    }
}