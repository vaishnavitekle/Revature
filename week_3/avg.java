class avg {
    private static double average(int[] arr){
        if(arr.length==0) return 0;
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(average(arr));
    }
}
