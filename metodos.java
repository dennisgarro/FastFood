import java.util.Scanner;

public class metodos {
    public objFastFood[][] Ingresarpedidos(int n, Scanner sc) {
        objFastFood[][] m = new objFastFood[n][n];
        metodos M = new metodos();
        int Tipo = 0, opt = 0;
        int Tamano = 0;
        int Cantidad = 0;
        Double PrecioUnidad = 0.0;
        Double TotalPagar = 0.0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
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
                PrecioUnidad = sc.nextDouble();
                TotalPagar = Cantidad * PrecioUnidad;
                objFastFood o = new objFastFood(Tipo, Tamano, Cantidad, PrecioUnidad, TotalPagar);
                m[i][j] = o;

            }
        }
        return m;
    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("por favor ingrese un nmero valido");
        }
        return sc.nextInt();
    }
}
