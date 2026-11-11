public class kadanealgo{
    public static void main(String args[]){
        int arr[]={ 2,3,-2,4,-1 };
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currsum +=arr[i];
            maxsum = Math.max(currsum,maxsum);

            if(currsum<0){
                currsum = 0;
            }
        


        }
         System.out.println("maxsum is :"+ maxsum );

    }
}