public class Basic_poo{
	//Modificacion de acceso	
	String name;
	public int edad;
	private float money;
	//Miembros Estaticos de una clase, si se modifica en algun lugar se queda así con todos
	public static String frase = "Primera frase";
	//constante
	final private String constante = "HUUUUUUULY";
	
	//Constructores
	public Basic_poo(String name, int edad){
		this.name = name;
		this.edad = edad;
	}

	public Basic_poo(float money){
		this.money = money;
	}
		
	public Basic_poo(){
		this.name = null;
	}
	//public Basic_poo(String constante){
	//	this.constante = constante;
	//}
	//Sobrecarga de metodos
	public void present(){
		System.out.println("Et dius " + name + " i tens "+edad+ " anys.");
	}
	public void present(int num){
		System.out.println("Et dius " + name + " i tens "+edad+ " anys i el numero és: " + num);
	}
	public void present2(){
		System.out.println(money + "$$$$$");
	}
	//Setter y Getter	
	public void SetMoney(int money){
		this.money = money;
	}
	public float GetMoney(){
		return this.money;
	}
	//Parametros, argumentos y retorno re valores
	public void resultados_constante(){
		System.out.println(this.constante);
	}
	public void sumar(int a, int b){
		System.out.println(a+b);
	}
	
	public int restar(int a, int b){
		return a-b;
	}
	//Metodos tipo static
	public static int multiplicar(int a, int b){
		return a*b;
	}
}	
