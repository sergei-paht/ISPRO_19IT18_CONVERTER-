package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double franki = scan.nextDouble();
        System.out.println(franki * 1.09  + " Франков");//франки в доллары
        float dollars = scan.nextFloat();
        double dollars1 = dollars / 1.09;
        NumberFormat fordollar = new DecimalFormat("#.##");//для ограничения количества чисел в бесконечной дроби
        System.out.println(fordollar.format(dollars1) + " Долларов");//доллары в франки

    }
}
