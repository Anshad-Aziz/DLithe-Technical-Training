import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the first digit:");
        int a=sin.nextInt();
        System.out.println("Enter the Second digit:");
        int b=sin.nextInt();
        System.out.println(SumDouble(a,b));
        
    }
    public static int SumDouble(int a,int b){
    if (a == b) {
    return (2 *(a+b));
  } else {
    return (a+b);  
  }
        
}
}