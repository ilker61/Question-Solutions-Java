package Q33;

public class Employee {
    String name;
    boolean contract;
    double salary;
    Employee(){
       // Line 1
    }
    public String toString(){
        return name + " :" + contract +":" +salary;
    }

    public static void main(String[] args) {
        Employee e= new Employee();

        // line 2

        System.out.println(e);
    }
}
