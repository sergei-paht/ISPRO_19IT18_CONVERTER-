import java.util.*;
import java.util.Scanner;
class Converter
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner ed = new Scanner(System.in);
        System.out.println("Введите длину в сантиметрах");
        double san = sc.nextDouble();
        System.out.println("Введите длину в дюймах");
        double duim = ed.nextDouble();
        double x = san * 0.39;
        System.out.println(san + " Сантиметры = " + x + " Дюймы");
        double y = duim * 2.54;
        System.out.println(duim + " Дюймы " + y + " Сантиметры");
}

   }