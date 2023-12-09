public class Dog extends Animal{

    String color;
    String species;

    public Dog(String name, int age, String color, String species) {
        super(name, age);
        this.color = color;
        this.species = species;
    }

    public void makeSound(){

        System.out.println("Гав-Гав");

    }

    public void wag_this_tail(){

        System.out.println("Собака виляет хвостом");
    }

    @Override
    public String toString() {
        return "\nDog{" +
                "color='" + color + '\'' +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
