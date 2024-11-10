package Modelo;

/**
 *
 * @author Emiliano Contreras Gamboa
 */
public class Factura implements PorPagar{
    double cantidadPiezas;
    double precioArticulo;
    String Descripcion;

    public Factura(double cantidadPiezas, double precioArticulo, String Descripcion) {
        this.cantidadPiezas = cantidadPiezas;
        this.precioArticulo = precioArticulo;
        this.Descripcion = Descripcion;
    }

    public double getCantidadPiezas() {
        return cantidadPiezas;
    }

    public void setCantidadPiezas(double cantidadPiezas) {
        this.cantidadPiezas = cantidadPiezas;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    @Override
    public double obtenerMontoPago() {
        return cantidadPiezas * precioArticulo;
    }

    @Override
    public String toString() {
        return "Factura{" + "cantidadPiezas=" + cantidadPiezas + ", precioArticulo=" + precioArticulo + ", Descripcion=" + Descripcion + '}';
    }


    
    
    
}
