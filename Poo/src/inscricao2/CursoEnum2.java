package inscricao2;

import java.util.Arrays;

public enum CursoEnum2 {
	
	
	/**
	 * menu de cursos;
	 */
	BOXING(1, "Boxing", new Boxing2()),
	KUNG_FU(2, "Kung Fu", new KungFu2()),
	KARATE(3, "Karate", new Karate2());

	private int id;
	private String nome;
	private ICurso2 curso2;
	
	
	private CursoEnum2(int id, String nome, ICurso2 curso2) {
		this.id = id;
		this.nome = nome;
		this.curso2 = curso2;
	}
	
	/**
	 * Essa expressão Lambda, funciona como um FOR. 
	 * @param id
	 * @return
	 */
	public static CursoEnum2 get(int id) {
		return Arrays.asList(CursoEnum2.values())
		       .stream()
		       .filter(i -> i.getId() == id)
		       .findFirst()
		       .orElse(null);
	}


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public ICurso2 getCurso2() {
		return curso2;
	}
	
}
