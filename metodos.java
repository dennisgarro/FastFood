
import java.util.Scanner;

public class metodos {

    public objFastFood[][] Ingresarpedidos(int n, Scanner sc) {
        objFastFood[][] m = new objFastFood[n][n];
        metodos M = new metodos();
        int Tipo = 0, opt = 0, numeroPedido = 1;
        int Tamano = 0;
        int Cantidad = 0;
        Double PrecioUnidad = 0.0;
        Double TotalPagar = 0.0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Quiere Implementar contructor vacio 1, lleno 2");
                opt = sc.nextInt();
                if (opt == 1) {
                    objFastFood o = new objFastFood();
                    System.out.println("Binvenido al expendio de comidas rapidas para cuando presentemos parcial");
                    System.out.println("Seleccione el tipo de comida");
                    System.out.println("1) perro");
                    System.out.println("2) perra");
                    System.out.println("3) salchipapa");
                    System.out.println("4) hamburguesa");
                    o.setTipo(M.ValidarEntero(sc));

                    System.out.println("Ingrese tamaño");
                    System.out.println("1) pequeño");
                    System.out.println("2) mediano");
                    System.out.println("3) grande");
                    o.setTamano(M.ValidarEntero(sc));

                    System.out.println("Ingrese la cantidad");
                    o.setCantidad(sc.nextInt());
                    System.out.println("Ingrese el precio");
                    o.setPrecioUnidad(sc.nextDouble());
                    o.setTotalPagar(o.getCantidad() * o.getPrecioUnidad());
                    o.setNumeroPedido(numeroPedido);
                    o.setEstadoPedido(0);
                    m[i][j] = o;
                } else {
                    System.out.println("Binvenido al expendio de comidas rapidas para cuando presentemos parcial");
                    System.out.println("Seleccione el tipo de comida");
                    System.out.println("1) perro");
                    System.out.println("2) perra");
                    System.out.println("3) salchipapa");
                    System.out.println("4) hamburguesa");
                    Tipo = M.ValidarEntero(sc);

                    System.out.println("Ingrese tamaño");
                    System.out.println("1) pequeño");
                    System.out.println("2) mediano");
                    System.out.println("3) grande");
                    Tamano = M.ValidarEntero(sc);

                    System.out.println("Ingrese la cantidad");
                    Cantidad = sc.nextInt();
                    System.out.println("Ingrese el precio");
                    PrecioUnidad = M.ValidarDecimal(sc);
                    TotalPagar = Cantidad * PrecioUnidad;
                    objFastFood o = new objFastFood(Tipo, Tamano, Cantidad, PrecioUnidad, TotalPagar, numeroPedido, 0);
                    m[i][j] = o;
                }
                numeroPedido++;

            }
        }
        return m;
    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("por favor ingrese un número valido");
            sc.next();
        }
        return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("por favor ingrese un número valido");
        }
        return sc.nextDouble();
    }

    public objFastFood Buscarpedido(objFastFood[][] m, int numeroPedido) {
        objFastFood pedido = new objFastFood();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNumeroPedido() == numeroPedido) {
                    pedido = m[i][j];
                }
            }
        }
        return pedido;
    }

    public void Mostrar(objFastFood[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("El numero del pedido es: " + m[i][j].getNumeroPedido());
                switch (m[i][j].getTipo()) {
                    case 1:
                        System.out.println("Perro");
                        break;
                    case 2:
                        System.out.println("Perra");
                        break;
                    case 3:
                        System.out.println("Salchipapa");
                        break;

                    default:
                        System.out.println("Burger");
                        break;
                }
                switch (m[i][j].getTamano()) {
                    case 1:
                        System.out.println("Pequeño");
                        break;
                    case 2:
                        System.out.println("Mediano");
                        break;
                    default:
                        System.out.println("Grande");
                        break;
                }
                System.out.println("Cantidad: " + m[i][j].getCantidad());
                System.out.println("Precio: " + m[i][j].getPrecioUnidad());
                System.out.println("Total a Pagar: " + m[i][j].getTotalPagar());
                if (m[i][j].getEstadoPedido() == 0) {
                    System.out.println("Pendiente");
                } else {
                    System.out.println("Atendido");
                }
                System.out.println("------------------------------------------------------------");
                System.out.println();
            }
        }

    }

    public void Mostrar(objFastFood o) {
        System.out.println("El numero del pedido es: " + o.getNumeroPedido());
        switch (o.getTipo()) {
            case 1:
                System.out.println("Perro");
                break;
            case 2:
                System.out.println("Perra");
                break;
            case 3:
                System.out.println("Salchipapa");
                break;

            default:
                System.out.println("Burger");
                break;
        }
        switch (o.getTamano()) {
            case 1:
                System.out.println("Pequeño");
                break;
            case 2:
                System.out.println("Mediano");
                break;
            default:
                System.out.println("Grande");
                break;
        }
        System.out.println("Cantidad: " + o.getCantidad());
        System.out.println("Precio: " + o.getPrecioUnidad());
        System.out.println("Total a Pagar: " + o.getTotalPagar());
        if (o.getEstadoPedido() == 0) {
            System.out.println("Pendiente");
        } else {
            System.out.println("Atendido");
        }
    }

    public objFastFood[][] Actualizarpedido(objFastFood[][] m, int numeroPedido, Scanner sc, int opt) {
        metodos M = new metodos();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNumeroPedido() == numeroPedido) {
                    if (opt == 1) {
                        System.out.println("Seleccione el tipo de comida");
                        System.out.println("1) perro");
                        System.out.println("2) perra");
                        System.out.println("3) salchipapa");
                        System.out.println("4) hamburguesa");
                        m[i][j].setTipo(M.ValidarEntero(sc));

                        System.out.println("Ingrese tamaño");
                        System.out.println("1) pequeño");
                        System.out.println("2) mediano");
                        System.out.println("3) grande");
                        m[i][j].setTamano(M.ValidarEntero(sc));

                        System.out.println("Ingrese la cantidad");
                        m[i][j].setCantidad(sc.nextInt());
                        System.out.println("Ingrese el precio");
                        m[i][j].setPrecioUnidad(sc.nextDouble());
                        m[i][j].setTotalPagar(m[i][j].getCantidad() * m[i][j].getPrecioUnidad());
                    } else {
                        m[i][j].setEstadoPedido(1);
                    }

                }
            }
        }
        return m;
    }

}
