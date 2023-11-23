package abstractas;

public class cuadrado extends figuraGeometrica {

    public cuadrado(String tipoFigura) {
        super(tipoFigura);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un: " + this.getClass().getSimpleName());
    
    }    
}
