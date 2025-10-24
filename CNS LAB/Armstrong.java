import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int a = sc.nextInt();
System.out.print("Enter a number :");
	int b = sc.nextInt();
	
	
for(int i = a ; i <=b ; i++){
	System.out.println(a);
}
		
	}

	public int isArm(int num){
		int temp = num;
	int numLength = String.valueOf(num).length();
	int sum = 0;
	while(temp!=0){
	int back = temp%10;
	sum += Math.pow(back,numLength);
	temp = temp/10;

	}
	if(num == sum)
{
return sum;
}
return -1;
	}

}