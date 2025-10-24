import java.util.*;
public class RSA{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Prime Number for 'p' : ");
	int p = sc.nextInt();
	System.out.print("Enter a Prime Number for 'q' : ");
	int q = sc.nextInt();
	
	int n = p*q;
		
	System.out.println("The value of n : " + n);
	
	int m = (p-1)*(q-1);
		
	System.out.println("The value of Totient Function : " + m);

	int e = 3;
	
	
	System.out.print("Enter a Integer Message : ");

	int M = sc.nextInt();
	
	
	int C = (M^e)%n;
	System.out.println("Cipher Text : " + C);
	for(int d = 0 ; d< n; d++)
	{	

		int DM = (C^d)%n;
		System.out.println("Decrypted Message : index :"+ d + DM);
	}
	

}
}