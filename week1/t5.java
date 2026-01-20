package week1;

import java.util.Scanner;

public class t5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double balance = sc.nextDouble();
        double interest = 5.0;

        double newBalance = balance + balance * interest / 100;

        System.out.println("Initial balance: " + balance);
        System.out.println("Interest: " + interest + "%");
        System.out.println("New balance: " + newBalance);
    }
}
