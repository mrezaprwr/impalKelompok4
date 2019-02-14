#include<stdio.h>
void main()
{
    char paket;
    float jmlpesan, tharga = 0.0, ppn, tbayar, diskon, jbayar;
    printf("Masukkan Tipe Kamar [A/B/C/D/E/F]: ");
    scanf ("%c", &paket);
    printf("Masukkan Jumlah Malam: ");
    scanf ("%f", &jmlpesan);
    switch(paket)
    {
        case 'A': { tharga=jmlpesan*400000; break;}
        case 'B': { tharga=jmlpesan*600000; break;}
        case 'C': { tharga=jmlpesan*750000; break;}
        case 'D': { tharga=jmlpesan*850000; break;}
        case 'E': { tharga=jmlpesan*1200000; break;}
        case 'F': { tharga=jmlpesan*1500000; break;}
    }
    printf("Total Harga                 = Rp. %.2f\n", tharga);
    ppn=0.1*tharga;
    printf("PPN                         = Rp. %.2f\n", ppn);
    tbayar=ppn+tharga;
    printf("Total Bayar                 = Rp. %.2f\n", tbayar);
    if (tbayar>=500000)
        diskon=0.05*tbayar;
    else
        diskon=0.02*tbayar;
    printf("Diskon                      = Rp. %.2f\n", diskon);
    jbayar=tbayar-diskon;
    printf("Jumlah Bayar Setelah Diskon = Rp. %.2f\n", jbayar);
}
