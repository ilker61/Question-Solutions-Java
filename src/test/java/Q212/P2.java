package Q212;

public class P2 extends P1 implements I1{

    public static void main(String[] args) {
        P1 obj=new P1();
        P2 obj2=new P2();
        I1 obj3=new P2();

        boolean r1=obj instanceof P2;  // false
        boolean r2=obj2 instanceof P1;  // true
        boolean r3=obj3 instanceof I1;  // true
        System.out.println(r1 + " :" + r2 + " :" + r3);  // false :true :true
    }
}
