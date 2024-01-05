public class Multiplication extends Operation {

	/**
	 * Initialise les deux nombres de la multiplication courante
	 **/
	public Multiplication(Nombre n1, Nombre n2) {
		super(n1, n2);
	}

	/**
	 * Retourne le résultat de la multiplication
	 **/
	public int valeur() {
		int valeur = this.n1.valeur() * this.n2.valeur();
		return valeur;
	}

	/**
	 * Retourne la chaîne de caractères représentant le résultat de la multiplication
	 **/
	public String toString() {
		return(n1.valeur() + "*" + n2.valeur());
	}
}