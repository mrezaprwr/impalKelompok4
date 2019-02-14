#include<stdio.h>

int main(){
    float swap,a,b,c,s[4];
    int n,m;
    printf("Input Nilai A, B dan C\n");
    scanf("%f%f%f",&s[0],&s[1],&s[2]);
    
    for (n = 0 ; n < 2; n++)
        for (m = 0 ; m < 3 - n - 1; m++){
            if (s[m] > s[m+1]){
                swap   = s[m];
                s[m]   = s[m+1];
                s[m+1] = swap;
            }
        }
    a=s[0]; b=s[1];c=s[2];
    
    if ((a<=0)||(b<=0)||(c<=0)||(c>a+b))
        printf("Tidak ada segitiga yang dapat dibangun");
    else if (((a==b)&&(a!=c))||((a==c)&&(a!=b))||((b==c)&&(a!=c)))
        printf("Bangun Segitiga Sama kaki");
    else if ((a==b)&&(b==c))
        printf("Bangun Segitiga sama sisi");
    else if ((c*c)==(b*b)+(a*a))
        printf("Bangun Segitiga Sama siku");
    else if (c<a+b)
        printf("Bangun Segitiga sembarang");
    else
        printf("tidak ada segitiga dibangun dengan sisi tersbut!");
}
