
#include <stdio.h>
#include <string.h>

int main() {
    unsigned char s[256], temp;
    char text[] = "HELLO";
    char key[] = "KEY";
    unsigned char cipher[100], decrypt[100];
    int i, j = 0, k, t, n;

    n = strlen(text);

    // Initialize S array
    for(i = 0; i < 256; i++)
        s[i] = i;

    // KSA
    for(i = 0; i < 256; i++) {
        j = (j + s[i] + key[i % 3]) % 256;

        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    // Encryption using PRGA
    i = j = 0;

    for(k = 0; k < n; k++) {
        i = (i + 1) % 256;
        j = (j + s[i]) % 256;

        temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        t = (s[i] + s[j]) % 256;
        cipher[k] = text[k] ^ s[t];
    }
    cipher[n]='\0';
    printf("Original: %s\n", text);

    printf("Encrypted: ");
    for(k = 0; k < n; k++)
        printf("%c", cipher[k]);

    // Reset S array and perform KSA again
    for(i = 0; i < 256; i++)
        s[i] = i;

    j = 0;

    for(i = 0; i < 256; i++) {
        j = (j + s[i] + key[i % 3]) % 256;

        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    // Decryption
    i = j = 0;

    for(k = 0; k < n; k++) {
        i = (i + 1) % 256;
        j = (j + s[i]) % 256;

        temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        t = (s[i] + s[j]) % 256;
        decrypt[k] = cipher[k] ^ s[t];
    }

    decrypt[n] = '\0';

    printf("\nDecrypted: %s", decrypt);

    return 0;
}
