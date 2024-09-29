package Composicion;

public class Computadora {
    private Procesador procesador;

    public void cambiarProcesador(Procesador procesador){
        this.procesador = procesador;
    }

    public void ejecutar(){
        procesador.ejecutar();
    }

    public void eliminarProcesador(){
        throw new UnsupportedOperationException("No se puede eliminar el procesador de la computadora");
    }
    

}
