package Exercicios;

import java.util.Scanner;

public class  Exercicio3 {
    public  void exercicio3(){
        Scanner scan=new Scanner(System.in);

        int N=0,C=0,T=0;
        int vet[]=new int[40];
        int veti[]=new int[10];


        for(N=0;N<4;N++){
            System.out.println("aluno1");
            vet[N]=scan.nextInt();  C=vet[N]+C;   }
        veti[T]=C/4; C=0;
        for(N=4;N<8;N++){
            System.out.println("alunos2");
            vet[N]=scan.nextInt();  C=vet[N]+C;     }
        T++; veti[T]=C/4; C=0;
        for(N=8;N<12;N++){
            System.out.println("alunos3");
            vet[N]=scan.nextInt();  C=vet[N]+C; }
        T++; veti[T]=C/4; C=0;
        for(N=12;N<16;N++){
            System.out.println("alunos4");
            vet[N]=scan.nextInt(); C=vet[N]+C; }
        T++; veti[T]=C/4; C=0;
        for(N=16;N<20;N++){
            System.out.println("alunos5");
            vet[N]=scan.nextInt(); C=vet[N]+C;}
        T++; veti[T]=C/4; C=0;
        for(N=20;N<24;N++){
            System.out.println("alunos6");
            vet[N]=scan.nextInt(); C=vet[N]+C;}
        T++; veti[T]=C/4; C=0;
        for(N=24;N<28;N++){
            System.out.println("alunos7");
            vet[N]=scan.nextInt(); C=vet[N]+C;}
        T++; veti[T]=C/4; C=0;
        for(N=28;N<32;N++){
            System.out.println("alunos8");
            vet[N]=scan.nextInt(); C=vet[N]+C;}
        T++; veti[T]=C/4; C=0;
        for(N=32;N<36;N++){
            System.out.println("alunos9");
            vet[N]=scan.nextInt(); C=vet[N]+C;}
        T++; veti[T]=C/4; C=0;
        for(N=36;N<40;N++){
            System.out.println("alunos10");
            vet[N]=scan.nextInt(); C=vet[N]+C;}
        T++; veti[T]=C/4; C=0;

        for(N=0;N<40;N++){System.out.print("V"+vet[N]);}
        System.out.println("");
        for(T=0;T<10;T++){
            if(veti[T]>=7){
                System.out.print("N"+T+"  "+veti[T]);}}
    }}
