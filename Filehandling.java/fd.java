import java.util.*;

public class fd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        int result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        System.out.println((char) result);
    }
}