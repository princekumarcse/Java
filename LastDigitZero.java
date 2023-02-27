//. Write a program to make the last digit of a number stored in a variable as zero. (Example - if x=2345 then make it x=2340) 

import java.util.*;
public class LastDigitZero{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number:");
        int num=sc.nextInt();
        int rem=num%10;
        num=num-rem;
        System.out.println(num);
    }
}