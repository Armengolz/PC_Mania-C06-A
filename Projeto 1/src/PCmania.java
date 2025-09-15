import br.inatel.cliente.Cliente;
import br.inatel.computadores.Computador;
import br.inatel.computadores.HardwareBasico;
import br.inatel.computadores.MemoriaUSB;
import br.inatel.computadores.SistemaOperacional;
import java.util.Scanner;

public class PCmania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        Cliente cliente = new Cliente("Pedro Armengol de Oliveira", "00009999000");

        HardwareBasico[] hardwares1 = {
                new HardwareBasico("Core i3", 1200),
                new HardwareBasico("8GB RAM", 8),
                new HardwareBasico("500GB HD", 500)
        };
        Computador promocao1 = new Computador("Apple", 2093, hardwares1, new SistemaOperacional("MacOS", 64));
        promocao1.addMemoriaUSB(new MemoriaUSB("Pen Drive", 16));

        HardwareBasico[] hardwares2 = {
                new HardwareBasico("Core i5", 2200),
                new HardwareBasico("16GB RAM", 16),
                new HardwareBasico("1TB HD", 1000)
        };
        Computador promocao2 = new Computador("Samsung", 3327, hardwares2, new SistemaOperacional("Windows 8", 64));
        promocao2.addMemoriaUSB(new MemoriaUSB("Pen Drive", 32));

        HardwareBasico[] hardwares3 = {
                new HardwareBasico("Core i7", 3200),
                new HardwareBasico("32GB RAM", 32),
                new HardwareBasico("2TB HD", 2000)
        };
        Computador promocao3 = new Computador("Dell", 7771, hardwares3, new SistemaOperacional("Windows 10", 64));
        promocao3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));


        Computador[] compras = new Computador[10];
        int qtdCompras = 0;

        System.out.println("Bem-vindo à PCmania! Você precisa comprar pelo menos 2 computadores.");

        System.out.println("\n=== PROMOÇÕES DISPONÍVEIS ===");
        System.out.println("\nPromoção 1:");
        promocao1.mostraPCConfigs();
        System.out.println("\nPromoção 2:");
        promocao2.mostraPCConfigs();
        System.out.println("\nPromoção 3:");
        promocao3.mostraPCConfigs();

        do {
            System.out.println("\nDigite a promoção que deseja comprar:");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar");
            opcao = sc.nextInt();

            if (opcao == 1) {
                if (qtdCompras < compras.length) {
                    compras[qtdCompras] = promocao1;
                    qtdCompras++;
                    System.out.println("Computador adicionado!");
                } else {
                    System.out.println("Não é possível comprar mais computadores!");
                }
            } else if (opcao == 2) {
                if (qtdCompras < compras.length) {
                    compras[qtdCompras] = promocao2;
                    qtdCompras++;
                    System.out.println("Computador adicionado!");
                } else {
                    System.out.println("Não é possível comprar mais computadores!");
                }
            } else if (opcao == 3) {
                if (qtdCompras < compras.length) {
                    compras[qtdCompras] = promocao3;
                    qtdCompras++;
                    System.out.println("Computador adicionado!");
                } else {
                    System.out.println("Não é possível comprar mais computadores!");
                }
            } else if (opcao == 0) {

                if (qtdCompras < 2) {
                    System.out.println("Você precisa comprar pelo menos 2 computadores!");
                    opcao = -1;
                }
            }
        } while (opcao != 0);

        cliente.mostrarCliente();

        cliente.processarCompras(compras, qtdCompras);

        float total = cliente.calculaTotalCompra(compras, qtdCompras);
        System.out.println("Total da compra: R$" + total);

        ProcessarPedido.processarPedido(compras, qtdCompras);
    }
}