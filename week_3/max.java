public class max {
    private static int maximum(int[] arr){
        if(arr.length==0) return Integer.MIN_VALUE;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr= {1,5,3,9,2};
        System.out.println(maximum(arr));
    }
}
