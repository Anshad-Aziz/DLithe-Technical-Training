import java.util.Scanner;
public class ZeroConverter{
    public static void neg(int n){
        if (n==0){
            System.out.println(" Already Zero");
        }
        else{
            while(n<=0){
                System.out.println(n+" ");
                n++;
            }
        }
    }
    public static void pos(int n){
        if(n==0){
            System.out.println("Already Zero");
        }
        else{
            while(n>=0){
                System.out.println(n+" ");
                n--;
            }
        }
    }
public static void main(String arg[]){
    Scanner sin=new Scanner(System.in);
    int n;
    System.out.println("Enter the Number:");
    n=sin.nextInt();
    if(n>=0){
        pos(n);
    }else{
        neg(n);
     }
}}
