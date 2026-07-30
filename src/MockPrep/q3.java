package MockPrep;

class OverLoad{
    int add(int a,int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class q3 {
    public static void main(String[] args) {
        OverLoad o=new OverLoad();
        System.out.println(o.add(2,2));
        System.out.println(o.add(1,2,3));
    }
}
