package Exemplo_ArrayList;

import java.util.ArrayList;
public class Poligono {
	private ArrayList<Reta> retas;
	
	public Poligono(){
		retas = new ArrayList<Reta>();
	}
	
	public void AddReta(Reta reta){
		retas.add(reta);
	}
	
	public int TotalLados(){
		return retas.size();
	}
	
	public void Print(){
		for(Reta a:retas){
			a.getInicio().Print();
			a.getFim().Print();
			System.out.println();
		}
	}
}
