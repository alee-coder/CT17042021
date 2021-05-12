package metodos;

public class Ej_Metodos {

	public static void main(String[] args) {
		int resultado = suma (3,4);
		System.out.println(resultado);
		
		int resultado2 = suma (3,4,5, "hola");
		System.out.println(resultado2);
		
		String car = carro (2);
		System.out.println(car);

	}
	
	public static int suma(int a, int b) {
		int c= a+b;
		return c;
	}
	
	//overloading
	public static int suma(int a, int b, int c, String suma) {
		int d= a+b+c;
		return d;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		return cars[a];
	}

}
