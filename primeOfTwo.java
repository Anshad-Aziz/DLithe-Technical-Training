import java.util.Scanner;

public class StringMultiplier {

    public static void main(String args[]) {
        Scanner sin = new Scanner(System.in);
        int a=sin.nextInt();
        int b=sin.nextInt();
        System.out.println(sumPrime(a,b)?"True":"False");
    }

    public static boolean sumPrime(int a, int b) {
        if(!isPrime(a)||!isPrime(b)){
            return false;
        }
        return isPrime(a+b);
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
