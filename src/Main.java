import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("введите a ");
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();

        System.out.print("введите b ");
        Scanner sb = new Scanner(System.in);
        int b = sb.nextInt();

        System.out.print("введите c ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        int x = (int) Math.pow(b, 2) - (4 * a * c);
        if (x > 0) {
            int kor1 = (int) ((-b + Math.sqrt(x)) / 2 * a);
            int kor2 = (int) ((-b - Math.sqrt(x)) / 2 * a);
            System.out.printf("первый корень: %1$d \n", kor1 );
            System.out.printf("второй корень: %1$d \n", kor2 );
        }
        if (x == 0) {
            int kor1 = -b  / 2 * a;
            System.out.printf("корень: %1$d \n", kor1 );
        }
        if (x < 0) {
            System.out.print("нет корней ");
        }
    }
}