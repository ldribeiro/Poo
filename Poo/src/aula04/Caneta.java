package aula04;

public class Caneta {
	private String modelo;
	private String cor; 
	private float ponta;
	private boolean tampada;
	public Caneta() {
		
	}
	public Caneta(String modelo, float ponta, String cor) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
		
	}	
	
	public void status() {
		System.out.println("O modelo da caneta é: " + this.modelo);
		System.out.println("Sua cor é: " + this.cor);
		System.out.println("Sua ponta mede: " + this.ponta);
		System.out.println("Porque a caneta está tampada? " + this.tampada);
		
	}
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro! Não foi possível rabiscar!");
	} else {
		    System.out.println("Posso rabiscar!");
    	}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
}


