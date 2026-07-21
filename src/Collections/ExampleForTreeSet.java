package Collections;

import java.util.TreeSet;

class Car implements Comparable<Car>{
    int cost;
    Car(int cost)
    {
        this.cost = cost;
    }
    @Override
    public int compareTo(Car o) {
        return this.cost - o.cost;
    }
    @Override
    public String toString() {
        return "Car [cost=" + cost + "]";
    }
}

public class ExampleForTreeSet {

    public static void main(String[] args) {

        Car c1 = new Car(200);
        Car c2 = new Car(100);
        Car c3 = new Car(50);

        TreeSet<Car> t = new TreeSet<>();
        t.add(c1);
        t.add(c2);
        t.add(c3);

        for(Car c : t)
        {
            System.out.println(c);
        }
    }

}