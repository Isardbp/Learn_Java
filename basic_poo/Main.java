public class Main{
	public static void main(String[] args){
		Basic_poo p1 = new Basic_poo("Isard", 18);
		Basic_poo p2 = new Basic_poo(100000000);

		p1.present();
		p1.present(666);

		p2.present2();

		p2.sumar(10,10);
		System.out.println(p2.restar(50,20));

		p2.SetMoney(5000);
		System.out.println(p2.GetMoney());
		
		p2.resultados_constante();
		
		// Com que és static no cal que creem cap clase.
		
		System.out.println(Basic_poo.frase);		
		Basic_poo.frase = "Segona Frase";
		System.out.println(Basic_poo.frase);		
		
		System.out.println(Basic_poo.multiplicar(5,5));
	}
        
}
