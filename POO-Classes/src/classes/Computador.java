package classes;

public class Computador {
	
	String CPU;
	String graphicsCard;
	String motherBoard;
	
	int memory;
	int storageSpace;
	
	public static void ligar() {
		System.out.println("Computador Ligado");
	}
	
	public static void hibernar() {
		System.out.println("Computador Hibernando");
	}
	
	public static void suspender() {
		System.out.println("Computador Suspenso");
	}

}