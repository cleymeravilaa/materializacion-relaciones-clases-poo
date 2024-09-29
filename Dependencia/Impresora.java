package Dependencia;

public class Impresora {
    public void imprimir(Documento doc){
        // Dependiente de Documento
        System.out.println("Imprimiendo documento: ");
        System.out.println(doc.getContenido());
    }
}
