package mini_project;
import java.util.Scanner;
public class AffineChiper {
	 public static void main(String[]Args)
	 {
	       Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the plaintext to be encrypted: ");
	        String plaintext = sc.nextLine();
	        String ciphertext = encrypt(plaintext);
	        System.out.println("Ciphertext: "+ciphertext);
	        System.out.println("Decrypted Plaintext: "+decrypt(ciphertext));
	    }
	    public static String encrypt(String plaintext) {
	        String ciphertext = "";
	        int k1 = 7;
	        int k2 = 2;
	        for(int i=0;i<plaintext.length();i++) {
	            int p = (int)plaintext.charAt(i)-'a';
	            int c = ((p*k1)+k2)%26;
	            ciphertext += (char)(c+'a');
	        }
	        return ciphertext;
	    }
	    public static String decrypt(String ciphertext) {
	        String plaintext = "";
	        int k1 = 7;
	        int k2 = 2;
	        
	       
	        for(int i=0;i<ciphertext.length();i++) {
	            int c = (int)ciphertext.charAt(i)+'a';
	            int p = ((c*15)-k2)%26;
	            plaintext += (char)(p + 'a');
	           
	        }
			return plaintext;
}
}