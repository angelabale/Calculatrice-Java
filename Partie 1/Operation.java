public abstract class Operation {
	Nombre n1;
	Nombre n2;

	/**
	 * Initialise les deux nombres de l'opération courante
	 **/
	public Operation(Nombre n1, Nombre n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	/**
	 * Retourne le résultat de l'opération
	 **/
	public abstract int valeur();

	/**
	 * Retourne le nombre n1
	 **/
	public Nombre getOperande1() {
		return this.n1;
	}

	/**
	 * Retourne le nombre n2
	 **/
	public Nombre getOperande2() {
		return this.n2;
	}
}