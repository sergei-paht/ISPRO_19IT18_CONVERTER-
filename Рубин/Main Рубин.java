package it.college;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Конвентер градусов цельсия в кельвины\nЧто во вчо переводим? °C в К - 0, К в °C - 1");
        int choice = scanner.nextInt();
        switch (choice) {
            case 0 -> {
                System.out.println("Введите °C:");
                double C = scanner.nextDouble();
                System.out.println(C + 273.15 + " кельвинов");
            }
            case 1 -> {
                System.out.println("Введите К:");
                double K = scanner.nextDouble();
                System.out.println(K - 273.15 + " °C");
            }
        }
    }
}
