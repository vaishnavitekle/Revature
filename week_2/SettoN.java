public class Move {
    private static void setton(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        
        System.out.print("Modified array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n=3;
        setton(arr, n);
    }
}
