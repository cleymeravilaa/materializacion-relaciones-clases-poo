package RelacionMuchosAMuchos;


// Clase intermedia que modela la relación muchos a muchos entre empleado y proyecto
public class Asignacion {
    private Empleado empleado;
    private Proyecto proyecto;
    
    public Asignacion(Empleado empleado, Proyecto proyecto){
        this.empleado = empleado;
        this.proyecto = proyecto;
    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public Proyecto getProyecto(){
        return proyecto;
    }   

    public void mostrarAsignacion(){
        System.out.println("Empleado: " + empleado.getNombre() + " asignado al proyecto: " + proyecto.getNombre());
    }
}
