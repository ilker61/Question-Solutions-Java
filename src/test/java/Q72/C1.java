package Q72;

public class C1 extends C2 implements I{
    public void displayI(){
        System.out.println("C1");
    }

    public static void main(String[] args) {
        C2 obj1=new C1();
        I obj2=new C1();

        obj1.displayC2();
        obj2.displayI();
       /*

        C2 s=obj2;
        I t=obj1;

        t.displayI();
        s.displayC2();

        */
    }
}
