import java.util.*;
public class HillCipher{
 //det
 static int determinant(int[][] m){
    int det=(m[0][0]*m[1][1] - m[0][1]*m[1][0])%26;
    if(det<0)det+=26;
    return det;
 }

 //inverse
 static int modInverse(int det){
    for(int i=1;i<26;i++){
       if((det*i)%26==1)return i;
    }
    return -1;
 }

 //adjoint
 static int[][] adjoint(int[][] m){
   int[][] adj= new int[2][2];
   adj[0][0]= m[1][1];
   adj[0][1]= -m[0][1];
   adj[1][0]= -m[1][0];
   adj[1][1]= m[0][0];
   return adj;
 }
 
//2x2mat with 2x1key
 static int[] multiply(int[][] m,int[] v){
   int[] result=new int[2];
   for(int i=0;i<2;i++){
     result[i]=(m[i][0]*v[0]+m[i][1]*v[1])%26;
     if(result[i]<0) result[i]+=26;
   }
   return result;
 }

 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int[][] key=new int[2][2];
  System.out.println("enter 2x2 key matrix(must be invertible mod 26):");
  for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
      key[i][j]=sc.nextInt();
    }
  }

  sc.nextLine();
  System.out.print("enter plaintext(2 letters,lowercase):");
  String word= sc.nextLine().toLowerCase();
  if(word.length()!=2){
    System.out.println("plaintext musr be exactly 2 chara");
    return;
  }
  int[] textVec=new int[2];//convert plaintext to numeric
  for(int i=0;i<2;i++){
    textVec[i]=word.charAt(i)-'a';
  }

  //encrypt
  int[] encryptedVec= multiply(key,textVec);
  StringBuilder encrypted= new StringBuilder();
  for(int val: encryptedVec) encrypted.append((char)(val+'a'));
  System.out.println("encrypted text:"+encrypted);

  //decrypt
  int det=determinant(key);
  int invDet= modInverse(det);
  if(invDet == -1){
    System.out.println("key is not invertible.Decryption not possible");
    return;
  }
  
  int[][] adj=adjoint(key);
  int[][] invKey= new int[2][2];
  for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
      int val= adj[i][j]*invDet;
      val%=26;
      if(val<0)val+=26;
      invKey[i][j]=val;
    }
  }

  int[] decryptedVec=multiply(invKey,encryptedVec);
  StringBuilder decrypted=new StringBuilder();
  for(int val:decryptedVec) decrypted.append((char)(val+'a'));
  System.out.println("Decrypted Text:"+decrypted);
  sc.close();
 }
}
  








