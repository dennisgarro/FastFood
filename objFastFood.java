public class objFastFood {
    private int Tipo;
    private int Tamano;
    private int Cantidad;
    private Double PrecioUnidad;
    private Double TotalPagar;
    private int NumeroPedido;
    private int EstadoPedido;

    public objFastFood(int tipo, int tamano, int cantidad, Double precioUnidad, Double totalPagar, int numeroPedido,
            int estadopedido) {
        Tipo = tipo;
        Tamano = tamano;
        Cantidad = cantidad;
        PrecioUnidad = precioUnidad;
        TotalPagar = totalPagar;
        NumeroPedido = numeroPedido;
        EstadoPedido = estadopedido;
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

    public int getNumeroPedido() {
        return NumeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        NumeroPedido = numeroPedido;
    }

    public int getEstadoPedido() {
        return EstadoPedido;
    }

    public void setEstadoPedido(int estadoPedido) {
        EstadoPedido = estadoPedido;
    }

}
