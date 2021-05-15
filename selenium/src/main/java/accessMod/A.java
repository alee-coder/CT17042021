package accessMod;

public class A {

	private void mostrar() {
		System.out.println("Modificador de acceso");
	}
	
	public void mostrarPublico() {
		mostrar();
		System.out.println("Publico");
	}
}
