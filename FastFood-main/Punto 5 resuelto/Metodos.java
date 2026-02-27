
import java.util.Arrays;
import java.util.Scanner;

public class Metodos {

    public int[][] LlenarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 100 + 1);

            }
        }
        return m;
    }

    public void MostrarMatriz(int[][] m) {
        System.out.println("mostremos la matriz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " - ");
            }
            System.out.println();
        }
    }

    public Obj[][] LlenarMatriz(Obj[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Obj o = new Obj();
                o.setDato((int) (Math.random() * 100 + 1));
                m[i][j] = o;

            }
        }
        return m;
    }

    public void MostrarMatriz(Obj[][] m) {
        System.out.println("mostremos la matriz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j].getDato() + " - ");
            }
            System.out.println();
        }
    }

    public ObjVillalobos[][] LLenarMatriz(ObjVillalobos[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjVillalobos o = new ObjVillalobos();
                System.out.println("Ingrese la descripcion");
                o.setDescripcion(sc.next());
                System.out.println("ingrese la cantidad ");
                o.setCantidad(sc.nextInt());
                System.out.println("Ingrese el precio ");
                o.setPrecio(sc.nextDouble());
                m[i][j] = o;
            }
        }
        return m;
    }

    public void MostrarMatriz(ObjVillalobos[][] m, int dedonde) {
        if (dedonde == 0) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    if (m[i][j].getCantidad() != 0) {
                        System.out.println("Descripcion: " + m[i][j].getDescripcion());
                        System.out.println("Cantidad: " + m[i][j].getCantidad());
                        System.out.println("Precio: " + m[i][j].getPrecio());
                        System.out.println("'----------------------------------------- '\n");
                    }

                }

            }
        } else {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if (m[i][j] != null) {
                        System.out.println("Descripcion: " + m[i][j].getDescripcion());
                        System.out.println("Cantidad: " + m[i][j].getCantidad());
                        System.out.println("Precio: " + m[i][j].getPrecio());
                        System.out.println("'----------------------------------------- '\n");
                    }

                }

            }
        }

    }

    public ObjVillalobos[][] FucionarMatrices(ObjVillalobos[][] m, ObjVillalobos[][] m2, ObjVillalobos[][] mr) {
        for (int i = 0; i < m.length; i++) { // recorrido de la matriz a
            for (int j = 0; j < m.length; j++) {// recorrido de la matriz a
                for (int i1 = 0; i1 < m2.length; i1++) {// recorrido de la matriz b
                    for (int j1 = 0; j1 < m2.length; j1++) {// recorrido de la matriz b
                        if (m[i][j].getDescripcion().equalsIgnoreCase(m2[i1][j1].getDescripcion())) {
                            m[i][j].setCantidad(m[i][j].getCantidad() + m2[i1][j1].getCantidad());
                            m2[i1][j1].setCantidad(0);
                            m2[i1][j1].setDescripcion(null);
                        }

                    }
                }
            }
        }
        // pasamos todos los valores de la matriz 1 a la matriz resultante
        int fila = 0, i = 0;
        for (i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjVillalobos o = new ObjVillalobos();
                o.setCantidad(m[i][j].getCantidad());
                o.setDescripcion(m[i][j].getDescripcion());
                o.setPrecio(m[i][j].getPrecio());
                mr[i][j] = o;
            }
        }
        // pasamos los datos de matriz 2 que no esten en la matriz 1 a la matriz resultante
        fila = i;
        for (i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                if (m2[i][j].getCantidad() != 0) {
                    ObjVillalobos o = new ObjVillalobos();
                    o.setCantidad(m2[i][j].getCantidad());
                    o.setDescripcion(m2[i][j].getDescripcion());
                    o.setPrecio(m2[i][j].getPrecio());
                    mr[fila][j] = o;

                }

            }
            fila++;
        }
        return mr;
    }

    public ObjVillalobos[] OrdenarArregloPorNombre(ObjVillalobos[][] m) {
        ObjVillalobos[] arreglo = new ObjVillalobos[((m.length * m.length) * m.length)];
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != null) {
                    ObjVillalobos o = new ObjVillalobos();
                    o.setDescripcion(m[i][j].getDescripcion());
                    o.setCantidad(m[i][j].getCantidad());
                    o.setPrecio(m[i][j].getPrecio());
                    arreglo[k] = o;
                    k = k + 1;

                }
            }
        }
        System.out.println("holis");
        Arrays.sort(arreglo, 0, k, (o1, o2) -> o1.getDescripcion().compareToIgnoreCase(o2.getDescripcion()));

        return arreglo;
    }

    public void MostrarMatrizOrdenada(ObjVillalobos[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
                System.out.println("Descricion: " + a[i].getDescripcion());
                System.out.println("Cantidad: " + a[i].getCantidad());
                System.out.println("Precio: " + a[i].getPrecio());
                System.out.println("\n ------------------------------ \n");
            }

        }

    }

}
