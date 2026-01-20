package week1;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length 'a' : ");
        int a=sc.nextInt();
        System.out.println("The area of square : "+ a*a);
        System.out.println("The perimeter of square : "+4*a);
        System.out.println("The diagonal of square : "+a*Math.pow(2,0.5));
    }
}
