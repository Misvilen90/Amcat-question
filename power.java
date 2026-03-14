import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exp = sc.nextInt();
		double result = 1.0;
		
		int abs_exp = Math.abs(exp);
		for(int i=0;i<abs_exp;i++) {
			result = result * base;
		}
		
		if(exp<0) {
			result = 1.0 / result;
		}
		
		System.out.printf("%.2f",result);
		sc.close();
	}
}
