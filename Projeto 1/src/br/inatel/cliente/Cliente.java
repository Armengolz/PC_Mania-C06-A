package br.inatel.cliente;
import br.inatel.computadores.Computador;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
    }

    public void processarCompras(Computador[] compras, int qtdCompras) {
        System.out.println("\nResumo das compras:");
        for (int i = 0; i < qtdCompras; i++) {
            System.out.println("\nComputador " + (i + 1) + ":");
            compras[i].mostraPCConfigs();
        }
    }

    public float calculaTotalCompra(Computador[] compras, int qtdCompras) {
        float total = 0;
        for (int i = 0; i < qtdCompras; i++) {
            total += compras[i].getPreco();
        }
        return total;
    }
}