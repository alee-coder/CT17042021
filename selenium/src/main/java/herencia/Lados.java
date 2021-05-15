package herencia;

public class Lados {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();

		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = "Estilo 1";

		t2.base = 6.0;
		t2.altura = 9.0;
		t2.estilo = "Estilo 2";

		System.out.println("Info para triangulo 1: ");
		t1.mostarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: " + t1.area());

		System.out.println();

		System.out.println("Info para triangulo 2: ");
		t2.mostarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es: " + t2.area());
		
		System.out.println();
		
		DosDimensiones t3 = new DosDimensiones();
		
		t3.altura=4.0;
		t3.base=3.0;
		System.out.println("Info para triangulo 1: ");
		t3.mostrarDimension();

	}

}
