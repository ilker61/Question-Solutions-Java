package Q19;

public class Test {

    static int a;
    int b;

    public static void main(String[] args) {
        System.out.println(a);  // static veriableler kullanilmadan evvel initialize edilmek zorunda degil
        //System.out.println(b);  ==> instance veriableler kullanilmadan evvel initialize edilmek zorunda


    }
    private Test(){

    }

    private Test(int x){
        // Bir class ta overload edilmis private constructor olabilir
    }
}
