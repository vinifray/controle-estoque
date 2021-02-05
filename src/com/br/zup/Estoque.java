package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> estoque;

    public Estoque(){
        this.estoque = new ArrayList<>();
    }

    public List<Produto> getEstoque() {
        return estoque;
    }

    public void adicionarProduto(Produto item){
        this.estoque.add(item);
    }

    public Produto pesquisarProduto(String nomeProduto){
        for (Produto produto : this.estoque){
            if (produto.getNome().equalsIgnoreCase(nomeProduto)){
                return produto;
            }
        }
        return null;
    }

    public Produto removerQuantidadeEmEstoque(String nomeDoProduto, int quantidadeParaRemover){
        Produto produto = pesquisarProduto(nomeDoProduto);
        if(produto == null){
            return produto;
        }else{
            int quantidadeAtualizada = produto.getQuantidadeEstoque()-quantidadeParaRemover;
            produto.setQuantidadeEstoque(quantidadeAtualizada);
            return produto;
        }
    }
}
