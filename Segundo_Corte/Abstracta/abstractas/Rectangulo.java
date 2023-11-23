package abstractas;

public class Rectangulo extends figuraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un:" + this.getClass().getSimpleName());
    }
}
