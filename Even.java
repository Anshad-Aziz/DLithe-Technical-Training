mport java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the first digit:");
        int a=sin.nextInt();
       
        System.out.println(Even(a));
    }
    public static boolean Even(int a){
    int even=a%2;
    return even==0;
}
}