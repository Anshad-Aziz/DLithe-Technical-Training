import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the first digit:");
        int a=sin.nextInt();
        System.out.println("Enter the second digit:");
        int b=sin.nextInt();
        System.out.println(LastDigit(a,b));
    }
    public static boolean LastDigit(int a,int b){
    int lastDigitA=a%10;
    int lastDigitB=b%10;
    return lastDigitA==lastDigitB;
}
}