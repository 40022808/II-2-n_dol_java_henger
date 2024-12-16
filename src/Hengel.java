/*
* File: Hengel.java
* Author: Ye Haoze
* Group: SZOFT II/2/N
* Date: 2024-12-16
* Github: https://github.com/40022808/
* Licenc: MIT
*/

import java.util.Scanner;

public class Hengel {
    public static void doit() {
        System.out.println("Ye Haoze");



        Scanner sc = new Scanner(System.in);

        System.out.print("Adja meg a henger sugarát: ");
        double radius = sc.nextDouble();

        System.out.print("Adja meg a henger magasságát: ");
        double height = sc.nextDouble();

        double surfaceArea = calculateSurfaceArea(radius, height);

        System.out.printf("A henger felszínét: %.2f\n", surfaceArea);
    }

    public static double calculateSurfaceArea(double radius, double height) {
        final double PI = Math.PI;
        double baseArea = PI * radius * radius;
        double sideArea = 2 * PI * radius * height;
        return 2 * baseArea + sideArea;
    
    }
}
