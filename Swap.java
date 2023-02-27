//Write a program to swap values of two int variables 

import java.util.*;
public class Swap{
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1st: ");
        int num1=sc.nextInt();
        System.out.println("Enter Number 2st: ");
        int num2=sc.nextInt();
        int num3=num1;
        num1=num2;
        num2=num3;
        System.out.println("Swapped value is :" + num1 +" "+ num2);
       
    }
}