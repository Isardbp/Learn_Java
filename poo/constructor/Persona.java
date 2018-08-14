public class Persona{
	String nombre;
	int edad;

	public Persona(String nombre, int _edad){
		this.nombre = nombre;
		edad = _edad;
	}

	public void mostrarDatod(){
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
}
