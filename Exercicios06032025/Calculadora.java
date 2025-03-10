public class Calculadora{
	private double primeiroNumero;
	private double segundoNumero;
	private double resultado;

	private void setValorOperado(){
		this.primeiroNumero = resultado;
	}

	public Calculadora(double primeiroNumero, double segundoNumero){
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
		this.resultado = 0.0;
	}
	
	private void soma(){
		resultado = primeiroNumero + segundoNumero;
		setValorOperado();
	}

	private void subtracao(){
		resultado = primeiroNumero - segundoNumero;
		setValorOperado();
	}

	private void mostrar(){
		System.out.printf("*****| Resultado : %.2f|******\n", resultado);
	}

	public static void main(String[] args){
		Calculadora calc01 = new Calculadora(10,12);
		calc01.soma();
		calc01.mostrar();
		calc01.subtracao();
		calc01.mostrar();
		calc01.subtracao();
		calc01.mostrar();
		
	}
}