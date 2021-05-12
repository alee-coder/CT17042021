package arrays;

public class Arrays {

	public static void main(String[] args) {
		int intArray[];
		int[] intArray2;

		// declarar un array de string

		//String[] arr;

		// Asignar espacio en la memoria de 5
		//arr = new String[5];
		
		String[] arr = new String[5];

		// inicializar el primer valor
		arr[0] = "cero";

		// inicializar el segundo valor
		arr[1] = "uno";

		// inicializar el tercer valor
		arr[2] = "dos";

		// consecutivamente
		arr[3] = "tres";
		arr[4] = "cuatro";

		//System.out.println("El primer valor del arreglo es: "+arr[0]);

		// accediendo a todos los elementos del array
		for (int i = 0; i < arr.length; i++) { // arr.lenght calcula la longitud del array
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}

	}

}
