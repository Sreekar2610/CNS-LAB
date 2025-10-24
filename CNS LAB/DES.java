import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;
public class DES{
	public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Message to Encrypt : ");
	String msg = sc.nextLine();
	byte[] message = msg.getBytes();

	System.out.print("Enter Custom Key : ");
	String key = sc.nextLine();
	byte[] keyData = key.getBytes();

	DESKeySpec secretKey = new DESKeySpec(keyData);
	SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
	SecretKey keyN = keyFactory.generateSecret(secretKey);

	Cipher cipher = Cipher.getInstance("DES");
	cipher.init(cipher.ENCRYPT_MODE,keyN);

	byte[] encrypted = cipher.doFinal(message);
	cipher.init(cipher.DECRYPT_MODE,keyN);

	byte[] decrypted = cipher.doFinal(encrypted);

	String decryptedMsg = new String(decrypted);


	System.out.println("Message : " + msg);
	System.out.println("Encrypted Message : " + encrypted);
	System.out.println("Decrypted Message : " + decryptedMsg);
}
}