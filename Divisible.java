import java.util.Scanner;
public class Divisible {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter number:");
        int num=sc.nextInt();
        if(num%3==0 || num%5==0){
            System.out.println("Number Found:"+num);
        }
    }
    
}
