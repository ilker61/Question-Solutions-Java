package Q82;

public class TestA {
    public static void main(String[] args) {
        Alpha ref1=new Alpha(50);
        Alpha ref2=new Alpha(125);
        Alpha ref3=new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();


        /*
        ns= 50 s= 125
        ns= 125 s= 125
        ns= 0 s= 125
         */
    }
}
