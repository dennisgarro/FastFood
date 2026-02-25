package punto4;

import java.util.Scanner;

public class llenadoMatriz 

//Hola
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz");
        n = sc.nextInt();
        int[][] m = new int[n][n];
        metodos M = new metodos();
        m = M.LlenarMatriz(m);
        M.MostrarMatriz(m);
        System.out.println("Ahora vamos a validar con matrix objetual");
        obj[][] Mo = new obj[n][n];
        Mo = M.LlenarMatriz(Mo);
        M.MostrarMatriz(Mo);

        System.out.println("vamos a llenar la matriz objetual con los valores de descripcion, cantidad y precio");
        objMAtributos[][] m1 = new objMAtributos[n][n];
        objMAtributos[][] m2 = new objMAtributos[n][n];
        m1 = M.LLenarMatriz(m1, sc);
        M.MostrarMatriz(m1);

        System.out.println("vamos a llenar al segunda matriz");
        m2 = M.LLenarMatriz(m2, sc);
        M.MostrarMatriz(m2);
        objMAtributos[][] Mr = new objMAtributos[n * n][n];
        Mr = M.FucionarMatrices(m1, m2, Mr);
        M.MostrarMatriz(Mr);

    }
}
