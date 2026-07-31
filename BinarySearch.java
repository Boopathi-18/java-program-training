public class BinarySearch {
    public static int binarySearch(int[] arr, int n, int key) {
        int l = 0;
        int u = n - 1;

        while (l <= u) {
            int mid = (l + u) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                l = mid + 1;
            } else {
                u = mid - 1;
            }
        }
        return -1;
    }

public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int n = arr.length;
    int key = 5;
    
    int result = binarySearch(arr, n, key);
    
    if (result != -1) {
        System.out.println("Target value found at index: " + result);
    } else {
        System.out.println("Not found");
    }
}
}