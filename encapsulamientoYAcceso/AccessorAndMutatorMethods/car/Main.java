//package encapsulamientoYAcceso.AccessorAndMutatorMethods.car;

public class Main {
    public static void main(String args[]){
        car Car = new car();
        
        Car.setCompany_name("Chevrolet");
        Car.setModel_name("Cruze");
        Car.setYear(2009);

        String company_name = Car.getCompany_name();
        String model_name = Car.getModel_name();
        int year = Car.getYear();
        double mileage = Car.getMileage();

        System.out.println("Company Name: " + company_name);
        System.out.println("Model Name: " +model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
}
