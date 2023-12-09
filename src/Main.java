//Задача 1:
//        Создайте абстрактный класс "Animal" с полями "name" и "age".
//        Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
//        Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
//        Выведите на экран информацию о каждом объекте.
//        Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Roma", 5, "black", "poodle"));
        animals.add(new Dog("Alex", 3, "red", "dachshund"));
        animals.add(new Dog("Oliver", 2, "Grey", "sheepdog"));

        animals.add(new Cat("Zhora", 1, "white", "persian"));
        animals.add(new Cat("Vitya", 4, "green", "british"));
        animals.add(new Cat("Semen", 8, "black_white", "lop-eared"));


        System.out.println(animals);

        for (Animal animal : animals){

            System.out.println(animal.getClass().getSimpleName() + ":");
            System.out.println("Кличка животного : " + animal.name);
            System.out.println("Возраст животного : " + animal.age + "лет");

            try {
                Method method = animal.getClass().getDeclaredMethod("makeSound");
                method.invoke(animal);
            }

            catch (Exception e){
                System.out.println("метод 'makeSound()' не найден");
            }
            try {
                Method method = animal.getClass().getDeclaredMethod("sleepCat");
                method.invoke(animal);
            }
            catch (Exception e){
                System.out.println("метод 'sleepCat()' не найден");
            }

            try {
                Method method = animal.getClass().getDeclaredMethod("wag_this_tail");
                method.invoke(animal);
            }
            catch (Exception e){
                System.out.println("метод 'wag_this_tail()' не найден");
            }
        }
        
    }
}

