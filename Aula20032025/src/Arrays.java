public class Arrays {
    public static void main(String[] args) {
        System.out.println("Teste de vetor em Java");

        int v;
        double d;

        int[] numerosPares = new int[5];
        double valores[] = {1.0,2.13, 5.12, 212.79};
        int bidi[][] = new int [6][10];
        bidi[0][0] = 10;
        System.out.println("Elemento do do array na posição 0,0 : " + bidi[0][0]);

        numerosPares[0] = 0;
        numerosPares[1] = 2;
        numerosPares[2] = 4;
        numerosPares[3] = 6;
        numerosPares[4] = 8;

        System.out.println("Obtendo valor da posição 2= " + numerosPares[2]);

        v = numerosPares[2];
        d = valores[3];

        System.out.println("Valor de v " + v);
        System.out.println("Valor de d " + d);

        System.out.println("Comprimento dos números pares é:  " + numerosPares.length);
        System.out.println("Comprimento dos valores booleans é:  " + valores.length);
    }
}
