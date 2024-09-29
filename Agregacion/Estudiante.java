package Agregacion;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void estudiar(){
        System.out.println("Estudiante " + nombre + " estudiando");
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
}
