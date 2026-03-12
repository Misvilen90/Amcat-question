import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int base = 1;
       int result = 0;
       while(n!=0){
           int rem = n%10;
           result += rem*base;
           base *= 2;
           n/=10;
       }
       System.out.println(result);
    }
}
