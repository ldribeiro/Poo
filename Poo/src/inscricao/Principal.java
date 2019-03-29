package inscricao;

import java.util.Scanner;

/**
 * @author luciano
 *
 */
public class Principal {                                                                                
	
	static Curso curso = new Curso(1, "teste");	                                                        
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("========= ACADEMIA BIRL =========");
		System.out.println("Informe o curso: ");
		
		linha();
		System.out.println(CursoEnum.BOXING.getId() + ". " + CursoEnum.BOXING.getNome());
		System.out.println(CursoEnum.KUNG_FU.getId() + ". " + CursoEnum.KUNG_FU.getNome());
		System.out.println(CursoEnum.KARATE.getId() + ". " + CursoEnum.KARATE.getNome());
		linha();
		
		//validacao para saber se o cara nao cagou no id
		String idCurso = teclado.next();
		
		
		//curso escolhido
		linha();
		
		System.out.println("CURSO ESCOLHIDO: " + CursoEnum.get(Integer.parseInt(idCurso)).getNome());
		System.out.println("HORARIOS:");
		linha();
		System.out.println(CursoEnum.get(Integer.parseInt(idCurso)).getCurso().horarios());
		linha();
		
		
		
		linha();
		
	}
	
	private static void linha() {
		System.out.println("================================= ");
	}
}
