import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class DES{
  public static void main(String args[]) throws Exception{
    Scanner sc = new Scanner(System.in);
    
// take message to encrypt
    System.out.print("Enter message to encrypt:");
    String msg=sc.nextLine();
    byte[] message = msg.getBytes();

// take custom key and prepare key
    System.out.print("Enter custom key:");
    String key = sc.nextLine();
    byte[] keyData = key.getBytes();
    DESKeySpec secretKey = new DESKeySpec(keyData);
    SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
    SecretKey KeyN = keyFactory.generateSecret(secretKey);
    
// ENCRYPTION 
   Cipher cipher = Cipher.getInstance("DES");
   cipher.init(Cipher.ENCRYPT_MODE, KeyN);
   byte[] encrypted = cipher.doFinal(message);

// DEcryption
   cipher.init(Cipher.DECRYPT_MODE, KeyN);
   byte[] decrypted = cipher.doFinal(encrypted);
   String decryptedMsg = new String(decrypted);
//  OUTPUT
   System.out.println("MESSAGE: "+ msg);
   System.out.println("ENCRYPTEd: "+ encrypted);
   System.out.println("Decrypted : "+ decryptedMsg);

}
}
    
    
