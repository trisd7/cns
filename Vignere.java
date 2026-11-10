// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Vignere {
    public static void main(String[] args) {
      String text="HELLO";
      String key="KEY";
      String enc="";
      String dec="";
      for(int i=0;i<text.length();i++){
          int p=text.charAt(i)-'A';
          int k=key.charAt(i%key.length())-'A';
          enc+=(char)((p+k)%26+'A');
      }
    for(int i=0;i<enc.length();i++){
          int p=enc.charAt(i)-'A';
          int k=key.charAt(i%key.length())-'A';
          dec+=(char)((p-k+26)%26+'A');
        
      }
        System.out.println("original text: "+text);
        System.out.println("encrypted text: "+enc);
        System.out.println("dec text: "+dec);
    }
}
