package view;

import classes.Cachorro;
import classes.Carro;
import classes.Computador;

public class principal {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro();
		
		dog1.setNome("Fernando");
		dog1.setCorPrincipal("Caramelo");
		dog1.setIdade(3);		
		
		Cachorro dog2 = new Cachorro();
		
		dog2.setNome("Pipoca");
		dog2.setCorPrincipal("Branco");
		dog2.setIdade(7);	

		Carro car1 = new Carro();
		
		car1.setMarca("Ford");
		car1.setModelo("Fiesta");
		car1.setAno(1999);
		car1.setCor("Preto");
		car1.setMotor(1);
		
		Carro car2 = new Carro();
		
		car2.setMarca("Fiat");
		car2.setModelo("147");
		car2.setAno(1980);
		car2.setCor("Bege");
		car2.setMotor(4);

		Computador pc1 = new Computador();
		
		pc1.setCPU("i9-9900K");
		pc1.setGraphicsCard("RTX 3080");
		pc1.setMemory(32);
		pc1.setMotherBoard("B560-m");
		pc1.setStorageSpace(2000);
		
		Computador pc2 = new Computador();
		
		pc2.setCPU("i5-9400F");
		pc2.setGraphicsCard("GTX 1650");
		pc2.setMemory(16);
		pc2.setMotherBoard("H510");
		pc2.setStorageSpace(500);
	}

}
