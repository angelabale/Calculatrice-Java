public class CalculatriceSimple extends Exception{
	
	public static void main(String[] args) {
		try {
			Nombre six = new Nombre(6);
			System.out.println(six);
			Nombre deux = new Nombre(2);
			System.out.println(deux);
			Operation a = new Addition(six, deux);
			System.out.println(a + " = " + a.valeur());
			Operation s = new Soustraction(six, deux);
			System.out.println(s + " = " + s.valeur());
			Operation m = new Multiplication(six, deux);
			System.out.println(m + " = " + m.valeur());
			Operation d = new Division(six, deux);
			System.out.println(d + " = " + d.valeur());
			Nombre zero = new Nombre(0);
			Operation d2 = new Division(six, zero);
			System.out.println(d2 + " = " + d2.valeur());
		}
		catch (Exception e) {
			System.out.println(e+" On ne peut pas diviser par 0!");
		}
	}
}