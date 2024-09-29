package Herencia;

public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }   

    public void hacerZonido(){
        System.out.println("Animal haciendo zonido");
    }

    
}