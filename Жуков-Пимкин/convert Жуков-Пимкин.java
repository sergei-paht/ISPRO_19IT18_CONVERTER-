package converters;
import java.util.Scanner;
public class convert {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Для перевода из рублей в доллары введите \n Р-Д," +
                "\nДля перевода из долларов в рубли, введите\n Д-Р");

        String str = in.nextLine();
        float course = 70.06f;

            if (str.equals("Р-Д")) {
                try {
                    System.out.println("Введите рубли");
                    float number = in.nextFloat();
                    System.out.println(number / course + " долларов");
                } catch (Exception ex) {
                    System.out.println("Вы ввели неправильные данные");
                }
            } else if (str.equals("Д-Р")) {
                try {
                    System.out.println("Введите доллары");
                    float number = in.nextFloat();
                    System.out.println(course / number + " рублей");
                } catch (Exception ex) {
                    System.out.println("Вы ввели неправильные данные");
                }

            }
            else{
                System.out.println("Вы ввели неправильные данные");
            }
    }
}

