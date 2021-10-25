import java.util.Scanner;

class SmInFoots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Перевод см в футы (если нужна обратная конвертация напечатайте \"..\" \n>> ");
        String number = scan.nextLine();
        if (number.equals("..")) {
            System.out.print("Перевод футы в см\n>> ");
            number = scan.nextLine();
            System.out.println(number + " фут = " + Float.parseFloat(number) * 30.48 + " см");
        } else {
            System.out.println(number + " см = " + Float.parseFloat(number) / 30.48 + " фут");
        }
    }
}