public class Cua{
	private float lado1;
	private float lado2;

	public Cua(float lado1, float lado2){
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public Cua(float lado1){
		this.lado1 = lado1;
	}
	public float getPerimetro(){
		return 2*(lado1 + lado2);	
	}
	public float getArea(){
		return lado1 + lado2;
	}
	public static void main(String[] args){
		Cua c1 = new Cua(10, 6);
		System.out.println(c1.getPerimetro());
		System.out.println(c1.getArea());
	}
}
