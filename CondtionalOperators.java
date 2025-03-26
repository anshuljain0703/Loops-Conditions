import java.util.Scanner;
public class CondtionalOperators {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num=sc.nextInt();
        if(num%2==0 && num%3==0){
            System.out.print("Number Found:"+num);
        }else{
            System.out.println("Number not found");
        }
    }
    
}
