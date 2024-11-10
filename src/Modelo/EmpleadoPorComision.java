package Modelo;

/**
 *
 * @author Emiliano Contreras Gamboa
 */
public class EmpleadoPorComision extends Empleado{
    public double ventasBrutas;
    public double tarifacomision;

    public EmpleadoPorComision(double ventasBrutas, double tarifacomision, String nombre, String apellidoPaterno, String apellidoMaterno, String seguroSocial) {
        super(nombre, apellidoPaterno, apellidoMaterno, seguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifacomision = tarifacomision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifacomision() {
        return tarifacomision;
    }

    public void setTarifacomision(double tarifacomision) {
        this.tarifacomision = tarifacomision;
    }

    @Override
    public double obtenerMontoPago() {
        return ventasBrutas * (tarifacomision/100);
    } 
}
