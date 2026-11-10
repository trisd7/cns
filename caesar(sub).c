// Online C compiler (editor)
// Write and run C online using this editor.

#include <stdio.h>
#include<string.h>

int main() {
  char text[]="HELLO";
  char enc[100];char dec[100];
  int i,shift=3;
  for(i=0;text[i]!='\0';i++){
      enc[i]=(text[i]-'A'+shift)%26+'A';
      
  }
    enc[i]='\0';
    for(i=0;enc[i]!='\0';i++){
      dec[i]=(enc[i]-'A'-shift+26)%26+'A';
      
  }
    dec[i]='\0';
    printf("oroginal:%s\n",text);
    printf("encryptes:%s\n",enc);
    printf("decryptes:%s\n",dec); 
    return 0;
}
