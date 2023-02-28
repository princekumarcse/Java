//Write a program to print greater between two numbers. Print one number of both are the same. 

import java.util.*;
public class GreatestAmongTwo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2=sc.nextInt();
        if(num1>num2){
             System.out.println(num1 +" Is Greater"); 
        }else if(num1==num2){
             System.out.println(num1+" "+"and" + " "+ num2 + " Is Equal"); 
        }else{
            System.out.println(num2 +" Is Greater"); 
        }
    }
}