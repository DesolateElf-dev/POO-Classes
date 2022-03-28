package classes;

import java.util.concurrent.TimeUnit;

public class Carro {
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	private String marca;
	private String modelo;
	private String cor;
	
	private int ano;
	private int motor;
	
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
		System.out.println("Acelerando");
	}
	
	public static void freiar() {
		System.out.println("Freiando");
	}
		
}
