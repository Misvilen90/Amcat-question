import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m1 = sc.next();
        int d1=sc.nextInt();
        String m2 = sc.next();
        int d2 = sc.nextInt();
        if(m1.equals(m2)&&d1==d2){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
