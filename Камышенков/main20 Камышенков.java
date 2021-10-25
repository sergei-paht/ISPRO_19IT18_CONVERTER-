import java.util.Scanner;
class Converter

{
    public static void main (String[] args) {
        Scanner kon = new Scanner(System.in);
        Scanner izm = new Scanner(System.in);
        System.out.println("Введите значение в КилоБайтах:");
        double kb = kon.nextDouble();
        System.out.println("Введите значение в Байтах:");
        double bb = izm.nextDouble();
        double kb1 = kb * 1024;
        System.out.println(kb + " Кб = " + kb1 + " Б");
        double bb1 = bb * 0.0009765625;
        System.out.println(bb + " Б = " + bb1 + " Кб"); }

   }