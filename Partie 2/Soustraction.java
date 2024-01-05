public class Soustraction extends Operation {

	/**
	 * Initialise les deux expressions de la soustraction courante
	 **/
	public Soustraction(Expression op1, Expression op2) {
		super(op1, op2);
	}

	/**
	 * Retourne le résultat de la soustraction
	 **/
	public int valeur() {
		int valeur = this.op1.valeur() - this.op2.valeur();
		return valeur;
	}

	/**
	 * Retourne la chaîne de caractères représentant le résultat de la soustraction
	 **/
	public String toString() {
		return("(" + this.getOperande1().valeur() + "-" + this.getOperande2().valeur() + ")");
	}
}