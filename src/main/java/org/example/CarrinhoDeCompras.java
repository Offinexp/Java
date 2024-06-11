package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens;
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        this.itens.add(produto);
    }

    public void removerItem(Produto produto) {
        this.itens.remove(produto);
    }

    public void listarItens() {
        for (Produto produto : itens) {
            System.out.println(produto.exibirDetalhes());
        }
    }

    public List<Produto> exportarListaProdutos() {
        return this.itens;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : itens) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public void gerarArquivoTexto(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write("Item: Qtd: Nome: Preço: SubTotal:\n");
            int i = 1;
            for (Produto produto : itens) {
                double subTotal = produto.getPreco() * produto.getQuantidade();
                writer.write(String.format("%d %d %s %.2f %.2f\n", i++, produto.getQuantidade(),
                        produto.getNome(), produto.getPreco(), subTotal));
            }
            writer.write(String.format("Total: %.2f", calcularTotal()));
        } catch (IOException e) {
            System.err.println("Erro ao gerar o arquivo de texto: " + e.getMessage());
        }
    }
}

