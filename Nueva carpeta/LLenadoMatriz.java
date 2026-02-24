import java.util.Random;
import java.util.Scanner;

public class LLenadoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz");
        n = sc.nextInt();
        int[][] m = new int[n][n];
        Metodos M = new Metodos();
        m = M.LlenarMatriz(m);
        M.MostrarMatriz(m);
        System.out.println("Ahora vamos a validar con matrix objetual");
        Obj[][] Mo = new Obj[n][n];
        Mo = M.LlenarMatriz(Mo);
        M.MostrarMatriz(Mo);

        System.out.println("vamos a llenar la matriz objetual con los valores de descripcion, cantidad y precio");
        ObjVillalobos[][] villalobos = new ObjVillalobos[n][n];
        ObjVillalobos[][] villalobos2 = new ObjVillalobos[n][n];
        villalobos = M.LLenarMatriz(villalobos, sc);
        M.MostrarMatriz(villalobos);

        System.out.println("vamos a llenar al segunda matriz");
        villalobos2 = M.LLenarMatriz(villalobos2, sc);
        M.MostrarMatriz(villalobos2);
        ObjVillalobos[][] Mr = new ObjVillalobos[n * n][n];
        Mr = M.FucionarMatrices(villalobos, villalobos2, Mr);
        M.MostrarMatriz(Mr);

    }

}
