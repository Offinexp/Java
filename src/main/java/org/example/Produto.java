package org.example;

public interface Produto {
    public String getTipo();
    public String getNome();
    public double getPreco();
    public void setPreco(double preco);
    public void setQuantidade(int quantidade);
    public int getQuantidade();
    public String exibirDetalhes();
}
