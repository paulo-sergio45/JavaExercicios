package Lista01_OO_Exercicio4e5;

import Lista01_OO_Exercicio4e5.Exercicio4.Contador;
import Lista01_OO_Exercicio4e5.Exercicio5.Pais;


public class CMain {

	public static void main(String[] args) {
	   Pais p = new Pais();
	   p.setNome("Argentina");
	   p.setISO("ARG");
	   p.setPopulacao(44000000);
	   p.setDimensao(2740000);
	   
	   Pais[] paises = new Pais[4];
	   
	   paises[0] = new Pais();
	   paises[0].setNome("Brasil");
	   paises[0].setDimensao(80000000);
	   paises[0].setPopulacao(250000000);
	   paises[0].setISO("BRA");

	   paises[1] = new Pais();
	   paises[1].setNome("Uruguai");
	   paises[1].setDimensao(2000000);
	   paises[1].setPopulacao(50000000);
	   paises[1].setISO("URU");
	   
	   paises[2] = new Pais();
	   paises[2].setNome("Paraguai");
	   paises[2].setDimensao(2000000);
	   paises[2].setPopulacao(50000000);
	   paises[2].setISO("PAR");
	   
	   paises[3] = new Pais();
	   paises[3].setNome("Chile");
	   paises[3].setDimensao(2000000);
	   paises[3].setPopulacao(50000000);
	   paises[3].setISO("CHI");
	   
	   p.setFronteira(paises);
	   
	   ImprimirDados(p);

	   
	   
	   
		/*Contador c = new Contador();
	   c.Zerar();
	   System.out.println(c.getValor());
	   c.Incrementar();
	   System.out.println(c.getValor());
	   c.Incrementar();
	   System.out.println(c.getValor());
	   */

	}
	
	static void ImprimirDados(Pais p){
		   System.out.println(p.getISO());
		   System.out.println(p.getNome());
		   System.out.println(p.getPopulacao());
		   System.out.println(p.getDimensao());
		   
		   
		   if (p.getFronteira() != null){
			   System.out.println("\nFronteira");

			   for(int i=0;i<p.getFronteira().length;i++){
				   ImprimirDados(p.getFronteira()[i]);
				   System.out.println();
			   }
		   }
	}

}
