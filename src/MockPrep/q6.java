package MockPrep;

class Info{
    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class q6 {
    public static void main(String[] args) {
        Info i=new Info();
        i.setName("Sohail");
        i.setAge(23);
        System.out.println(i.getName());
        System.out.println(i.getAge());
    }
}
