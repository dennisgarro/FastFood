
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int opt = 0, n = 0, NumeroPedido = 0;
        System.out.println("Ingrese la dimensión de la matriz");
        n = m.ValidarEntero(sc);
        objFastFood[][] pedidos = new objFastFood[n][n];

        boolean continuar = true;
        while (continuar) {
            System.out.println("Bienvenido a FastFood version 2026 grupo 11");
            System.out.println("Que desea realizar..............");
            System.out.println("1. Ingresar Pedidos");
            System.out.println("2. Consultar Pedidos");
            System.out.println("3. Modificar");
            System.out.println("4. Despachar Pedido");
            System.out.println("5. Mostrar Pedidos y sus estados ");
            System.out.println("6. Salir");
            System.out.println();
            opt = m.ValidarEntero(sc);
            sc.nextLine();
            if (opt < 1 || opt > 6) {
                System.out.println("por favor Ingrese un numero de 1 al 6");
                System.out.println();
                continue;
            }
            switch (opt) {
                case 1:
                    System.out.println("Vamos a ingresar los pedidos");
                    pedidos = m.Ingresarpedidos(n, sc);

                    break;
                case 2:
                    System.out.println("Vamos a consultar los pedidos");
                    System.out.println("Por favor Ingrese el numero del pedido");
                    NumeroPedido = m.ValidarEntero(sc);
                    objFastFood o = new objFastFood();
                    o = m.Buscarpedido(pedidos, NumeroPedido);
                    m.Mostrar(o);
                    break;
                case 3:
                    System.out.println("Vamos a Modificar Un pedido ");
                    System.out.println("Por favor Ingrese el numero del pedido");
                    NumeroPedido = m.ValidarEntero(sc);
                    pedidos = m.Actualizarpedido(pedidos, NumeroPedido, sc, 1);
                    break;
                case 4:
                    System.out.println("Vamos a Despachar los pedidos");
                    System.out.println("Por favor Ingrese el numero del pedido");
                    NumeroPedido = m.ValidarEntero(sc);
                    pedidos = m.Actualizarpedido(pedidos, NumeroPedido, sc, 2);
                    break;
                case 5:
                    System.out.println(" Mostrar pedidos");
                    m.Mostrar(pedidos);
                    break;
                default:
                    continuar = false;
                    break;
                // case 1 -> {
                //     System.out.println("Vamos a ingresar los pedidos");
                //     System.out.println();
                // }
                // case 2 -> {
                //     System.out.println("Vamos a consultar los pedidos");
                //     System.out.println();
                // }
                // case 3 -> {
                //     System.out.println("Vamos a Modificar los pedidos");
                //     System.out.println();
                // }
                // case 4 -> {
                //     System.out.println("Vamos a Despachar los pedidos");
                //     System.out.println();
                // }
                // case 5 -> {
                //     System.out.println(" Mostrar pedidos");
                //     System.out.println();
                // }

                // default -> {
                //     continuar = false;
                // }
            }

        }
    }
}
