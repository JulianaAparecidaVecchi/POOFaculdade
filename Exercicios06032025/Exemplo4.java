public class Exemplo4{
	String msg;
	public Exemplo4(){
		this.msg = "";
	}

	public static void main(String[] args){
		Exemplo4 e1 = new Exemplo4();
		e1.msg = "Este é um texto";
		Exemplo4 e2;
		e2 = e1;
		//Cada instância é diferente da outra
		//Compara tipos
		System.out.println("Comparando Objetos: \n" + (e1 == e2));
		//Compara um objeto com o outro
		System.out.println("Comparando Objetos com equals: \n" + e1.equals(e2));

		//Compara atributos
		System.out.println("Comparando Atributos: " + (e1.msg == e2.msg));
		//Compara um objeto com o outro
		System.out.println("Comparando Objetos com equals: " + (e1.msg).equals(e2.msg));

	}

}