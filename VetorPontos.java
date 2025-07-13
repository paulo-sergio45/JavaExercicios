
public class VetorPontos {
	private Ponto[] pontos;
	private int conta; //total de pontos inseridos
	private int index;
	
	public VetorPontos(int quantidade){
		pontos = new Ponto[quantidade];
		conta = 0;
		index = 0;
	}
	
	public int getTamanho(){
		conta = 0 ;
		for (int i = 0; i < pontos.length; i++) {
			if (pontos[i] != null)
				conta++;
		}
		return conta;
	}
	
	public Ponto getPonto(int posicao){
		if (posicao > pontos.length-1){
			return null;
		}
		
		return pontos[posicao];
	}
	
	public void AddPonto(Ponto ponto){
		if (index +1 > pontos.length){
			System.out.println("Vetor cheio!");
		}else{
			pontos[index] = ponto;
			index++;
		}
	}
	
	public void RemoverPonto(int posicao){
		if (posicao > pontos.length-1 || pontos[posicao] == null){
			return;
		}
		
		if (posicao == pontos.length-1){
			pontos[posicao] = null;
			return;
		}
		
		for(int i = posicao; i<pontos.length;i++){
			if (!(i+1 > pontos.length-1)){
				pontos[i] = pontos[i+1];
				pontos[i+1] = null;
			}
		}
	}
	
	public void Print(){
		for (int i = 0; i < pontos.length; i++) {
			System.out.println(pontos[i]);
		}
	}
	
	public boolean Existe(Ponto ponto){
		boolean ret = false;
		
		for (int i = 0; i < pontos.length; i++) {
			if (pontos[i] != null && pontos[i].Equal(ponto)){
				ret = true;
				break;
			}
		}
		
		return ret;
	}
	
	public int ProcurarPonto(Ponto ponto){
		int ret = -1;
		
		for (int i = 0; i < pontos.length; i++) {
			if (pontos[i] != null && pontos[i].Equal(ponto)){
				ret = i;
				break;
			}
		}
		
		return ret;
	}
	
}
