public class Division extends Operation {

	/**
	 * Initialise les deux expressions de la division courante
	 **/
	public Division(Expression op1, Expression op2) {
		super(op1, op2);
	}

	/**
	 * Retourne le résultat de la division
	 **/
	public int valeur() throws ArithmeticException {
		if (op2.valeur() == 0) {
			throw new ArithmeticException();
		}
		int valeur = this.op1.valeur()/this.op2.valeur();
		return valeur;
	}

	/**
	 * Retourne la chaîne de caractères représentant le résultat de la division
	 **/
	public String toString() {
		return(this.getOperande1() + "/" + this.getOperande2());
	}
}