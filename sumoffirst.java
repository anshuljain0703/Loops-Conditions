package loops;
import java.util.Scanner;
public class sumoffirst {
    public static void main(String [] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        while(num<=n){
            sum+=num;
            num++;
        }
        System.out.println("Sumof first n natural numbers is:"+sum);
        
    }
    
}
