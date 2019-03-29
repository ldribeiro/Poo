package inscricao;

import java.util.Arrays;

/**
 * Enum é tipo especifico do java para numerar informações.
 * Como ele é uma classe, eu posso ter metodos, tipos, variaveis, construtor, etc.
 * 
 * @author luciano
 *
 */
public enum CursoEnum {
	
	BOXING (1, "Boxing", new Boxing()),
	KUNG_FU(2, "Kung Fu", new KungFu()),
	KARATE (3, "Karate", new Karate());
	
	private int id;
	private String nome;
	private ICurso curso;
	
	CursoEnum(int id, String nome, ICurso curso) {
		this.id = id;
		this.nome = nome;
		this.curso = curso; 
	}
	
	public static CursoEnum get(int id) {
		return Arrays.asList(CursoEnum.values())
			.stream()
			.filter(i -> i.getId() == id)
			.findFirst()
			.orElse(null);
			
	}
	

	public int getId() {
		return this.id;
	}
	
	public ICurso getCurso() {
		return this.curso;
	}
	
	public String getNome() {
		return this.nome;
	}
	
}