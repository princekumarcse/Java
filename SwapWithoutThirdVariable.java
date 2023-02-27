// 4. Write a program to swap values of two int variables without using a third variable. 

import java.util.*;
public class SwapWithoutThirdVariable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter 2st Number: ");
        int num2=sc.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Swapped Value is: "+num1 +" "+ num2);
    }
}