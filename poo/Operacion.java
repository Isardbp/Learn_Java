import javax.swing.JOptionPane;
public class Operacion{
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicar;
	int division;

	public void leerNumeros(){
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
	}
	
	public void sumar(){
		suma = numero1 + numero2;
	}
	
	public void restar(){
		resta = numero1 -  numero2;
	}
	
	public void multiplicar(){
		multiplicar = numero1 * numero2;
	}
	
	public void dividir(){
		division= numero1 /  numero2;
	}
	
	public void mostrarResultados(){
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multipicacion es: " + multiplicar);
		System.out.println("La division es: " +division);
	}	
}
