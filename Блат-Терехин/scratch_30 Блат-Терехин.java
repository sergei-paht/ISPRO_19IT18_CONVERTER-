import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Курс биткоина на данный момент - 4 396 820 руб.");
        System.out.println("Введите количество биткойнов для перевода в рубли:");
        BigDecimal bitcoin = BigDecimal.valueOf(in.nextDouble());
        BigDecimal bitCourse = BigDecimal.valueOf(4396820);
        BigDecimal multi = bitcoin.multiply(bitCourse);

        System.out.println("Стоимость биткоина в количестве " + bitcoin + " шт. равен " + multi + " руб.");

    }
}