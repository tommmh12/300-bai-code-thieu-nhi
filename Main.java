import java.util.Scanner;

public class Main {
    public static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {


        int a = x.nextInt();
        int b = x.nextInt();
        int k = x.nextInt();

        System.out.print("Uoc chung lon nhat la thu " + k +" la : " + UCLN_k(a,b,k));
    }

    public static int UCLN_k(int a, int b,int k){
        int g = UCLN(a,b) ;
        return find_UCLN_k(g,k);
    }
    public static int UCLN(int a, int b){
        if(b == 0) return a;
        return UCLN(b, a % b);
    }
    public static int find_UCLN_k(int a, int k){
        int count = 0;
        for(int i = 1; i < a; i++ ){
            if(a % i ==0)
            count++;
            if(count == k ) {
                return i;
            }
        }
        return -1;
    }
}