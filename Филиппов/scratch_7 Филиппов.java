import java.util.Scanner;
// конвертер фунтов в килограммы
class Scratch {
    public static void main(String[] args) {

        String method;
        double conv;
        double res;

        System.out.println("o(〃＾▽＾〃)o   Конвертируем килограммы в фунты  o(〃＾▽＾〃)o");
        System.out.print("если нужно преобразование наоборот, введите да, если не нужно, просто нажмите enter >>>");

        Scanner in = new Scanner(System.in);
        method = in.nextLine();

        if (method.equals("да")|| method.equals("Да")){
            System.out.println("Введите фунты");
            conv = in.nextDouble();
            res = (conv * 0.45359237);
            System.out.printf("Хмм, похоже это будет  %.5f  килограмм", res);
        }
        else  {
            System.out.println("Введите килограммы");
            conv = in.nextDouble();
            res = conv * 2.20462 ;
            System.out.printf("Хмм, похоже это будет  %.5f фунтов", res);
        }
    }
}