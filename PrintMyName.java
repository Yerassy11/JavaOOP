package week1;

import java.util.Scanner;

public class PrintMyName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=sc.nextLine();

        String line="-";
        line=line.repeat(name.length());

        System.out.println("+"+line+"+");
        System.out.println("|"+name+"|");
        System.out.println("+"+line+"+");
    }
}
