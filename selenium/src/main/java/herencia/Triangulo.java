package herencia;

public class Triangulo extends DosDimensiones {

	String estilo;
	
	double area(){
		return base*altura/2; //aqui se accede a las variables establecidas en la clase padre (superclase)
	}
	
	void mostarEstilo() {
		System.out.println("El estilo es: " + estilo);
	}
}
