package entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Zoologico {
	
	public static void main(String[] args) {
		
		//Classe concretas sendo instaciadas e sendo armazenadas no tipo da Interface ICaracteristicaAnimal
		ICaracteristicaAnimal caracteristicaCachorro =  new Cachorro("Tedy", 5);
		
		ICaracteristicaAnimal caracteristicaCavalo =  new Cavalo("Zorro", 2);
		
		ICaracteristicaAnimal caracteristicaPreguica =  new Preguica("Teco", 4);
		
		//List<ICaracteristicaAnimal> jaulas = new ArrayList<ICaracteristicaAnimal>();
		Set<ICaracteristicaAnimal> jaulas = new LinkedHashSet<ICaracteristicaAnimal>();
		
		
		
		jaulas.add(caracteristicaCachorro);
		jaulas.add(caracteristicaCavalo);
		jaulas.add(caracteristicaPreguica);
		//jaulas.add(caracteristicaPreguica);
		
		for (ICaracteristicaAnimal animal : jaulas) {
			System.out.println(animal.emitirSom().getSom());
			
		}
		
		
		//Classe concretas sendo instaciadas e sendo armazenadas no tipo da propria classe
		Cachorro cachorro =  new Cachorro("Tedy", 5);
		
		Cavalo cavalo =  new Cavalo("Zorro", 2);
		
		Preguica preguica =  new Preguica("Teco", 4);
		
		Set<Cachorro> jaulas2 = new LinkedHashSet<Cachorro>();
		
		jaulas2.add(cachorro);
		//jaulas2.add(cavalo);
		//jaulas2.add(preguica);
		
		for (Cachorro animal : jaulas2) {
			System.out.println(animal.emitirSom().getSom());
			
		}
		
//		Veterinario v = new Veterinario();
//		v.examinar(caracteristicaPreguica);		
				
		
	}
	
	
	
	

}
