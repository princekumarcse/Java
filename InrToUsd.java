//. Assume price of 1 USD is INR 76.23. Write a program to take the amount in INR and convert it into USD. 
import java.util.*;
public class InrToUsd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount in INR: ");
        float inr=sc.nextInt();
        float usd=(1/76.23f)*inr;
        System.out.println(inr +" INR "+"in USD is: "+usd);
    }
}