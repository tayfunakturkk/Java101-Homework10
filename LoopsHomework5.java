package Loops.Homework5;
import java.util.Scanner;
public class LoopsHomework5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many elements will a series be:");
        int n = input.nextInt();
        int n1=0,n2=1,sum;        
        for (int i =1; i <= n; i++) {
           System.out.print(n1 +"  ");
           sum = n1+n2;
           n1=n2;
           n2=sum;  
            }
        }       
    }

