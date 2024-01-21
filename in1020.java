import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
         Scanner sin=new Scanner(System.in);
        System.out.println("Enter the first digit:");
        int a=sin.nextInt();
        System.out.println("Enter the Second digit:");
        int b=sin.nextInt();
        System.out.println(in1020( a, b));
    }
    public static boolean in1020(int a,int b){
        return(10<=a && a<=20||10<=b &&b<=20);
    }
}