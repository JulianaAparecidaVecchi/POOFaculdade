public class Exemplo2{

	public Exemplo2(){
	
	}

	public void getMessage(String msg){
		System.out.println(msg);
	}

	public static void main(String[] args){
		Exemplo2 ex2 = new Exemplo2();
		ex2.getMessage("Teste do Exemplo2");
		
		Exemplo2 ex21 = new Exemplo2();
		ex21.getMessage("Outra instância!!!");
	}
}