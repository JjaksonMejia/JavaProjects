package test;

import abstractas.*;

public class TestAbstracta {
    public static void main(String[] args) {
       figuraGeometrica figura = new Rectangulo("Rectangulo1");
       
       //System.out.println(figura);
       figura.dibujar();
       
       figura = new cuadrado("Cuadrado1");
       figura.dibujar();
       
    }
}
