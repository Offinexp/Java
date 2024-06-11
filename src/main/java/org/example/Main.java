package org.example;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

        Eletronico eletronico = new Eletronico("Computador", 98313.00, 48, 3);
        Roupa roupa = new Roupa("Blusa", 150.00, "Pequeno", "Azul Marino", 15);
        Alimento alimento = new Alimento("Bolacha", 7.57, "10/07/2024", 4);

        carrinho1.adicionarItem(eletronico);
        carrinho1.adicionarItem(roupa);
        carrinho1.adicionarItem(alimento);

        carrinho2.adicionarItem(new Eletronico("Headphone", 500.00, 12, 1));
        carrinho2.adicionarItem(new Roupa("Luvas", 107.99, "M", "Preto", 2));

        System.out.println("Carrinho 1:");
        carrinho1.listarItens();
        System.out.println("Total: R$ " + carrinho1.calcularTotal());

        System.out.println("Carrinho 2:");
        carrinho2.listarItens();
        System.out.println("Total: R$ " + carrinho2.calcularTotal());

        carrinho1.gerarArquivoTexto("carrinho1.txt");
        carrinho2.gerarArquivoTexto("carrinho2.txt");
    }
}
