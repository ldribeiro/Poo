package aula03;
//Oq tem parenteses, faz uma chamada ao método.
//Sem parenteses, faz uma referência a atributos.
/*IMPORTANTE: Perceba, que, independente do Objeto 'Caneta' criado, 
  ou, que ainda podemos criar, eles compartilham dos mesmos métodos, 
 a diferença, é o Status.(Caneta tampada e destampada.)

*/
public class Aula03 {

	public static void main(String[] args) {
	   Caneta c1 = new Caneta();
	   c1.modelo = "Bic Cristal";
	   c1.cor = "Azul";
	   //c1.ponta = 0.5f;
	   c1.carga = 80;
	   //c1.tampada = false;
	   c1.tampar();
	   c1.status();
	   c1.rabiscar();
	   
   }

}
