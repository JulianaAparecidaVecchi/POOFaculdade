package com;

import com.estoqueprodutos.Produto;
import com.estoqueprodutos.Estoque;

public class SistemaEstoque {
    public static void main(String[] args){
        //Criar 10 produtos
        Produto computador = new Produto("Computador", 7000);
        Produto televisao = new Produto("Televisao", 4000);
        Produto videoGame = new Produto("Video Game", 6000);
        Produto monitor = new Produto("Monitor", 2000);
        Produto celular = new Produto("Celular", 3000);
        Produto geladeira = new Produto("Geladeira", 12000);
        Produto aspiradorDePo = new Produto("Aspirador de pó", 200);
        Produto microondas = new Produto("Microondas", 500);
        Produto forno = new Produto("Forno", 800);
        Produto fogao = new Produto("Fogão", 1000);

        //Criar um estoque
        Estoque estoque = new Estoque();

        //Armazenar produtos no estoque
        estoque.adcionarProduto(computador);
        estoque.adcionarProduto(televisao);
        estoque.adcionarProduto(videoGame);
        estoque.adcionarProduto(monitor);
        estoque.adcionarProduto(celular);
        estoque.adcionarProduto(geladeira);
        estoque.adcionarProduto(aspiradorDePo);
        estoque.adcionarProduto(microondas);
        estoque.adcionarProduto(forno);
        estoque.adcionarProduto(fogao);

        //Listar produtos
        System.out.println("-----| Produtos |-----");
        estoque.listarProdutosEmEstoque();

        //Mudando o preço do celular
        estoque.alterarPreco("Celular", 5000);

        //Listar produtos novamente
        System.out.println("-----| Produtos |-----");
        estoque.listarProdutosEmEstoque();

        //Alterando preços de produtos fora do estoque
        estoque.alterarPreco("Caixa de som", 1200);
        estoque.alterarPreco("Geladeira", 12500);
        estoque.alterarPreco("Carro", 4200);


    }
}
