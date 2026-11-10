// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.security.*;
import java.util.*;

class SHA1 {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter text:");
        String text=sc.nextLine();

        MessageDigest md=MessageDigest.getInstance("SHA-1");
        byte[]hash=md.digest(text.getBytes());
        String res=" ";
        for(byte b:hash){
            res+=String.format("%02x",b);
        }
            
         System.out.println("original m:"+text);
          System.out.println("message digest:"+res);
        sc.close();
    }
}
