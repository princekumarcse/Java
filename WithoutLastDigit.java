//Write a program to print a given number without its last digit. 

import java.util.*;
public class WithoutLastDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int newnum=num/10;
        System.out.println("Number Without Last Digit is: "+newnum);
    }
}