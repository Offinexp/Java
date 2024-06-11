package org.example;

public class Roupa extends ProdutoBase{
    private String tamanho;
    private String cor;

    public Roupa(String nome, double preco, String tamanho, String cor, int quantidade){
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Roupa(){}

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String exibirDetalhes(){
        return String.format("Roupa: %s, Preço: R$ %.2f, Tamanho: %s, Cor: %s, Quantidade: %d",getNome(), getPreco(), tamanho, cor, getQuantidade());
    }

    @Override
    public String getTipo(){
        return "Roupa";
    }
}
