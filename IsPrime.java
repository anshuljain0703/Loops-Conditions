import java.util.Scanner;
public class IsPrime {
  public  static boolean isprime(int num){
    if(num<=1){
        return false;
    }
    for(int i=2;i<num;i++){
        if(num%i==0){
            return false;
        }
    }
return true;
    }
    public static void main(String[] args) {
       int num=11;
       if(isprime(num)){
        System.out.println("True");
       }
       else{
        System.out.println("False");
       }
       
    }
}
