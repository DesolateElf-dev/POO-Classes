package classes;

import java.util.concurrent.TimeUnit;

public class Carro {
	
	String marca;
	String modelo;
	String cor;
	
	int ano;
	int motor;
	
	public static void ligar() {
		System.out.println("Carro ligando...");
		try {
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Ligado");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void acelerar() {
		System.out.println("Äcelerando");
	}
	
	public static void freiar() {
		System.out.println("Freiando");
	}
		
}
