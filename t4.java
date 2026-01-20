package week1;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Введите три числа (a b c) через пробел:");

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if (a == 0 && b==0 && c==0) {
                    System.out.println("Бесконечно много решений.");
            }
            else {
                double D = b * b - 4 * a * c;

                if (D > 0) {
                    double sqrtD = Math.sqrt(D);
                    double x1 = (-b + sqrtD) / (2 * a);
                    double x2 = (-b - sqrtD) / (2 * a);
                    System.out.print("Два корня: "+x1 + " " + x2);


                } else if (D == 0) {
                    double x = -b / (2 * a);
                    System.out.printf("Один корень:" +x);
                } else {
                    System.out.println("Корней в R нет (D < 0).");
                }
            }
        }
    }

