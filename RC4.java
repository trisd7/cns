
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

class RC4 {
    public static void main(String args[]) throws Exception {
        String text = "Hello world";
        String key = "KEY12";

        SecretKeySpec secret =
            new SecretKeySpec(key.getBytes(), "ARCFOUR");

        Cipher c = Cipher.getInstance("ARCFOUR");

        // Encryption
        c.init(Cipher.ENCRYPT_MODE, secret);
        byte[] encrypted = c.doFinal(text.getBytes());

        System.out.println("Original: " + text);
        System.out.println("Encrypted: " +
            Base64.getEncoder().encodeToString(encrypted));

        // Decryption
        c.init(Cipher.DECRYPT_MODE, secret);
        byte[] decrypted = c.doFinal(encrypted);

        System.out.println("Decrypted: " +
            new String(decrypted));
    }
}
