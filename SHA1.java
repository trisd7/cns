import java.util.*;
import java.security.*;
class SHA1{
    public static void main(String[]args)throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.print("enter text:");
        String text=sc.nextLine();

        MessageDigest md=MessageDigest.getInstance("SHA-1");
        byte[]b=md.digest(text.getBytes());
       System.out.println("Message Digest");
        for(byte x:b)
            System.out.printf("%02x",x);
        
        
    }
}
