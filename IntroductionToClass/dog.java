public class dog{
    String breed;
    boolean hasOwner;
    int age;

    public dog(String dogBreed, boolean dogOwned, int dogYears){
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }
    public static void main(String[] args){
        System.out.println("Main method started!");
        dog fido = new dog("Poodle", false, 4);
        dog ludor = new dog("bulldog", true, 7);
        boolean isFidoOlder = fido.age > ludor.age;
        int totalDogYears = fido.age + ludor.age;
        System.out.println("Two dogs created: a " + fido.breed + " and a " + ludor.breed);
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("Main method finished");
    }
}