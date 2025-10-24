import java.util.Scanner;
public class Hello{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :-> ");
		int x = sc.nextInt();
		System.out.println("You Entered Number :-> " + x);
		for(int i = 0 ; i < x ; i++){
			System.out.println("Hello System ");
		}
	}
}