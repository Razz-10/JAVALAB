public class ArrayBalancer {
    public static int isBalanced(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 1; // An empty array is considered balanced
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                return 0; // Even-indexed elements should be even
            } else if (i % 2 != 0 && arr[i] % 2 == 0) {
                return 0; // Odd-indexed elements should be odd
            }
        }

        return 1; // The array is balanced
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 6};

        System.out.println(isBalanced(arr1)); // Output: 1 (Balanced)
        System.out.println(isBalanced(arr2)); // Output: 0 (Not balanced)
    }
}