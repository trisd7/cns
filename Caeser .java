// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Caeser {
    public static void main(String[] args) {
      String text="HELLO";
      String key="KEY";
      String enc="";
      String dec="";
      for(int i=0;i<text.length();i++){
          char ch=text.charAt(i);
          enc+=(char)((ch-'A'+3)%26+'A');
          
      }
       for(int i=0;i<enc.length();i++){
          char ch=enc.charAt(i);
          dec+=(char)((ch-'A'-3+26)%26+'A');
          
      }  
        System.out.println("text: "+text);
        System.out.println("enc: "+enc);
                System.out.println("dec "+dec);
    }
}
