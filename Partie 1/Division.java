public class Division extends Operation {

	/**
	 * Initialise les deux nombres de la division courante
	 **/
	public Division(Nombre n1, Nombre n2) {
		super(n1, n2);
	}

	/**
	 * Retourne le résultat de la division
	 **/
	public int valeur() throws ArithmeticException {
		if (n2.valeur() == 0) {
			throw new ArithmeticException();
		}
		int valeur = this.n1.valeur()/this.n2.valeur();
		return valeur;
	}

	/**
	 * Retourne la chaîne de caractères représentant le résultat de la division
	 **/
	public String toString() {
		return(n1.valeur() + "/" + n2.valeur());
	}
}