import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Abacaxi");
        frutas.add("Uva");


        System.out.println("O array frutas estão no endereço de mémoria: " + frutas);
        System.out.println("Tem " + frutas.size() + "furtas no array");
        frutas.remove("Banana");
        System.out.println("Após remover banana do array");
        System.out.println("A fruta no posição dois é: " + frutas.get(2));
        System.out.println("Vamos trocar a laranja por abacate");
        frutas.set(2, "Abacate");
        System.out.println("Adicionar melancia na posição 2");
        frutas.add(1,"Melancia");
        System.out.println(frutas.toString());
        frutas.clear();
        System.out.println("Lista limpa!");
        System.out.println(frutas.toString());

    }
}
