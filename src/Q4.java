import java.util.Scanner;

//Question 4: check which number is largest from two numbers.
public class Q4 {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("enter num1:");
            int num1= input.nextInt();
            System.out.print("enter num2:");
            int num2= input.nextInt();

            if(num1>num2){
                System.out.println(num1 +" is largest number");
            }
            else if(num2>num1){
                System.out.println(num2+" is largest number");
            }
            else{
                System.out.println("Both are equal");
            }
        }
}
