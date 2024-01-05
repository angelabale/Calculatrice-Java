public class Nombre extends Expression {
	int valeurNombre;

	/**
	 * Initialise la valeur du nombre courant
	 **/
	public Nombre(int valeurNombre) {
		this.valeurNombre = valeurNombre;
	}

	/**
	 * Retourne la valeur du nombre
	 **/
	public int valeur() {
		return this.valeurNombre;
	}

	/**
	 * Retourne la chaîne de caractères représentant la valeur du nombre
	 **/
	public String toString() {
		return("Le nombre est" + this.valeurNombre);
	}
} 