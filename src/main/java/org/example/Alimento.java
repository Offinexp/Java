package org.example;

public class Alimento extends ProdutoBase{
    private String dataValidade;

    public Alimento(String nome, double preco, String dataValidade, int quantidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String exibirDetalhes(){
        return String.format("Alimento: %s, Preço: R$ %.2f, Data de Validade: %s, Quantidade: %d", getNome(), getPreco(), dataValidade, getQuantidade());
    }

    @Override
    public String getTipo(){
        return "Alimento";
    }
}
