package converter;
import java.util.logging.Logger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("converter");
        Scanner input = new Scanner(System.in);
        System.out.println("Чтобы перевести мили в км напишите +, км в мили -");
        String request = input.nextLine();
        double mile;
        double km;
        switch(request){
            case "+":
                System.out.println("Введите количество миль для перевода: ");
                mile = input.nextDouble();
                km = mile * 1.609;
                System.out.printf("%f миль равно %f км ", mile, km);
                log.info("km");
                break;
            case "-":
                System.out.println("Введите количество км для перевода: ");
                km = input.nextDouble();
                mile = km / 1.609;
                System.out.printf("%f км равно %f миль ", km, mile);
                log.info("mile");
                break;
        }
    }
}
