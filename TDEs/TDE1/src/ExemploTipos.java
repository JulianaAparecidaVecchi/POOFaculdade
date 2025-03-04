public class ExemploTipos{
    public static void main(String[] args){
        System.out.println("Exemplo de tipos de dados primitivos em Java");
        int a = 10;
        int b = 20;
        int c = a + b;
        String nome_aluno = "José da Silva";
        double salario_professor = 1350.10;
        long numero_itens_transportados = 5000000;
        boolean esta_ligado = false;
        byte sensor = 120;
        char tecla = 'A' ;
        System.out.println("inteiro int: " + a);
        System.out.println("String: " + nome_aluno);
        System.out.println("double: " + salario_professor);
        System.out.println("long: " + numero_itens_transportados);
        System.out.println("boolean: " + esta_ligado);
        System.out.println("byte: " +sensor);
        System.out.println("char : " + tecla);
        System.out.printf("A soma dos números %d + %d = %d", a, b, c);
    }
}