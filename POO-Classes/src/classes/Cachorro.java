package classes;

public class Cachorro {
	
	private String nome;
	private String raca;
	private String corPrincipal;
	private String corSecundaria;
	
	private int idade;
	
	public String getNome(){
		return this.nome;
	}
	
	public String getRaca() {
		return this.raca;
	}
	
	public String getCorPrincipal() {
		return this.corPrincipal;
	}
	
	public String getCorSecundaria() {
		return this.corSecundaria;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String valor) {
		this.nome = valor;
	}
	
	public void setRaca(String valor) {
		this.raca = valor;
	}
	
	public void setCorPrincipal(String valor) {
		this.corPrincipal = valor;
	}
	
	public void corSecundaria(String valor) {
		this.corSecundaria = valor;
	}
	
	public void setNome(int valor) {
		this.idade = valor;
	}
	
	
	public static void comer() {
		System.out.println("Comendo...");
	}
	
	public static void latir() {
		System.out.println("Au au au");	
	}
	
	public static void brincar() {
		System.out.println("Brincando...");		
	}

}
