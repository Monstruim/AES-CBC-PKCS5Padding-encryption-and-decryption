package ret;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Scanner;
import java.security.SecureRandom;

public class EncryptionTest
{

	public static void main(String[] args) {

		
		byte[] key = "A13S2000B33425fv".getBytes();

		
		byte[] plainText = "Hello world, Hello world.".getBytes();

		
		byte[] IV = "012345679abcdefx".getBytes();
		
		try {

			
			SecretKeySpec SK = new SecretKeySpec(key, "AES");
			
			IvParameterSpec IVK = new IvParameterSpec(IV);
			
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

			cipher.init(Cipher.ENCRYPT_MODE, SK,IVK);

			
			byte[] cipherText = cipher.doFinal(plainText);
			
			System.out.println(" ");
			 System.out.print("The plainText is: ");
			  System.out.println(new String(plainText));
			   System.out.println(" ");
			    System.out.println("And after the Encryption  ");
			     System.out.print("The CipherText is:  ");
			      System.out.print(new String(cipherText));
			       System.out.println("");	
			
		cipher.init(Cipher.DECRYPT_MODE, SK,IVK);
			byte[] AFDec = cipher.doFinal(cipherText);
			
			 System.out.println("");
			  System.out.println("The Text after decrpyting: ");
			   System.out.println(new String(AFDec));
			    System.out.println("");
			     System.out.print("the IV code is: "+new String(IV));
		}
	
	    catch (Exception e) {

			System.out.println("Exception!");

		}

	}

}
 
 
 
 
 

    
    

		
 