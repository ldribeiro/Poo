package inscricao2;

import java.util.Scanner;

public class Principal2 {
   
	static Curso2 curso2 = new Curso2(1, "teste" );
	static Scanner teclado = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		System.out.println("========== LutaBruta ==========");
		System.out.println("Informe o curso: ");
		
		linha();
		System.out.println(CursoEnum2.BOXING.getId() + ". " + CursoEnum2.BOXING.getNome());
		System.out.println(CursoEnum2.KUNG_FU.getId() + ". " + CursoEnum2.KUNG_FU.getNome());
		System.out.println(CursoEnum2.KARATE.getId() + ". " + CursoEnum2.KARATE.getNome());
		linha()	;	
		
		/**
		 * Validação do Id informado pelo usário.
		 * ("Informe o curso: ") 
		 */
		String IdCurso = teclado.next();
		
		//Aqui, virá o número de Id escolhido:
		
		linha();
		
		System.out.println("CURSO ESCOLHIDO: " + CursoEnum2.get(Integer.parseInt(IdCurso)).getNome());
		System.out.println("HORÁRIOS: ");
		linha();
		
		System.out.println(CursoEnum2.get(Integer.parseInt(IdCurso)).getCurso2().horarios());
		linha();
		
		
		linha();
	}
	
	public static void linha() {
		System.out.println("===============================");
	}
}

