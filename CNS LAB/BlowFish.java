import java.util.*;
import java.security.GeneralSecurityException;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class BlowFish{
	public static void main(String[] args) throws GeneralSecurityException{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter message to encrypt : ");
	String msg = sc.nextLine();
	byte[] message = msg.getBytes();
	
	System.out.print("Enter custom key : ");
	String key = sc.nextLine();
	byte[] keyData = key.getBytes();

	SecretKeySpec secretKey =new SecretKeySpec(keyData, "Blowfish");

	Cipher cipher = Cipher.getInstance("BlowFish");
	cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	byte[] encrypted = cipher.doFinal(message);

	cipher.init(cipher.DECRYPT_MODE,secretKey);

	byte[] decrypted = cipher.doFinal(encrypted);
	String decryptedMsg = new String(decrypted);
	
	System.out.println("Message : " + msg);
	System.out.println("Encrypted : " + encrypted);
	System.out.println("Decrypted : "+ decryptedMsg);
}	
}