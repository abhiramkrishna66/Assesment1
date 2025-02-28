public class AbundantArr {
    public static boolean Abundant(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
       return sum>num;

    }
    public static void main(String[] args) {
        int arr[][]={{12,345,567},{1449,1775,1983},{27,145,1557}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(Abundant(arr[i][j])){
                    System.out.println(arr[i][j]);

                }
            }
        }
    }
    
}
