package com;

import com.gerenciadepedidos.Produto;
import com.gerenciadepedidos.Pedido;
import com.gerenciadepedidos.Cliente;
import com.gerenciadepedidos.ProdutoDoPedido;

public class ProgramaPrincipal{
    public static void main(String[] args){

    //Produtos
    Produto computador = new Produto("Computador", 4200);
    Produto celular = new Produto("Celular", 3000);
    Produto fone = new Produto("Fone", 200);

    //Clientes
    Cliente roberto = new Cliente("Roberto da Silva", "roberto@gmail.com");
    Cliente fernanda = new Cliente("Fernanda Pereira", "fernanda@gmail.com");


    //Pedidos do CLiente 01
    Pedido pedRoberto = new Pedido(roberto);
    ProdutoDoPedido computadorRoberto = new ProdutoDoPedido(computador,1);
    ProdutoDoPedido celularRoberto = new ProdutoDoPedido(celular,3);
    pedRoberto.adicionarProduto(computadorRoberto);
    pedRoberto.adicionarProduto(celularRoberto);
    pedRoberto.mostrarResumo();
    System.out.println("----| Mostrar apenas computador |------");
    computadorRoberto.mostrarProdutoPedido();
    System.out.println("---------------------------");

    // Pedidos do CLiente 02

    }
}