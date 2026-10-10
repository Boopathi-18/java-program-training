import java.util.Scanner;

public class cpn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x > 0)
                positive++;
            else if (x < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}