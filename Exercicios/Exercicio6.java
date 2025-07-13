package Exercicios;

import java.util.Scanner;


public class Exercicio6 {
    public  void exercicio6() {
        Scanner scan = new Scanner(System.in);

        int vet[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int veti[] = new int[20];
        int N = 0, N2, I = 0, F = 0;
        for (N = 0, I = 0; N <= 9; N++, I++) {
            System.out.print(" V " + vet[N]);
            veti[I] = vet[N];
        }
        System.out.println("");
        for (N = 9, I = 9; N <= 19; N++, I++) {
            System.out.print(" V " + vet[N]);
            veti[I] = vet[N];
        }
        for (N = 0, I = 19; N <= 9; N++, I--) {
            vet[N] = veti[I];
        }
        for (N = 9, I = 0; N <= 19; N++, I++) {
            vet[N] = veti[I];
        }
        System.out.println("");
        for (N = 0; N <= 9; N++) {
            System.out.print("Vet " + vet[N]);
        }
        System.out.println("");
        for (N = 9; N <= 18; N++) {
            System.out.print("Vet " + vet[N]);
        }
        System.out.println("");
        for (I = 0; I <= 19; I++) {
            System.out.print("Vet " + veti[I]);
        }
    }
}



