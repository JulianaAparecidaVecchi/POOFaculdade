import java.util.ArrayList;

public class ArraysLists {
    public static void main(String[] args) {
        ArrayList<String> listaAlunos = new ArrayList<>();
        System.out.println(listaAlunos.toString());
        listaAlunos.add("Juliana");
        listaAlunos.add("Cintia");
        listaAlunos.add("Leticia");
        System.out.println(listaAlunos.toString());
        listaAlunos.set(2,"Letícia");
        System.out.println(listaAlunos.toString());
    }
}
