package Composicion;

public class Procesador {
    
    private String modelo;

    public Procesador(String modelo){
        this.modelo = modelo;
    }

    public void ejecutar(){
        System.out.println("Procesador ejecutando: " + modelo);
    }
}
