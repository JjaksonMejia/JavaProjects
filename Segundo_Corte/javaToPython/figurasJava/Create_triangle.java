public class Create_triangle {
    private double base;
    private double altura;
    private double h;
    Create_triangle(double base){
        this.base = base;
        this.altura = this.base/2;
        this.altura = (Math.pow(this.base, 2))-(Math.pow(this.altura,2));
        this.h = Math.sqrt(this.altura);
        System.out.println("Creando un triángulo equilatero de lado" + base);
    }

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return this.h;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double area(){
        return this.base*this.h/2;
    }
    public double perimetro(){
        return (this.base*3);
    }

    public static void main(String[] args){
        Create_triangle triangle1 = new Create_triangle(6);

        System.out.println("Perímetro del rectángulo: " + triangle1.perimetro() + "  ---- Área del rectángulo: " + triangle1.area());
    }
}
