public class Exemplo3{
	String msg;

	public Exemplo3(String msg){
		this.msg = msg; 
	}

	public void mostrarMsg(){
		System.out.println(msg);
	}

	public static void main(String[] args){
		Exemplo3 ex3 = new Exemplo3("Minha mensagem!!!");
		ex3.mostrarMsg();

		ex3.msg = "Nova mensagem!!!";
		ex3.mostrarMsg();

		Exemplo3 ex31 = new Exemplo3("Minha mensagem da outra instância!");
		ex31.mostrarMsg();
		ex31.msg = "Nova mensagem da outra instância";
		ex31.mostrarMsg();
	}


}