import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticks = sc.nextInt();

        double revolutions = ticks / 4.0;

        System.out.println(revolutions);
    }
}