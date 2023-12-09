public class Cat extends Animal  {

    String color;
    String species;

    public Cat(String name, int age, String color, String species) {
        super(name, age);
        this.color = color;
        this.species = species;
    }

    public void makeSound (){

        System.out.println("Мяу-Мяу");

    }

    public void sleepCat(){

        System.out.println("Кот спит");

    }

    @Override
    public String toString() {
        return "\nCat{" +
                "color='" + color + '\'' +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


