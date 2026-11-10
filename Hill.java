// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Hill {
    public static void main(String[] args) {
       int key[][]={{3,3},{2,5}};
       int inv[][]={{15,17},{20,9}};

       String text="HELP";
        String enc="";
        String dec="";
       for(int j=0;j<text.length();j+=2){
          int p[]={text.charAt(j)-'A',text.charAt(j+1)-'A'};
          int c[]=new int [2];
          int d[]=new int[2];
          for(int i=0;i<2;i++)
              c[i]=(key[i][0]*p[0]+key[i][1]*p[1])%26;
           for(int i=0;i<2;i++)
              d[i]=(inv[i][0]*c[0]+inv[i][1]*c[1])%26;
           for(int i=0;i<2;i++){
               enc+=(char)(c[i]+'A');
               dec+=(char)(d[i]+'A');
           }
       }
           System.out.println("original: "+text);
          System.out.println("enc: "+enc);
          System.out.println("dec: "+dec);
       }
    }
