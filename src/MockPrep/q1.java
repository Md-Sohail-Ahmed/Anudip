package MockPrep;

class Animal{
    void sound(){
        System.out.println("animal make sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class q1 {
    public static void main() {
        Dog d=new Dog();
        d.sound();
        d.bark();
    }
}
