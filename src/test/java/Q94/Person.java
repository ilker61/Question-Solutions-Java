package Q94;

public class Person {
    String name;
    int age=25;

    Person (String name){
        setName(name);
    }

    public Person(String name, int age){
        this(name);   // sorunu aslinda Person(name) var.. oysa Cons. this ile cagirilir
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show(){
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1= new Person("Jesse");
        Person p2= new Person("Wallter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}





