public class calculator {
    public calculator(){

    }

    public int add( int a, int b){
        return a + b;
    }
    public int substract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public double divide(int a, int b){
        return a/b;
    }
    public int modulo(int a, int b){
        return a%b;
    }

    public static void main(String[] args){
        calculator calc = new calculator();
        System.out.println(calc.add(5,8));
        System.out.println(calc.substract(17, 9));
        System.out.println(calc.multiply(7, 9));
        System.out.println(calc.divide(5, 2));
        System.out.println(calc.modulo(5, 2));
    }
}
