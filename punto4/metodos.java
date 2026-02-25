package punto4;

import java.util.Scanner;

//Buenas
public class metodos 
{
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

    public obj[][] LlenarMatriz(obj[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                obj o = new obj();
                o.setDato((int) (Math.random() * 100 + 1));
                m[i][j] = o;

            }
        }
        return m;
    }

    public void MostrarMatriz(obj[][] m) {
        System.out.println("mostremos la matriz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j].getDato() + " - ");
            }
            System.out.println();
        }
    }

    public objMAtributos[][] LLenarMatriz(objMAtributos[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objMAtributos o = new objMAtributos();
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

    public void MostrarMatriz(objMAtributos[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Descripcion: " + m[i][j].getDescripcion());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("'----------------------------------------- '\n");
            }

        }
    }

    public objMAtributos[][] FucionarMatrices(objMAtributos[][] m, objMAtributos[][] m2, objMAtributos[][] mr) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                for (int i1 = 0; i1 < m.length; i1++) {
                    for (int j1 = 0; j1 < m.length; j1++) {
                        if (m[i][j].getDescripcion().equalsIgnoreCase(m2[i1][j1].getDescripcion())) {
                            m[i][j].setCantidad(m[i][j].getCantidad() + m2[i1][j1].getCantidad());
                        }
                    }
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j].setCantidad(m[i][j].getCantidad());
                m[i][j].setDescripcion(m[i][j].getDescripcion());
                m[i][j].setPrecio(m[i][j].getPrecio());
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                for (int i1 = 0; i1 < m.length; i1++) {
                    for (int j1 = 0; j1 < m.length; j1++) {
                        if (m[i][j].getDescripcion() != m2[i1][j1].getDescripcion()) {
                            mr[i][j].setCantidad(m[i][j].getCantidad());
                            mr[i][j].setDescripcion(m[i][j].getDescripcion());
                            mr[i][j].setPrecio(m[i][j].getPrecio());
                        }
                    }
                }
            }
        }
        return m;
    }
}
