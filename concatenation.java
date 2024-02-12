import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static int[] getConcatenatedArray(int[] nums){
        int n=nums.length;
        int [] ans=new int[2*n];
        for (int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
    public static void main(String []args){
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the number  of array:");
        int n=sin.nextInt();
        
        int nums[]=new int[n];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            nums[i]=sin.nextInt();
        }
        int [] result=getConcatenatedArray(nums);
        System.out.println("Array is ");
        System.out.println(Arrays.toString(result));
    }
}
