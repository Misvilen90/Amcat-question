import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int a = 1; a <= n; a++){
            for(int b = a + 1; b <= n; b++){

                int c = (int)Math.sqrt(a*a + b*b);

                if(c <= n && c*c == a*a + b*b){
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }
}
