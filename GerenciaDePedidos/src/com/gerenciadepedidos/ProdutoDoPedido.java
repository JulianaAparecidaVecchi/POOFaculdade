package com.gerenciadepedidos;

public class ProdutoDoPedido {
    private Produto produto;
    private int quantidadeProduto;

    public ProdutoDoPedido(Produto produto, int quantidadeProduto){
        this.produto = produto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void mostrarProdutoPedido(){
        System.out.println("Nome:" + produto.getNome());
        System.out.println("Preço:" + produto.getPreco());
        System.out.println("Quantidade de Produto pedido:" + getQuantidadeProduto());
    }
}
