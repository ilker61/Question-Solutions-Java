package Q191;

public class Vovel {
    private char var;

    public static void main(String[] args) {
        char var1='a';
        char var2=var1;
        var2='e';

        Vovel obj1=new Vovel();
        Vovel obj2=obj1;
        obj1.var='o';
        obj2.var='i';
        //boolean a=obj1==obj2;
        //System.out.println(a);
        System.out.println(var1 + ", " + var2);  // a, e
        System.out.println(obj1.var + ", " + obj2.var);  //   i,  i
    }
}
