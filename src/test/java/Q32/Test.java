package Q32;

public class Test {

    int i;
    static int j;

    public static void main(String[] args) {

        Test x1=new Test();
        Test x2=new Test();
        x1.i=3;
        x1.j=4;
        x2.i=5;
        x2.j=6;
        System.out.println(
               x1.i + " " +
               x1.j + " " +
               x2.i + " " +
               x2.j );

    }

}
