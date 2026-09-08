import java.util.*;

public class cco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = Math.max(n - 999, 0);

        System.out.println(result);
    }
}