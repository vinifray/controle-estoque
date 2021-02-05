package com.br.zup;

public class Produto {
    private String nome;
    private String dataVencimento;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, String dataVencimento, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.dataVencimento = dataVencimento;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Nome do Produto: " + nome +"\n"+
                "Data do Vencimento: " + dataVencimento + "\n" +
                "Preço: " + preco + "\n"+
                "Quantidade em Estoque: " + quantidadeEstoque;
    }
}
