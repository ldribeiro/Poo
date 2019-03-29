package aula04;

public class Aula04 {
  public static void main(String[] args) {
	   Caneta c1 = new Caneta("Nic", 0.4f, "Amarelo");
	   c1.setCor("Amarelo");
	   c1.setModelo("Bic");
	   c1.setPonta(0.5f);
	   c1.setTampada(false);
	   c1.rabiscar();
	   c1.status();
	//   Caneta c2 = new Caneta("Lup", 0.5f, "Cinza");
  }
}
