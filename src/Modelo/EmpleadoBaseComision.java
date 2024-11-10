package Modelo;

/**
 *
 * @author Emiliano Contreras Gamboa
 */
public class EmpleadoBaseComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseComision(double salarioBase, double ventasBrutas, double tarifacomision, String nombre, String apellidoPaterno, String apellidoMaterno, String seguroSocial) {
        super(ventasBrutas, tarifacomision, nombre, apellidoPaterno, apellidoMaterno, seguroSocial);
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double obtenerMontoPago() {
        return salarioBase + (ventasBrutas * tarifacomision/100);
    }
    
}
