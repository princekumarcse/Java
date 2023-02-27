//1. Write a program to print unit digit of a given number 

import java.util.*;
public class UnitDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int unitd=num%10;
        System.out.println("Unit digit is: "+ unitd);
    }
}