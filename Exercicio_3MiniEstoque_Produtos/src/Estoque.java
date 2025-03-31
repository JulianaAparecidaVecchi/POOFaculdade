import java.util.ArrayList;
class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutosEmEstoque() {
        System.out.println("Produtos cadastrados no estoque:");
        for (Produto p : produtos) {
            p.mostrarDados();
        }
    }

    public int obterProdutoPeloNome(String nome){
        boolean b=false;
        int i=0;
        Produto p=null;
        while ((!b) && (i < this.produtos.size())) {
            p = this.produtos.get(i);
            if (p.getNome().equalsIgnoreCase(nome)){
                b=true;
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    /**
     * Este método altera o preço de um produto
     * @param nome Nome do produto que terá o preço alterado
     * @param novoPreco Novo preço do produto
     * @return true se foi encontrado e preço alterado
     * ou  false se não foi encontrado produto na lista de produtos
     *
     */
    public boolean alterarPrecoProduto(String nome, double novoPreco) {
        Produto p;
        int i = this.obterProdutoPeloNome(nome);
        if (i >0){
            p = this.produtos.get(i);
            p.setPreco(novoPreco);
            this.produtos.set(i, p);
            return true;
        } else {
            return false;
        }

    }
}