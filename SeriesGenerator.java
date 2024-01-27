import java.util.Scanner;
public class SeriesGenerator{
    public static void main(String args[]){
        Scanner sin=new Scanner(System.in);
        int q=sin.nextInt();
        for (int i=0;i<q;i++){
            int a=sin.nextInt();
            int b=sin.nextInt();
            int n=sin.nextInt();
            generateSeries(a,b,n);
        }
    }
    public static void generateSeries(int a,int b,int n){
        int currentTerm=a;
        int powerOfTwo=1;
        System.out.println(currentTerm);
        for(int i=0;i<n;i++){
            currentTerm+=powerOfTwo*b;
            System.out.println(" "+currentTerm);
            powerOfTwo*=2;
        }
        System.out.println();
    }
}
