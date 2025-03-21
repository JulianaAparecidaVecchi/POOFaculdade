package com.estoqueprodutos;

import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> produtos = new ArrayList<>();

    public Estoque(){

    }

    public void adcionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void alterarPreco(String nome, double novoPreco){
        boolean produtoExisteNaLista = false;
            for (Produto produto: this.produtos){
                if (produto.getNome().equals(nome)){
                    produto.setPreco(novoPreco);
                    produtoExisteNaLista = true;
                }
            }
        if (produtoExisteNaLista != true){
            System.out.println("Produto não encontrado!");
        }
    }

    public void listarProdutosEmEstoque(){
        if (produtos.size() == 0){
            System.out.println("A lista de produtos está vazia!") ;
        } else {
            for (Produto produto : this.produtos) {
                System.out.println(produto.toString());
            }
        }
    }


}
