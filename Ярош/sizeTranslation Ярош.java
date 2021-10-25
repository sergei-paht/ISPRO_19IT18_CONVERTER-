import java.util.Scanner;
public class sizeTranslation {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("введите размер российского стандарта: ");
        int size = input.nextInt();
        if (size == 38) {
            System.out.println("размер "+size+" в европейском стандарте XXS" );
        }
        if (size == 40) {
            System.out.println("размер "+size+" в европейском стандарте XS" );
        }
        if (size == 42) {
            System.out.println("размер "+size+" в европейском стандарте S" );
        }
        if (size == 44) {
            System.out.println("размер "+size+" в европейском стандарте S/M" );
        }
        if (size == 46) {
            System.out.println("размер "+size+" в европейском стандарте M" );
        }
        if (size == 48) {
            System.out.println("размер "+size+" в европейском стандарте M/L" );
        }
        if (size == 50) {
            System.out.println("размер "+size+" в европейском стандарте XL" );
        }
        if (size == 52) {
            System.out.println("размер "+size+" в европейском стандарте XXL" );
        }

    }
}
