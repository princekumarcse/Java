//. Write a program to take a three-digit number from the user and rotate its digits by one position towards the right 

import java.util.*;
public class RotateNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num=sc.nextInt();
        int rem=num%10;
        num=num/10;
        System.out.print(rem);
       System.out.println(num);
    }
}