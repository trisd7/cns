
import java.util.*;
import java.security.*;

class MD5 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte b[] = md.digest(text.getBytes());

        for (byte x : b)
            System.out.printf("%02x", x);

        sc.close();
    }
}
