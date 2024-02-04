import java.util.*;
class SeriesCalculate{
    public static void main(String[] args){
        Scanner sin=new Scanner(System.in);
        int a,b,n;
        System.out.println("Enter the value of a:");
        a=sin.nextInt();
        System.out.println("Enter the value of b:");
        b=sin.nextInt();
        System.out.println("Enter the value of n:");
        n=sin.nextInt();
        if(a<0||a>50||b<0||b>50||n<0||n>15){
            System.out.println("Enter the vaild input 0 <= a,b <= 50 and 0 <= n <= 15");
            return ;
        }
        int currentSum=a;
        for (int i=0;i<n;i++){
            int power=(int)Math.pow(2,i);
            currentSum+=power*b;
            System.out.println(currentSum+" ");
        }
        System.out.println();
    }
}