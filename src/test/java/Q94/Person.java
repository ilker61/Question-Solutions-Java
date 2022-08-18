package Q94;

public class Person {
    String name;
    int age=25;

    Person (String name){
        setName(name);
    }

    public Person(String name, int age){
        //Person(name);
        //setAge(age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }




}
