package Q190;

public class App {
    public void m1() throws Exception {
        System.out.println("m1.Accesed");
        throw  new E1();
    }
    public void m2(){
        System.out.println("m2.Accesed");
        throw  new E2();
    }

    public static void main(String[] args) throws Exception {
        int level=1;
        App obj=new App();
        if (level<=5 && level>=3){
            obj.m1();
        }else {
            obj.m2();
        }
    }
}
