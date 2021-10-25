package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1, если хотите перевести Цельсии в Фарингейты. Введите 2, если хотите перевести Фарингейты в Цельсии:");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Введите количество градусов по Цельсию, которые хотите перевести в Фарингейты");
            int C = scanner.nextInt();
            int f = (int) (C * 33.8);
            System.out.println(f);
        }
        if (a == 2) {
            System.out.println("Введите количество градусов по Фарингейту, которые хотите перевести в Цельсии");
            int F = scanner.nextInt();
            int c = (int) (F / 33.8);
            System.out.println(c);
        }
        if (a != 1 || a != 2){
            System.out.println("Вы ввели недопустимое значение");
        }
    }
}