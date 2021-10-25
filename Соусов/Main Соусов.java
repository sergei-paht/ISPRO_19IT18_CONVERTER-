package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double mul1 = 9460730472580.8;
        BigDecimal mul = BigDecimal.valueOf(mul1);
        Scanner in = new Scanner(System.in);
        System.out.println("Что вы хотите перевести? 1) Если километры в световые года, 2) Если наоборот");
        String choice = in.nextLine();
        if (choice.equals("1")) {
            System.out.print("Введите значение километров: ");
            String skm = in.nextLine();
            BigDecimal Kilometres = BigDecimal.valueOf(Double.parseDouble(skm));
            KMtoLY(Kilometres, mul);
        } else if (choice.equals("2")) {
            System.out.print("Введите значение световых лет: ");
            String sly = in.nextLine();
            BigDecimal LightYears = BigDecimal.valueOf(Double.parseDouble(sly));
            LYtoKM(LightYears, mul);
        }
    }

    public static void KMtoLY(BigDecimal km, BigDecimal mul){
        BigDecimal answer;
        answer = km.divide(mul, RoundingMode.DOWN);
        System.out.println(km + " километров равно " + answer + " световых лет");
    }
    public static void LYtoKM(BigDecimal ly, BigDecimal mul){
        BigDecimal answer;
            answer = ly.multiply(mul);
            System.out.println(ly + " световых лет равно " + answer + " километров");
        }
    }


