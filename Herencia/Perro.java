package Herencia;

public class Perro extends Animal{
    private String nombre;
    private int edad;
    private String color;

    public Perro(String nombre, int edad, String color){
        super(nombre, edad);
        this.color = color;
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }   
    
    public String getColor(){
        return color;
    }

    @Override
    public void hacerZonido(){
        System.out.println("Perro haciendo zonido");
    }
}