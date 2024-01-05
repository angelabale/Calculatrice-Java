public class Addition extends Operation {

	/**
	 * Initialise les deux nombres de l'addition courante
	 **/
	public Addition(Nombre n1, Nombre n2) {
		super(n1, n2);
	}

	/**
	 * Retourne le résultat de l'addition
	 **/
	public int valeur() {
		int valeur = this.n1.valeur() + this.n2.valeur();
		return valeur;
	}

	/**
	 * Retourne la chaîne de caractères représentant le résultat de l'addition
	 **/
	public String toString() {
		return(n1.valeur() + "+" + n2.valeur());
	}
}