package br.inatel.computadores;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico[] hardwares, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " " + sistemaOperacional.getTipo() + " bits");
        for (int i = 0; i < hardwares.length; i++) {
                System.out.println("Hardware: " + hardwares[i].getNome() + " de " + hardwares[i].getCapacidade());
        }
        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade());
        }
    }

    public float getPreco() {
        return preco;
    }
}