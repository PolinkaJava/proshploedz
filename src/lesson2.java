import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите любое целое положительное число:");

        if (!sc.hasNextInt()) {
            System.out.println("лох");
        } else {
            int n = sc.nextInt();
            int x = 0;
            int m = sc.nextInt();
            if (n < 0) {
                System.out.println("число отричательное");
                return;
            }
            if (m < 0) {
                System.out.println("число отричательное");
                return;
            }

            for (int i = n; i < m; i++) {
                if (i % 2 == 0) {

                    System.out.println(i);

                }


            }
        }
    }}
