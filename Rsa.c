
#include <stdio.h>

int main() {
    int p, q, n, phi, e, d, m, c, dec;

    printf("Enter p and q: ");
    scanf("%d%d", &p, &q);

    n = p * q;
    phi = (p - 1) * (q - 1);

    printf("Enter e: ");
    scanf("%d", &e);

    d = 1;
    while ((e * d) % phi != 1)
        d++;

    printf("Enter message: ");
    scanf("%d", &m);

    c = 1;
    for (int i = 0; i < e; i++)
        c = c * m % n;

    dec = 1;
    for (int i = 0; i < d; i++)
        dec = dec * c % n;

    printf("Public key: (%d, %d)\n", e, n);
    printf("Private key: (%d, %d)\n", d, n);
    printf("Encrypted message: %d\n", c);
    printf("Decrypted message: %d\n", dec);

    return 0;
}
