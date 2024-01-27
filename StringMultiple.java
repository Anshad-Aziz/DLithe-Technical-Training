import java.util.Scanner;

public class StringMultiplier {

    public static void main(String args[]) {
        Scanner sin = new Scanner(System.in);
        int n = Integer.parseInt(sin.nextLine());
        String s = sin.nextLine();
        String result = StringTime(n, s);
        System.out.println(result);
    }

    public static String StringTime(int n, String s) {
        if (n <= 0) {
            System.out.println("n cannot be negative");
            return ""; 
        } else {
            return s.repeat(n);
        }
    }
}
