package Agregacion;

import java.util.ArrayList;

public class Aula {
    private String carrera;
    private ArrayList<Estudiante> estudiantes;

    void iniciarClase(){
        System.out.println("Iniciar aula de " + this.getCarrera());
        estudiantes = new ArrayList<Estudiante>();
        
        Estudiante est1 = new Estudiante("Juan", 20);
        Estudiante est2 = new Estudiante("Pedro", 21);
        Estudiante est3 = new Estudiante("Maria", 19);
        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);
        for(Estudiante est : estudiantes){
            est.estudiar();
        }
    }

    public String getCarrera(){
        return carrera;
    }
}


class Principal {
    public static void main(String[] args) {
        Aula aula = new Aula();
        aula.iniciarClase();
    }
}