package Q26;

public class FieldInit {
    Character c;   // default null verir. cinki Wrapper class nonprimitiv dir
    boolean b;   // default false dir
    float f;  // default 0.0 dir
    void printAll(){
        System.out.println("c= " + c);
        System.out.println("b= " + b);
        System.out.println("f= " + f);
    }

    public static void main(String[] args) {
        FieldInit f =new FieldInit();
        f.printAll();

        /*
        c= null
        b= false
        f= 0.0
         */
    }
}
