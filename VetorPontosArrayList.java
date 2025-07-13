import java.util.ArrayList;
public class VetorPontosArrayList {
	private ArrayList<Ponto> pontos;
	
	public VetorPontosArrayList(){
		pontos = new ArrayList<Ponto>();
	}
	
	public int getTamanho(){
		return pontos.size();
	}
	
	public Ponto getPonto(int posicao){
		return pontos.get(posicao);
	}
	
	public void AddPonto(Ponto ponto){
		pontos.add(ponto);
	}
	
	public void RemoverPonto(int posicao){
		pontos.remove(posicao);
	}
	
	public boolean Existe(Ponto ponto){
		return pontos.contains(ponto);
	}
	public int ProcurarPonto(Ponto ponto){
		int ret = -1;
		for (int i = 0; i < pontos.size(); i++) {
			if (pontos.get(i).Equal(ponto)){
				ret = i;
				break;
			}
		}
		return ret;
	}
	
	
}
