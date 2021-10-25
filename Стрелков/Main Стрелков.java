package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float inch = 0;
        float cm = 0;
        System.out.println("inch or cm");
        String choice = input.nextLine();

        if (Objects.equals(choice, "inch")){
            cm = input.nextFloat();
            inch = (float) (cm / 2.54);
            System.out.println(inch);
        } else {
            inch = input.nextFloat();
            cm = (float) (inch * 2.54);
            System.out.println(cm);
        }
    }
}
