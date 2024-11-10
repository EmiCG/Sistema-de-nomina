package Modelo;

/**
 *
 * @author Alejandro lopez maldonado
 */

public class EmpleadoPorHoras extends Empleado {
    private double sueldoPorHora;
    private double horas;

    public EmpleadoPorHoras(double sueldoPorHora, double horas, String nombre, String apellidoPaterno, String apellidoMaterno, String seguroSocial) {
        super(nombre, apellidoPaterno, apellidoMaterno, seguroSocial);
        this.sueldoPorHora = sueldoPorHora;
        this.horas = horas;
    }
    
    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public double obtenerMontoPago() {
        if(horas <= 40) {
            return sueldoPorHora * horas;
        } else {
            return (sueldoPorHora * 40) + ((horas - 40) * sueldoPorHora * 1.5);
        }
    }
    
}
