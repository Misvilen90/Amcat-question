import java.util.*;
class Main {
    public static boolean bsearch(int[] arr,int x,int left , int right){
        if(left > right){
            return false;
        }
        int mid = (left+right)/2;
        
        if(arr[mid] == x){
            return true;
        }else{
            if(arr[mid]< x){
                return bsearch(arr , x , mid+1 , right);
            }else{
                return bsearch(arr , x, left , mid-1);
            }
            
        }
        
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       for(int i=0 ; i < n ; i++){
           arr[i]=s.nextInt();
       }
       int x = s.nextInt();
       Arrays.sort(arr);
       boolean search = bsearch(arr,x,0,n);
       if(search){
           System.out.println("The search number is found in the array");
       }else{
           System.out.println("The search number not is found in the array");
       }
    }
}
