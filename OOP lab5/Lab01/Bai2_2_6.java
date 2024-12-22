/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Scanner;

public class Bai2_2_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // nhap vao a,b
        System.out.println("nhap a: ");
        Double a = input.nextDouble();

        System.out.println("nhap b: ");
        Double b = input.nextDouble();

        // giai pt bac nhat 1 an
        System.out.println("pt: " + a + "x + " + b + " = 0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt vo so nghiem");
            } else {
                System.out.println("pt vo nghiem");
            }
        } else {
            Double x = -b / a;
            System.out.println("Nghiem: x= " + x);
        }

        // he pt bac nhat 2 an
        // nhap input
        System.out.println("nhap a1: ");
        Double a1 = input.nextDouble();

        System.out.println("nhap b1: ");
        Double b1 = input.nextDouble();

        System.out.println("nhap c1: ");
        Double c1 = input.nextDouble();

        System.out.println("nhap a2: ");
        Double a2 = input.nextDouble();

        System.out.println("nhap b2: ");
        Double b2 = input.nextDouble();

        System.out.println("nhap c2: ");
        Double c2 = input.nextDouble();

        System.out.println("pt: ");
        System.out.println(a1 + "x + " + b1 + "y = " + c1);
        System.out.println(a2 + "x + " + b2 + "y = " + c2);

        // giai he
        Double d = a1 * b2 - a2 * b1;
        Double d1 = c1 * b2 - c2 * b1;
        Double d2 = a1 * c2 - a2 * c1;

        if (d == 0) {
            if (d1 == 0 && d2 == 0) {
                System.out.println("he pt vo so nghiem");
            } else {
                System.out.println("he pt vo nghiem");
            }
        } else {
            Double x1 = d1 / d;
            Double x2 = d2 / d;
            System.out.println("nghiem pt: x1 = " + x1 + ", x2 = " + x2);
        }

        // giai pt bac 2
        System.out.println("nhap a: ");
        Double a3 = input.nextDouble();

        System.out.println("nhap b: ");
        Double b3 = input.nextDouble();

        System.out.println("nhap c: ");
        Double c3 = input.nextDouble();

        System.out.println("pt: " + a3 + "x^2 + " + b3 + "x +" + c3 + " = 0");
        // tinh delta
        Double delta = b3 * b3 - 4 * a3 * c3;

        // giai pt
        if (a3 == 0) {
            if (b3 == 0) {
                if (c3 == 0) {
                    System.out.println("pt vo so nghiem");
                } else {
                    System.out.println("pt vo nghiem");
                }
            } else {
                Double x = -c3 / b3;
                System.out.println("nghiem x = " + x);
            }
        } else {
            if (delta < 0) {
                System.out.println("pt vo nghiem");
            } else if (delta == 0) {
                Double x = (-b3 / 2) * a3;
                System.out.println("nghiem: x1 = x2 = " + x);
            } else {
                Double x1 = (-b3 - Math.sqrt(delta)) / 2 / a3;
                Double x2 = (-b3 + Math.sqrt(delta)) / 2 / a3;
                System.out.println("nghiem: x1 = " + x1 + ", x2 = " + x2);
            }
        }
        input.close();
    }
}
