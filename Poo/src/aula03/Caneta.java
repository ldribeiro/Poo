package aula03;

public class Caneta {
     public String modelo;
     public String cor;
     private float ponta;
     protected int carga;
     private boolean tampada;
      
     public void status() {
    	  System.out.println("Modelo: " + this.modelo);
    	  System.out.println("Uma caneta " + this.cor);
    	  System.out.println("Ponta: " + this.ponta);
    	  System.out.println("Carga: " + this.carga);
    	  System.out.println("Está tampada? " + this.tampada);
      }
      
      public void rabiscar() {
         if(this.tampada == true) {
        	 System.out.println("Erro! Não posso rabiscar.");
         } else {
        	 System.out.println("Estou rabiscando.");
         }
      }
      
      public void tampar() {
    	//this, é o nome do método que chamou o Objeto. Nesse caso, c1. 
    	  this.tampada = true; //Para tampar.
      }
      
      public void destampar() {
        //this, é o nome do método que chamou o Objeto. Nesse caso, c1.  
	      this.tampada = false; //Para destampar.

    	  }
}
