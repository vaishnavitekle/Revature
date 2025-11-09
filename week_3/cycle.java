package week_2;
class cycle {
    private static boolean cycleCheck(String[] arr){
        if(arr.length==0) return false;
        //else {char lastChar=arr[0].charAt(arr[0].length()-1);}
        for(int i=1;i<arr.length;i++){
            char firstChar=arr[i].charAt(0); 
            char lastChar=arr[i-1].charAt(arr[i-1].length()-1);
            if(firstChar!=lastChar){
                return false;
            }
            }
        return true;
    }
    public static void main(String[] args) {
        String[] arr= {"apple", "eat", "tomato", "arange"};
        System.out.println(cycleCheck(arr));
    }
}
