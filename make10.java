import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
         Scanner sin=new Scanner(System.in);
        System.out.println("Enter the first digit:");
        int a=sin.nextInt();
        System.out.println("Enter the Second digit:");
        int b=sin.nextInt();
        System.out.println(make10( a, b));
    }ss
    public static boolean make10(int a,int b){
        return(a==10||b==10||a+b==10);
    }
}