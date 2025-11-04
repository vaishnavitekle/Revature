public class Max {
    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = max(a,b);
        System.out.println("The maximum of " + a + " and " + b + " is: " + max);
    }
}
