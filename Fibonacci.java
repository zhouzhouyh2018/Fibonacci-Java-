import java.math.BigInteger;
import java.util.Scanner;
public class Fibonacci{
    public static BigInteger of(int num){
        BigInteger num1 = BigInteger.ONE;
        BigInteger num2 = BigInteger.ONE;
        BigInteger temp = BigInteger.ZERO;
        for(int i = 1; i <= num; ++i){
            if(i <= 2)
            	num1 = BigInteger.ONE;
            else{
            	
            	
            	temp = num1.add(num2);
            	num2 = num1;
            	num1 = temp;
            }
        }
        return num1;
    }
    public static void main(String[] args){
    	System.out.println("Please enter a number:");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            for(int i=1;i<=200;++i){
            	System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci.of(i));
            }
        }
    }
}
