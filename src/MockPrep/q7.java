package MockPrep;

class ConDemo{
    String name;

    ConDemo(){
        name="Unknown";
    }

    ConDemo(String name){
        this.name=name;
    }
}

public class q7 {
    public static void main(String[] args) {
        ConDemo c1=new ConDemo();
        ConDemo c2=new ConDemo("sohail");

        System.out.println(c1.name);
        System.out.println(c2.name);
    }
}
