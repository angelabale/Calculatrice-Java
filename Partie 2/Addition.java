public class Addition extends Operation {

	/**
	 * Initialise les deux expressions de l'addition courante
	 **/
	public Addition(Expression op1, Expression op2) {
		super(op1, op2);
	}

	/**
	 * Retourne le résultat de l'addition
	 **/
	public int valeur() {
		int valeur = this.op1.valeur() + this.op2.valeur();
		return valeur;
	}

	/**
	 * Retourne la chaîne de caractères représentant le résultat de l'addition
	 **/
	public String toString() {
		return("(" + this.getOperande1().valeur() + "+" + this.getOperande2().valeur() + ")");
	}
}