public abstract class Operation extends Expression {
	Expression op1;
	Expression op2;

	/**
	 * Initialise les deux expressions de l'opération courante
	 **/
	public Operation(Expression op1, Expression op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	/**
	 * Retourne l'Expression op1
	 **/
	public Expression getOperande1() {
		return this.op1;
	}

	/**
	 * Retourne l'expression op2
	 **/
	public Expression getOperande2() {
		return this.op2;
	}
}