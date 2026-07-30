package MockPrep;

abstract class Shape{
    abstract void drow();
}


abstract class Circle extends Shape{
    void drow(){
        System.out.println("drowing a circle");
    }

    abstract void make();
}

class Square extends Circle{
    @Override
    void make() {
        System.out.println("make a Square");
    }
}

public class q4 {
    public static void main(String[] args) {
        Square s=new Square();
        s.make();
        s.drow();
    }
}
