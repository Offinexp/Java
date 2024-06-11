package org.example;

public class Eletronico extends ProdutoBase{
    private int garantiaMeses;

    public Eletronico(String nome,  double preco, int garantiaMeses, int quantidade){
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public Eletronico(){}

    public int getGarantiaMeses(){
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses){
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String exibirDetalhes(){
        return String.format("Eletrônico: %s, Preço: R$ %.2f, Garantia: %d meses, Quantidade: %d",getNome(), getPreco(), garantiaMeses, getQuantidade());
    }

    @Override
    public String getTipo(){
        return "Eletronico";
    }
}
