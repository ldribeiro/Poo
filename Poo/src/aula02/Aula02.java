package aula02;
//Oq tem parenteses, faz uma chamada ao método.
//Sem parenteses, faz uma referência a atributos.
/*IMPORTANTE: Perceba, que, independente do Objeto 'Caneta' criado, 
  ou, que ainda podemos criar, eles compartilham dos mesmos métodos, 
 a diferença, é o Status.(Caneta tampada e destampada.)

*/
public class Aula02 {

	public static void main(String[] args) {
	   Caneta c1 = new Caneta();
	   c1.cor = "Azul";
	   c1.ponta = 0.5f;
	   c1.tampar(); //Chama o método, determinando que está tampada.
	   
	   c1.status(); //Chama método.
	   c1.rabiscar(); //Chama método.
	   
	  System.out.println("========================= ");
	   
	   Caneta c2 = new Caneta();
	   c2.modelo = "HostNet";
	   c2.cor = "Preta";
	   c2.ponta = 0.75f;
	   c2.destampar(); //Chama o método, determinando que está destampada.
	   
	   c2.status(); //Chama método.
	   c2.rabiscar(); //Chama método.
	   
   }

}
