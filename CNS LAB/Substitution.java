import java.util.*;

public class Substitution{
	public static String Cipher(String text){
	StringBuilder result = new StringBuilder();
	for(char c : text.toCharArray()){
		if(c >= 'A' && c <= 'Z'){
			result.append((char)('Z' - (c-'A')));
		}else if (c >= 'a' && c <= 'z'){
			result.append((char)('z'-(c-'a')));	
		}else{
			result.append(c);
		}
	}	
	return result.toString();
}

public static void main(String[] args){
	String message;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Message : ");
	message = sc.nextLine();
	String encrypted = Cipher(message);
	String decrypted = Cipher(encrypted);


	System.out.println("Message : " + message);
	System.out.println("Encrypted : " + encrypted);
	System.out.println("Decrypted : "+ decrypted);


	
}

}