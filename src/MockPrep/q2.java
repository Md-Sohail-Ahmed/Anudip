package MockPrep;

class Printer{
    void print(){
        System.out.println("printer is printing doc1");
    }
}

class SubPrinter{
    void print(){
        System.out.println("printer is printing doc2");
    }
}

public class q2 {
    public static void main(String[] args) {
        SubPrinter s=new SubPrinter();
        s.print();

//        Printer p=new Printer();
//        p.print();
    }
}
