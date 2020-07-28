package entidades;

import utilitarios.SomAnimalEnum;

public class Cachorro extends Animal implements ICaracteristicaAnimal{

	public Cachorro(String nome, int idade){
		super(nome, idade);
	}
	
	@Override
	public SomAnimalEnum emitirSom() {
		return SomAnimalEnum.CACHORRO;
	}
	
	public String getMovimentacao(){
		return "corre";
	}
	

}
