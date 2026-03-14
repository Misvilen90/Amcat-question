import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        int h = h1-h2;
        int m = m1-m2;
        int s = s1-s2;
        if(s < 0){
            s+=60;
            m--;
        }
        if(m<0){
            m+=60;
            h--;
        }
        System.out.println(h+":"+m+":"+s);
    }
}
