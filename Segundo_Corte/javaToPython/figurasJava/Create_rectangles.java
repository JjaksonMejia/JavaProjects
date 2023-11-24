public class Create_rectangles {
    private double base;
    private double altura;
    Create_rectangles(double base, double altura){
        this.base = base;
        this.altura = altura;
        System.out.println("Creando un cuadrado de base" + base + " y altura "  + altura);
    }

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return this.base*this.altura;
    }
    public double perimetro(){
        return (this.base*2)+(this.altura);
    }

    public static void main(String[] args){
        Create_rectangles rectangle1 = new Create_rectangles(6, 5);
        Create_rectangles table1 = new Create_rectangles(3, 4);

        System.out.println("Perímetro del rectángulo: " + rectangle1.perimetro() + "  ---- Área del rectángulo: " + rectangle1.area());
        System.out.println("Perímetro de la mesa: " + table1.perimetro() + "  ---- Área de la mesa: " + table1.area());
    }
}
