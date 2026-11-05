package pruebapractica;

public class ejercicio {

	public static void main(String[] args) {
		int repetir = 1;
		while (repetir==1) {
			int pelo = Integer.parseInt(IO.readln("Escoge pelo:"));
			int ojos = Integer.parseInt(IO.readln("Escoge ojos:"));
			int orejasNariz = Integer.parseInt(IO.readln("Escoge orejas y nariz:"));
			int boca = Integer.parseInt(IO.readln("Escoge boca:"));
			int barbilla = Integer.parseInt(IO.readln("Escoge barbilla:"));
			
			System.out.println("El retrato final es: ");
			escogerPelo(pelo);
			escogerOjos(ojos);
			escogerOrejasNariz(orejasNariz);
			escogerBoca(boca);
			escogerBarbilla(barbilla);
		}
	}
	
	public static void escogerPelo(int opciones) {

		switch (opciones) {
		case 1:
			System.out.println("WWWWWWWWW");
			break;
		case 2:
			System.out.println("\\\\/////");
			break;
		case 3:
			System.out.println("|||||||");
			break;
		case 4:
			System.out.println("|||||||||");
			break;
		}
	}

	public static void escogerOjos(int opciones) {
		switch (opciones) {
		case 1:
			System.out.println("| o   o |");
			break;
		case 2:
			System.out.println("|-(· ·)-|");
			break;
		case 3:
			System.out.println("|-(o o)-|");
			break;
		case 4:
			System.out.println("| \\   / |");
			break;
		}
	}

	public static void escogerOrejasNariz(int opciones) {
		switch (opciones) {
		case 1:
			System.out.println("@   J   @");
			break;
		case 2:
			System.out.println("{   \"   }");
			break;
		case 3:
			System.out.println("[   j   ]");
			break;
		case 4:
			System.out.println("<   -   >");
			break;
		}
	}

	public static void escogerBoca(int opciones) {
		switch (opciones) {
		case 1:
			System.out.println("|  ===  |");
			break;
		case 2:
			System.out.println("|   -   |");
			break;
		case 3:
			System.out.println("|  ___  |");
			break;
		case 4:
			System.out.println("|  ---  |");
			break;
		}
	}

	public static void escogerBarbilla(int opciones) {
		switch (opciones) {
		case 1:
			System.out.println("\\_______/");
			break;
		case 2:
			System.out.println("\\,,,,,,,/");
			break;
		case 3:
			System.out.println("\\......./");
			break;
		case 4:
			System.out.println("\\mmmmmmm/");
			break;
		}
	}
}
