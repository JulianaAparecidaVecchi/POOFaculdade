public class Calculadora{
	private double primeiroNumero;
	private double segundoNumero;

	public Calculadora(double primeiroNumero, double segundoNumero){
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}
	
	public double soma(){
		return primeiroNumero + segundoNumero;
	}

	public double subtracao(){
		return primeiroNumero - segundoNumero;
	}

	public void mostrar(){
		System.out.println("*****| Calculadora - Valores: " + primeiroNumero + " e " 		+ segundoNumero + "|******");
		System.out.println("-----| Soma |-----");
		System.out.println("O resultado da soma de " + primeiroNumero + " + " + 
		segundoNumero + " = " + soma());
		System.out.println("-----| Subtração |-----");
		System.out.println("O resultado da soma de " + primeiroNumero + " - " + 
		segundoNumero + " = " + subtracao());
		System.out.println("***********");
	}

	public static void main(String[] args){
		Calculadora calc01 = new Calculadora(10,12);
		calc01.mostrar();

		Calculadora calc02 = new Calculadora(98,74);
		calc02.mostrar();
		
	}
}