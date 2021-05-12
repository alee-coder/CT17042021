package JavaBasico;

public class Ej_case {
	public static void main (String[] args) {
		int i = 1;
		String str = "two";
		
		switch (i) {
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es uno");
			break;
		case 2:
			System.out.println("i es dos");
			break;
		default:
			System.out.println("i es mayor a dos");
		}
		
		/*switch (str) {
		case "zero":
			System.out.println("i es cero");
			break;
		case "one":
			System.out.println("i es uno");
			break;
		case "two":
			System.out.println("i es dos");
			break;
		default:
			System.out.println("i es mayor a dos");
		}*/
		
		
	}

}
