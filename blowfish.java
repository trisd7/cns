
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;

class Blowfish {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter key: ");
        String key = sc.nextLine();

        SecretKeySpec sk = new SecretKeySpec(key.getBytes(), "Blowfish");
        Cipher c = Cipher.getInstance("Blowfish");

        // Encryption
        c.init(Cipher.ENCRYPT_MODE, sk);
        byte[] enc = c.doFinal(text.getBytes());
        System.out.println("Encrypted: " +
            Base64.getEncoder().encodeToString(enc));

        // Decryption
        c.init(Cipher.DECRYPT_MODE, sk);
        byte[] dec = c.doFinal(enc);
        System.out.println("Decrypted: " + new String(dec));
    }
}
