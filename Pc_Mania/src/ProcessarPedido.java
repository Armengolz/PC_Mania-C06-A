import br.inatel.computadores.Computador;

public class ProcessarPedido {
    public static void processarPedido(Computador[] pcs, int qtd) {
        System.out.println("Pedido enviado...");
        System.out.println("Você comprou " + qtd + " computador(es).");
    }
}