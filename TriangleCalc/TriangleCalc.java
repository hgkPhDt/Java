package program;

import java.util.Locale;
import java.util.Scanner;

public class TriangleCalc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Pronunciation of measures = meh-zhrz
        System.out.println("ENTER THE MEASURES");
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        double p = (a+b+c) /2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("\nThe area is %.2f \n", area);

        sc.close();
    }
}
