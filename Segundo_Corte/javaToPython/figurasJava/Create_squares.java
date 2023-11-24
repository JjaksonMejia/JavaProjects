public class Create_squares {
    private double lado;
    
    public Create_squares(double l){
        this.lado = l;
        System.out.println("Creando un cuadrado con lado: " + l);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double perimetro(){
        return this.lado*4;
    }

    public double area(){
        return this.lado*this.lado;
    }

    public static void main(String[] args){
        Create_squares square1 = new Create_squares(5);

        System.out.println("Perímetro: " + square1.perimetro() + "  ---- Área: " + square1.area());
    }
}
