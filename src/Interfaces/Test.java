package Interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1= new Animal(1);
        Info info2= new Person("Bob");

        outputInfo(info1);
        outputInfo(info2);

        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");

        outputInfo(animal1);
        outputInfo(person1);

    }
    public static void outputInfo (Info info){
        info.showInfo();
    }
    //test
}
