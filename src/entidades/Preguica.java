package entidades;

import utilitarios.SomAnimalEnum;

public class Preguica extends Animal implements ICaracteristicaAnimal{

	public Preguica(String nome, int idade){
		super(nome, idade);
	}
	
	@Override
	public SomAnimalEnum emitirSom() {
		return SomAnimalEnum.PREGUICA;
	}
	
	public String getMovimentacao(){
		return "subir árvore";
	}

}
