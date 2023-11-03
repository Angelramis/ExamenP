
public class HolaMundo {

	public static void main(String[] args) {
	System.out.print("Introdueix el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Introdueix el segon número: ");
        double numero2 = entrada.nextDouble();

        double producte = numero1 * numero2;

        System.out.println("El producte és: " + producte);

        entrada.close();

	}

}
