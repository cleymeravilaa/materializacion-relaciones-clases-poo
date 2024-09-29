package Asociacion;


public class Jugador {
    private String nombre;
    private Equipo equipo; // Asociacion bidireccional

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public Equipo getEquipo(){
        return equipo;
    }
}

