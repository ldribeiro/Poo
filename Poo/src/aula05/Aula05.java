package aula05;

public class Aula05 {
	public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumeroConta(1111);
       p1.setDono("Jubileu");
       p1.abrirConta("CC");
      
       ContaBanco p2 = new ContaBanco();
       p2.setNumeroConta(2222);
       p2.setDono("Creusa");
       p2.abrirConta("CP");
       
       p1.depositar(100);
       p2.depositar(500);
       
       p2.sacar(100);
       
       p2.pagarMensal();
       
       p1.sacar(150);//Esvaziar a conta pra pode fechar;
       p1.fecharConta();
       
       p1.estadoAtual();
       p2.estadoAtual();
	}

}
