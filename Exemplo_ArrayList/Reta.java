package Exemplo_ArrayList;

public class Reta {
	private Ponto p1,p2;
	
	public Reta(Ponto Inicio,Ponto Fim){
		p1 = Inicio;
		p2 = Fim;
	}
	
	public Ponto getInicio(){
		return p1;
	}
	
	public Ponto getFim(){
		return p2;
	}
	
	public double Comprimento(){
		double dx = p1.getX()-p2.getX();
		double dy = p1.getY()-p2.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}
}
