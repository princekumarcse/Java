//Write a program to check whether a given number is a three-digit number or not. 
import java.util.*;
public class CheckThreeDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        if(count==3){
System.out.println("Given Number have Three Digits");
        }else{
            System.out.println("Number Don't have Three Digits");
        }
    }
}