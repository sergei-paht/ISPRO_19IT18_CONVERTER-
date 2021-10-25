package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

//гигабайты в байты 1 гб = 1073741824 б
public class convection {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите кол-во ГБ");
    double Gb = in.nextDouble();
    System.out.println("Введите кол-во байт");
    double bait = in.nextDouble();
    DecimalFormat decimalFormat = new DecimalFormat("#.#######");
    double preobGb = Gb * 1073741824;
    System.out.println(Gb + " ГБ = " + decimalFormat.format(preobGb) + " байт");
    double preobB = bait / 1073741824;
    System.out.println(bait + " байт = " + decimalFormat.format(preobB) + " ГБ");
    }
}
