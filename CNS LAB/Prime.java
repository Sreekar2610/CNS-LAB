import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :-> ");
		int x = sc.nextInt();
		System.out.println("You Entered Number :-> " + x);
		if(x<=1){
flag = false;
	}else{
for(int i = 2 ; i <= x/2 ; i++){
			if(x%i==0){
				flag = false;
				break;
			}
		}
}
if(flag){
System.out.print("Prime");
}
else{
System.out.print("Not prime");
			}

	}
}