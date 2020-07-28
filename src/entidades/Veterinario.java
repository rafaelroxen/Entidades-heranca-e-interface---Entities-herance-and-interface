package entidades;

public class Veterinario {
	
	public void examinar(ICaracteristicaAnimal caracteristicaAnimal){
		System.out.println(caracteristicaAnimal.emitirSom().getSom());
	}

}
