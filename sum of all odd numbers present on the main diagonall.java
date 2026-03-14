import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int j = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            if(i == j ){
                if(arr[i][j]%2!=0){
                    sum+=arr[i][j];
                }
            }
            j++;
        }
        System.out.println(sum);
        
    }
}
