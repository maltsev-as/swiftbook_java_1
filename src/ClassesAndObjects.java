public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("XXX");
        person1.setAge(0);
        System.out.println("Выводим значение в main метода: " + person1.getName());
        System.out.println("Выводим значение в main метода: " + person1.getAge());
        System.out.println();
        person1.speak();
    }
}

class  Person {
    private String name;
    private int age;

    public void  setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Ты ввел пустое имя ");
        } else {
            name = userName;}
    }

    public String getName(){
        return name;
    }

    public void  setAge(int userAge){
        if(userAge<=0){
            System.out.println("Возвраст должен быть положительным");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
       // System.out.println("Кол-во лет до пенсии " + years);
        return years;

    }

    void speak (){
        for (int i=0; i<3;i++){
        System.out.println("Меня зовут " + name + ",мне " + age + "лет.");
        }
    }
    void sayHello(){
        System.out.println("Привет");
    }
}