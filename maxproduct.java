public class maxproduct {
    public static void main (String args[]){
       int pree=1;
       int suff=1;
       int ans = Integer.MIN_VALUE; 
       int arr[]={ 2,3,-2,4 };
       // tre code 
       for(int i =0;i < arr.length;i++){
        if(pree==0){
            pree=1;
        }
        if(suff==0){
            suff=1;
        }
        pree*=arr[i];
        suff*=arr[arr.length-i-1];
        ans=Math.max(ans,Math.max(pree,suff));

       }
       System.out.println("max product is :"+ ans );
    }
    
}
