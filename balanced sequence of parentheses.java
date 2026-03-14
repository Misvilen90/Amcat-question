import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int open = 0;
        int pair = 0;
        for( int i = 0 ; i < n.length() ; i++){
            char ch = n.charAt(i);
            if(ch=='('){
                open++;
            }
            else if(ch == ')'){
                if(open > 0){
                    pair++;
                    open--;
                }else{
                    System.out.println("-1");
                    return;
                }
            
            }
        }
        if(open == 0 && pair > 0){
            System.out.println(pair);
        }else{
            System.out.println("-1");
        }
    }
}
