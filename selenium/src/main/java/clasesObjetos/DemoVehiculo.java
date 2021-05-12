package clasesObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
		
		Vehiculo carro = new Vehiculo();

		int rango;

		// asignando valores a las propiedades de minivan
		minivan.capacidad = 15;
		minivan.kmh = 20;
		minivan.pasajeros = 9;

		// calcular el rango
		rango = minivan.capacidad * minivan.kmh;
		
		carro.pasajeros = 4;

		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");		

		System.out.println("Numero de pasajeros en carro es: " + carro.pasajeros);

	}

}
