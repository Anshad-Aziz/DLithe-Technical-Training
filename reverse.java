import java.util.*;
class Reverse{
    public static int reverse(int x){
        int reverse=0;
        int sign=1;
        if(x<0){
            sign=-1;
            x=-x;
        }
        while(x>0){
            int digit=x%10;
            reverse=reverse*10+digit;
            x/=10;
        }
        return reverse*sign;
    }
    
    public static void main(String[] args){
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the value :");
        int a=sin.nextInt();
        int result=reverse( a);
        System.out.println(result);
    }
}