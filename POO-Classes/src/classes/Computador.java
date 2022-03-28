package classes;

public class Computador {
	
	public String getCPU() {
		return CPU;
	}

	public void setCPU(String CPU) {
		this.CPU = CPU;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}

	private String CPU;
	private String graphicsCard;
	private String motherBoard;
	
	private int memory;
	private int storageSpace;
	
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