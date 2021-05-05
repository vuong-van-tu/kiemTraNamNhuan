package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int nam;
        System.out.print("Nhập năm : ");
        nam = scanner.nextInt();

        if (nam % 4 == 0 && nam % 100 != 0) {
            System.out.println("Năm : " + nam + " là năm nhuận");
        } else if (nam % 100 == 0 && nam % 400 == 0) {
            System.out.println("Năm : " + nam + " là năm nhuận");
        }else {
            System.out.println("Năm : "+nam+" không phải năm nhuận");
        }
    }
}
