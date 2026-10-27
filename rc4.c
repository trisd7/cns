

import java.util.*;
class RC4 {
    static byte[] rc4(byte[] data, String key) {
        int s[] = new int[256];
        int j = 0, t;

        for (int i = 0; i < 256; i++)
            s[i] = i;

        for (int i = 0; i < 256; i++) {
            j = (j + s[i] + key.charAt(i % key.length())) % 256;
            t = s[i];
            s[i] = s[j];
            s[j] = t;
        }

        byte[] out = new byte[data.length];
        int i = 0;
        j = 0;

        for (int n = 0; n < data.length; n++) {
            i = (i + 1) % 256;
            j = (j + s[i]) % 256;

            t = s[i];
            s[i] = s[j];
            s[j] = t;

            out[n] = (byte)(data[n] ^ s[(s[i] + s[j]) % 256]);
        }
        return out;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter key: ");
        String key = sc.nextLine();

        byte[] enc = rc4(text.getBytes(), key);
        System.out.println("Encrypted: " +
            Base64.getEncoder().encodeToString(enc));

        byte[] dec = rc4(enc, key);
        System.out.println("Decrypted: " + new String(dec));
    }
}
