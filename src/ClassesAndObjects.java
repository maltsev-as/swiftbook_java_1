public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("XXX");
        person1.setAge(0);
        System.out.println("������� �������� � main ������: " + person1.getName());
        System.out.println("������� �������� � main ������: " + person1.getAge());
        System.out.println();
        person1.speak();
    }
}

class  Person {
    private String name;
    private int age;

    public void  setName(String userName){
        if (userName.isEmpty()){
            System.out.println("�� ���� ������ ��� ");
        } else {
            name = userName;}
    }

    public String getName(){
        return name;
    }

    public void  setAge(int userAge){
        if(userAge<=0){
            System.out.println("�������� ������ ���� �������������");
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
       // System.out.println("���-�� ��� �� ������ " + years);
        return years;

    }

    void speak (){
        for (int i=0; i<3;i++){
        System.out.println("���� ����� " + name + ",��� " + age + "���.");
        }
    }
    void sayHello(){
        System.out.println("������");
    }
}