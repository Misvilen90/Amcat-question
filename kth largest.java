import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int pre = Integer.MIN_VALUE;
        int count = 0;
        int remove = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            if(temp[i]!=pre){
                pre = temp[i];
                count++;
            }
            if(count==k){
                remove = temp[i];
                break;
            }
        }
        for(int num : arr){
            if(num!=remove){
                System.out.print(num+" ");
            }
        }
        System.out.println();
    }
}
