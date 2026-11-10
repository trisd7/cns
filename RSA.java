// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.math.BigInteger;
class RSA{
    public static void main(String[] args) {
     int p=3;
     int q=11;
      int n=p*q;int phi=(p-1)*(q-1);
     int e=3;int d=7;
     int msg=4;
     BigInteger N=BigInteger.valueOf(n);
     BigInteger enc=BigInteger.valueOf(msg).modPow(BigInteger.valueOf(e),N);
     BigInteger dec=enc.modPow(BigInteger.valueOf(d),N);
    
        System.out.println("Original: " + msg);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
        
    }
}
