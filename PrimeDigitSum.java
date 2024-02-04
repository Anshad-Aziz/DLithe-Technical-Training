import java.util.Scanner;
public class PrimeDigitSum{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n<=3){
            return true;
        }
        if(n%2==0||n%3==0){
            return false;
        }
         int i=5;
         while (i*i<=n){
             if (n%i==0 || n%(i+2)==0){
                 return false;
             }
             i+=6;
         }
         return true;
        }
        public static boolean isPrimeDigitSumPrime(int x){
            if(x<=0){
                return false;
            }
            int primeDigitSum=0;
            while (x>0){
                int digit=x%10;
                if (isPrime(digit)){
                    primeDigitSum+=digit;
                }
                    x/=10;
                }
                return isPrime(primeDigitSum);
        }
        public static void main(String []arg){
            Scanner sin=new Scanner(System.in);
            System.out.println("Enter the a Number:");
            int a =sin.nextInt();
            System.out.println(isPrimeDigitSumPrime(a));
        }
}