package Q68;

import java.io.IOException;

public class test {
    public static void main(String[] args) {
        try {
            method1();
        }catch (MyException ne)
        {
            System.out.println("A");
        }
    }
    public static void method1(){
        try {
            throw 3>10 ? new MyException() : new Exception();
        }catch (IOException ie){
            System.out.println("I");
        }catch (Exception re){
            System.out.println("B");
        }
    }
}
