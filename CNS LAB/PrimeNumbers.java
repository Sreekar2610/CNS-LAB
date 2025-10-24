import java.util.Scanner;
public class PrimeNumbers{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int a = sc.nextInt();
	System.out.print("Enter a number :");
	int b = sc.nextInt();
	System.out.println("Prime Numbers Between "+ a + "&" + b + " are");

	for(int i = a ; i <= b ; i++){
	boolean isPrime = true;
	for(int j = 2 ; j <= a/2 ; j++){
		if(a%j==0){
isPrime = false;
break;
		}
	}
if(isPrime){
System.out.println(i);
	}
	}

	}
}