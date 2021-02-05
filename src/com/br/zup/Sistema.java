package com.br.zup;

import javax.sound.midi.Soundbank;

public class Sistema {
    private Estoque estoque;

    public Sistema(){
        this.estoque = new Estoque();
    }

    public void menu(){
        IO.mostrarTexto("Digite: \n 1 para cadastrar produto\n 2 para pesquisar " +
                "\n 3 para sair \n 4 Diminuir estoque");
    }

    public void cadastrarProduto(){
        IO.mostrarTexto("Digite nome, validade , peço e quantidade em estoque");
        String nome = IO.criarScanner().nextLine();
        String validade = IO.criarScanner().nextLine();
        double preco = IO.criarScanner().nextDouble();
        int quantidade = IO.criarScanner().nextInt();

        Produto produto = new Produto(nome, validade, preco, quantidade);
        this.estoque.adicionarProduto(produto);
    }

    public void pesquisarProduto(){
        IO.mostrarTexto("Digite qual o nome do produto");
        String nomeProduto = IO.criarScanner().nextLine();

        Produto produtoPesquisado = this.estoque.pesquisarProduto(nomeProduto);
        if(produtoPesquisado == null){
            IO.mostrarTexto("Produto não encontrado");
        }else{
            IO.mostrarTexto(""+produtoPesquisado);
        }
    }

    public void atualizarEstoque(){
        IO.mostrarTexto("\nDigite o nome do produto e a quantidade para remover do estoque\n");
        String nomeProduto = IO.criarScanner().nextLine();
        int quantidadeParaRemover = IO.criarScanner().nextInt();

        Produto produto = this.estoque.removerQuantidadeEmEstoque(nomeProduto, quantidadeParaRemover);
        if (produto == null){
            IO.mostrarTexto("Não encontrei o produto");
        }else {
            IO.mostrarTexto(""+produto);
        }
    }

    public void executarSistema(){
        boolean controle = true;
        while (controle){
            menu();
            int resposta = IO.criarScanner().nextInt();

            if(resposta == 1){
                cadastrarProduto();
            }else if (resposta == 2){
                pesquisarProduto();
            }else if (resposta == 3){
                controle = false;
            }else if(resposta == 4){
                atualizarEstoque();
            }
        }
    }
}
