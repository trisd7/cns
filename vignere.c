// Online C compiler (editor)
// Write and run C online using this editor.

#include <stdio.h>
#include<string.h>
int main() {
char text[]="HELLO"; char key[]="MYKEY";
char enc[100];char dec[100];
int i,k,n=strlen(key);
for(i=0;text[i]!='\0';i++){
    k=key[i%n]-'A';
    enc[i]=(text[i]-'A'+k)%26 + 'A';   
}
enc[i]='\0';
 for(i=0;enc[i]!='\0';i++){
    k=key[i%n]-'A';
    dec[i]=(enc[i]-'A'-k+26)%26 + 'A';   
}
dec[i]='\0';
printf("original message: %s\n",text);
printf("key: %s\n",key);
printf(" encrypted message: %s\n",enc);
printf(" decrypted message: %s\n",dec);
return 0;  
}
