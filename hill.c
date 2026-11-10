// Online C compiler (editor)
// Write and run C online using this editor.

#include <stdio.h>
#include<stdio.h>
int main() {
 char text[100];
 char enc[200],dec[200];
int i,a,b,x,y;
int key[2][2]={{3,3},{2,5}};
int inv[2][2]={{15,17},{20,9}};
printf("enter text:\n");
scanf("%s",text);
for(i=0;text[i]!='\0';i+=2){
    a=text[i]-'A'; b=text[i+1]-'A';
    x=(key[0][0]*a+key[0][1]*b)%26;
    y=(key[1][0]*a+key[1][1]*b)%26;
    enc[i]=x+'A'; enc[i+1]=y+'A';
}
enc[i]='\0';
for(i=0;enc[i]!='\0';i+=2){
    a=enc[i]-'A'; b=enc[i+1]-'A';
    x=(inv[0][0]*a+inv[0][1]*b)%26;
    y=(inv[1][0]*a+inv[1][1]*b)%26;
    dec[i]=x+'A'; dec[i+1]=y+'A';
}
dec[i]='\0';
printf("original mess:%s\n",text);
printf("encrypted: %s\n",enc);
printf("decrypted: %s\n",dec);
return 0;
}
