package Exemplo_ArrayList;

public class CMain {

	public static void main(String[] args) {
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto(10,10);
		Ponto p3 = new Ponto(0,10);
		Ponto p4 = new Ponto(0,0);
		
		Poligono p = new Poligono();
		p.AddReta(new Reta(p1,p2));
		p.AddReta(new Reta(p2,p3));
		p.AddReta(new Reta(p3,p4));
		
		p.Print();
		
		
		
		
		
	}

}
