import java.util.Scanner;

public class  Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите любое целое положительное число:");

        if (!sc.hasNextInt()) {
            System.out.println("лох");
        } else {
            int n = sc.nextInt();
            int x = 0 ;
            if (n < 0) {
                System.out.println("число отричательное");
                return;}

                for (int i = 0; i < n; i++) {
                    if (i % 2  == 1){
                        x = (x + i);

                    }


                }
                System.out.println(x);
            }
        }
    }

