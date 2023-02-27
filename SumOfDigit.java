//Write a program to input a three-digit number and display the sum of the digits. 
import java.util.*;
public class SumOfDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
             sum=sum+rem;
             num=num/10;
        }
        System.out.println("Sum of Digit is: "+sum);
    }
}