// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;

class Blowfish{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter text:");
        String text=sc.nextLine();
        System.out.println("KEY:");
        String key=sc.nextLine();
        SecretKeySpec secretKey=new SecretKeySpec(key.getBytes(),"Blowfish");
        Cipher cipher=Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
        byte[]encrypted=cipher.doFinal(text.getBytes());
        String enc=Base64.getEncoder().encodeToString(encrypted);
        System.out.println("original"+text);
        System.out.println("encrypted"+enc);

        cipher.init(Cipher.DECRYPT_MODE,secretKey);
        byte[]dec=cipher.doFinal(encrypted);
        System.out.println("decrypted:"+new String(dec));
 
            
}
}
