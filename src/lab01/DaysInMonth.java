/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Scanner;


public class DaysInMonth {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam : ");
        int year = sc.nextInt();
        System.out.print("Nhap thang :");
        int month = sc.nextInt();
        if (year <= 0) {
            System.out.println("Nhap nam lon hon 0");
        } else if (month < 1 || month > 12) {
            System.out.println(" Thang khong hop le.");
        } else {
            int daysInMonth = getDaysInMonth(year, month);
            System.out.println("Thang " + month + " nam " + year + " có " + daysInMonth + " ngày.");
        }
    }

    public static int getDaysInMonth(int year, int month) {
        int days = 0;
        if (month >= 1 && month <= 12) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
            } else {
                days = 31;
            }
        }
        return days;

    }
}
