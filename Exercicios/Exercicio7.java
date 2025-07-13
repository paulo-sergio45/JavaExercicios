package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
            public  void exercicio7() {
                Scanner scan=new Scanner(System.in);
                int vet[]=new int[10];
                int veti[]=new int[10];
                int vete[]=new int[10];
                int N=0,N1,C=0,C1=0,C2=0;
                for(C=0;C<=9;) {
                    System.out.print("V 0 a 9");
                    N = scan.nextInt();
                    vet[C]=N;C++;}
                System.out.println("");
                for(C1=0;C1<=9;) {
                    System.out.print("V2 0 a 9");
                    N1 = scan.nextInt();
                    veti[C1]=N1;C1++;}
                for(C=0,C1=0,C2=0;C<=9;C++,C1++,C2++){ vete[C2]=vet[C]+veti[C1];}
                for(C=0;C<9;C++){ System.out.print(""+vet[C]);}
                System.out.println("");

                for(C1=0;C1<=9;C1++){ System.out.print(""+veti[C1]);}
                System.out.println("");
                for(C2=0;C2<=9;C2++){ System.out.print(" R= "+vete[C2]);}
            }}
