
package entidades;

import utilitarios.SomAnimalEnum;

public class Cavalo extends Animal implements ICaracteristicaAnimal{

	public Cavalo(String nome, int idade){
		super(nome, idade);
	}
	
	@Override
	public SomAnimalEnum emitirSom() {
		return SomAnimalEnum.CAVALO;
	}
	
	
	public String getMovimentacao(){
		return "corre";
	}

}
