import java.util.Scanner;

public class cmth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();

        int hours = minutes / 60;
        int remaining = minutes % 60;

        System.out.println(hours + " hours " + remaining + " minutes");
    }
}