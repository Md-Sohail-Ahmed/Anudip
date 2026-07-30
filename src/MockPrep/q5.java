package MockPrep;

interface Vehicle{
    void start();
}
interface Person{
    void walk();
}

class Car implements Vehicle,Person{
    public void start(){
        System.out.println("Car is Started");
    }
    public void walk(){
        System.out.println("person is walking");
    }
}

public class q5 {
    public static void main(String[] args) {
        Car s=new Car();
        s.start();
        s.walk();
    }
}
