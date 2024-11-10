package Modelo;

/**
 *
 * @author juan.ucan
 */
public class EmpleadoAsalariado extends Empleado implements PorPagar{
    private double salario;
    
    //Constructor

    public EmpleadoAsalariado( String nombre, String apellidoPaterno, String apellidoMaterno, String seguroSocial, double salario) {
        super(nombre, apellidoPaterno, apellidoMaterno, seguroSocial);
        this.salario = salario;
    }
    
    //Métodos get
    public double getSalario() {
        return salario;
    }
    
    //Métodos set

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Código del método abstracto
    @Override
    public double obtenerMontoPago() {
       return getSalario();
    }
        
}
