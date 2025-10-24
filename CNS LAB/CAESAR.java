import java.lang.String;
import java.util.*;
public class CAESAR{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Text : ");
	String text = sc.nextLine();
	System.out.print("Enter Key : ");
	int key = sc.nextInt();
	char arr[] = text.toCharArray();
	char result[] = new char[100];
	char result1[] = new char[100];
	for(int i = 0 ; i < text.length();i++){
		result[i] = (char)(arr[i]+key);	
	}
	for(int i = 0 ; i < text.length();i++){
		result1[i] = (char)(result[i]-key);	
	}
	for(int i = 0 ; i < text.length();i++){
		System.out.print(result1[i]);
	}
		
}
}