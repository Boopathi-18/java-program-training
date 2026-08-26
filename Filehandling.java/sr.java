import java.util.*;

public class sr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = 0;

        for (int num : nums) {
            if (k < 2 || num != nums[k - 2]) {
                nums[k] = num;
                k++;
            }
        }

        System.out.println(k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}