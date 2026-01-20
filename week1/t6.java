package week1;

import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Pls enter your word: ");
        String word = sc.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Word is polindrome");
        } else {
            System.out.println("word inst polyndrome");
        }

    }
}
