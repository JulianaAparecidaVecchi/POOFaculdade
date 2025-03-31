package com.gerenciadepedidos;

import java.util.ArrayList;

import com.gerenciadepedidos.Produto;

public class Pedido {
    private ArrayList<ProdutoDoPedido> produtos;
    private Cliente cliente;
    private double totalProdutos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        produtos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(ProdutoDoPedido produto){
        produtos.add(produto);
    }

    public double calcularTotal(){
       for(ProdutoDoPedido produto:produtos){
          totalProdutos += produto.getQuantidadeProduto() * produto.getProduto().getPreco();
       }
        return totalProdutos;
    }

    public void mostraProdutos(){
        for (ProdutoDoPedido produto : produtos){
            System.out.println("*************");
            produto.mostrarProdutoPedido();
        }
    }

    public void mostrarResumo(){
        System.out.println("------| Resumo do pedido |------");
        System.out.println("* Dados do cliente *");
        System.out.printf("Nome:%s \nE-mail:%s \n",cliente.getNome(),cliente.getEmail());
        System.out.println("* Produtos *");
        mostraProdutos();
        System.out.println("* Total da compra *\nR$: " + calcularTotal());
        System.out.println("--------------------------------");
    }
}
