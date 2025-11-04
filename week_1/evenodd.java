public class Max {
    private static boolean max(int a) {
        if(a%2 == 0){
          return true;
        }
      else{
        return false;
      }
    }
    public static void main(String[] args) {
        int a = 5;
        boolean b = even(a);
        System.out.println("the number is even"+b);
    }
}
