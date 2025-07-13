package Lista01_OO_Exercicio4e5.Exercicio5;

public class Pais {
	private String iso;
	private String nome;
	private int populacao;
	private double dimensao;
	private Pais[] fronteira;
	
	public Pais[] getFronteira(){
		return fronteira;
	}
	
	public void setFronteira(Pais[] paises){
		this.fronteira = paises;
	}
	
	public void setISO(String iso){
		this.iso = iso;
	}
	public String getISO(){
		return this.iso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public double getDimensao() {
		return dimensao;
	}
	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	
	
}
