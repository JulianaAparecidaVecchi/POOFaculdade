public class SistemaEstoque {
    public static void main(String[] args) {
        String nomeProduto ="";
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Laptop", 3500.00));
        estoque.adicionarProduto(new Produto("Smartphone", 2000.00));
        estoque.adicionarProduto(new Produto("Mouse", 150.00));
        estoque.adicionarProduto(new Produto("Teclado", 300.00));
        estoque.adicionarProduto(new Produto("Celular", 3000.00));
        estoque.adicionarProduto(new Produto("Monitor", 1200.00));
        estoque.adicionarProduto(new Produto("Impressora", 800.00));
        estoque.adicionarProduto(new Produto("Fone de Ouvido", 250.00));
        estoque.adicionarProduto(new Produto("Webcam", 400.00));
        estoque.adicionarProduto(new Produto("Pen Drive", 80.00));
        estoque.adicionarProduto(new Produto("Cadeira Gamer", 1500.00));

        System.out.println("+------------------------------------------------+");
        System.out.println("Lista inicial de produtos após a inserção de produtos");
        estoque.listarProdutosEmEstoque();
        System.out.println("+------------------------------------------------+");
        nomeProduto = "Celular";
        System.out.println("Alteração de preço do produto: "+nomeProduto);
        estoque.alterarPrecoProduto(nomeProduto, 5000.00);
        System.out.println("Lista após alteração de preço:");
        estoque.listarProdutosEmEstoque();
        System.out.println("+------------------------------------------------+");
        System.out.println("Alterando preço do produto Mesa de Escritório" );
        nomeProduto = "Mesa de Escritório";
        if (estoque.alterarPrecoProduto(nomeProduto, 1231.00) ){
            System.out.println("Preço alterado do produto "+"Mesa de Escritório");
        } else {
            System.out.println("Produto não encontrado");
        }
        System.out.println("+------------------------------------------------+");
        System.out.println("Listagem de produtos no estoque");
        estoque.listarProdutosEmEstoque();
        System.out.println("+------------------------------------------------+");
        System.out.println("Fim");
}
}
