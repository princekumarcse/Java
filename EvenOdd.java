//. Write a program to check whether a given number is an even number or an odd number. 
import java.util.*;
public class EvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num +" Is Even ");
        }else{
             System.out.println(num +" Is Odd ");
        }
    }
}