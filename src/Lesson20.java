public class Lesson20 {
    public static void main(String[] args) {

    Human.description="Nice";
    Human.getDesription();
    Human h1 = new Human("Bob", 30);
    Human h2 = new Human("Tom", 40);
    Human h3 = new Human("Tom", 40);
        h1.toString();
        System.out.println(h1.toString());

    /*
    h1.getAllFields();
    h2.getAllFields();
    Human.description="Bad";
    h1.getAllFields();
    h2.getAllFields();

     */
    h1.printNumberOfPeople();
    System.out.println(Math.pow(2,4));
    System.out.println(Math.PI);
    }
}

class Human {
    private  String name;
    private  int age;
    public static String description;
    public static int countPeople = 0;

    public Human () {
        this.name="ffff";
        this.age=0;
    }
    public Human (String name) {
        System.out.println("Привет из 2 конструктора ");
        this.name=name;
    }
    public Human (String name,int age) {
        System.out.println("Привет из 3 конструктора ");
        this.name=name;
        this.age=age;
        countPeople++;
    }

    public void setAge(int age) {this.age = age; }
    public void setName(String name) {this.name = name; }
    public static void  getDesription (){
        System.out.println(description);
    }

    public void getAllFields (){
        System.out.println(name + ", " + age + ", " + description);
    }

    public static void  printAllFields (){
        System.out.println(description);
    }

    public void printNumberOfPeople (){
        System.out.println("Number of people is " + countPeople);
    }

    public String toString (){
        return  name+","+age;
    }
}
