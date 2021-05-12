package arrays;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// declarando e inicializando el arreglo 2d
		int arr[][] = { { 2, 7, 9 }, { 3, 6, 1, 4, 7 }, { 7, 4, 2 }, { 1, 2, 3, 4 } };

		// La primera posición es el array y la segunda posición es la que esta dentro
		// del array
		System.out.println(arr[1][2]);
		
		//imprimir array 2d
		for (int i=0; i < 3; i++) {
			for (int j=0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		//para imprimir con lenght
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
