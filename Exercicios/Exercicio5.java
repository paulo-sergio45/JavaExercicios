package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public  void exercicio5() {
        Scanner scan = new Scanner(System.in);
        int vet[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int N;
        System.out.println("V 1 a 9");
        N = scan.nextInt();
        if (vet[N] == 0) {
            System.out.println("V vet = 0");
        } else {
            System.out.println("V= " + vet[N]);
        }}}
