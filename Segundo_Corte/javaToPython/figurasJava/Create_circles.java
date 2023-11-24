public class Create_circles {
    public double pi = 3.14;
    public double radius;
    public Create_circles (double diameter){
        System.out.println("Creando un circulo con diametro: " + diameter);
        this.radius = diameter/2;
    }

    public double Circunference (){
        return 2*this.pi*this.radius;
    }

    public double area(){
        return this.pi*(this.radius*this.radius);
    }

    public static void main(String[] args){
       Create_circles medium__pizza = new Create_circles(12);
       Create_circles teaching_table = new Create_circles(36);
       Create_circles round_room = new Create_circles(11460);

       System.out.println("Perímetro: " + medium__pizza.Circunference() + "  ---- Área: " + medium__pizza.area());
       System.out.println("Perímetro: " + teaching_table.Circunference() +"  ---- Área: " + teaching_table.area());
       System.out.println("Perímetro: " + round_room.Circunference() +"  ---- Área: " + round_room.Circunference());
    }
}
