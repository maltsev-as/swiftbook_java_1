package Interfaces;

public class Animal implements Info{
    public int id;
    //test
    public Animal (int id){
        this.id=id;
    }

    public void sleep (){
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo(){
        System.out.println("Id id " + this.id);
    }
}
