package utilitarios;

public enum SomAnimalEnum {

	CACHORRO("late"),
	CAVALO("rincha"),
	PREGUICA ("guincha");
	
	private final String som;
	
	private SomAnimalEnum(String som){
		this.som = som;
	}

	public String getSom() {
		return som;
	}

	
	
}
