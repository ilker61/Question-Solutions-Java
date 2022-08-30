package Q104;

import java.time.LocalDate;

public class DerivedB extends DerivedA{
    public void test(){
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Base b1=new DerivedB();
        Base b2=new DerivedA();
        Base b3=new DerivedB();
        Base b4=b3;
        b1=(Base) b2;  // Base olmaya zorlasada altta overload edilmis method varsa onu getirir
        b1.test();
        b4.test();
        // DerivedA
        //DerivedB


    }
}
