package src;
import java.util.Scanner;

public class sizeShoes {
    public static void main (String[] args) {
        System.out.println("Ресур предназначен для перевод российского размера обуви на европейский и наоборот");
        Scanner in = new Scanner(System.in);
        System.out.println("Какую систмему вы хотите перевести (RU or EU)");
        String system = in.nextLine();
        System.out.print("Введите размер обуви: ");
        double size = in.nextDouble();

        if (system.equals("RU")) {
            if ((size < 32) | (size > 48)) {
                System.out.println("По европейским меркам резмер будет равен: " + size++);
            } else {
                System.out.println("Вы ввели некорректное значение: \n меньше 32 или больше 48 для русских размеров. Попробуйте еще раз");
            }
        }if (system.equals("EU")) {
            if ((size<33) | (size>49)) {
                System.out.println("По русским меркам резмер будет равен: " + size--);
            } else {
                System.out.println("Вы ввели некорректное значение: меньше 33 \n больше 49 для европеских размеро). Попробуйте еще раз");
            }
        }
    }
}

