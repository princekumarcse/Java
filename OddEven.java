//. Write a program to check whether the given number is even or odd.. 

import java.util.*;
public class OddEven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num +" is Even");
        }else{
             System.out.println(num +" is Odd");
        }
    }
}