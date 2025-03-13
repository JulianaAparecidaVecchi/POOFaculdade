import com.meupacote.Carro;

public class Teste {
    public static void main(String[] args) {
        Carro carro = new Carro("Chronos", 2022, "vermelha", 4);

        System.out.println("Modelo do carro: " + carro.modelo);
        System.out.println("Ano do carro: " + carro.getAno());
        carro.ligar();

        carro.setAno(2023);
        System.out.println("Novo no do carro: " + carro.getAno());
    }
}
