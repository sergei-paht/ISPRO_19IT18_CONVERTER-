import java.util.Scanner;
import java.lang.String;
public class Konvektr {
    public static void main(String [] args) {
        System.out.println("Введите воны: ");
        Scanner inv = new Scanner(System.in);
        float von = inv.nextFloat();
        System.out.println("Воны = " + von);
        double x = 0.06;
        float rub = (float) (x * von);
        System.out.println("Рубли = " + rub);
        System.out.println("Введите рубли: ");
        Scanner inr = new Scanner(System.in);
        float rubl = inr.nextFloat();
        System.out.println("Рубли: " + rubl);
        double y = 16.58;
        float vons = (float) (y * rubl);
        System.out.println(vons);

    }
}
