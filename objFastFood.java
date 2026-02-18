public class objFastFood {
    private int Tipo;
    private int Tamano;
    private int Cantidad;
    private Double PrecioUnidad;
    private Double TotalPagar;
    private String Descripcion;
    private String Notas;

    public objFastFood(int tipo, int tamano, int cantidad, Double precioUnidad, Double totalPagar, String descripcion,
            String notas) {
        Tipo = tipo;
        Tamano = tamano;
        Cantidad = cantidad;
        PrecioUnidad = precioUnidad;
        TotalPagar = totalPagar;
        Descripcion = descripcion;
        Notas = notas;
    }

    public objFastFood() {
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int tipo) {
        Tipo = tipo;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int tamano) {
        Tamano = tamano;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Double getPrecioUnidad() {
        return PrecioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad) {
        PrecioUnidad = precioUnidad;
    }

    public Double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        TotalPagar = totalPagar;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getNotas() {
        return Notas;
    }

    public void setNotas(String notas) {
        Notas = notas;
    }

}
