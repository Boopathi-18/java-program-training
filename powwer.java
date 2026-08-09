public class powwer {
    public static void main(String[] args) {
        int n = 16;

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}