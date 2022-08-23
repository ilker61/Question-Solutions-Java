package Q18;

public class Car extends Vehicle{
    String trans;
    Car(String trans){
        this.trans=trans;
    }
    Car(String type, int maxSpeed, String trans){
        super(type, maxSpeed);
        this.trans=trans;
    }

    public static void main(String[] args) {
        Car c1=new Car("Auto");
        Car c2=new Car("4W",150, "Manuel");
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);

        /*
        4W 100 Auto
        4W 150 Manuel
         */
    }
}

