package Q74;

public class Test {
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException {   // RTE check edilmesi gerekmez
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        Test ex = new Test();
        int cardNo=12344;
        // ex.readCard(cardNo);   //==> Handle edilmesi gereken ve exception lu bir method yazildiginda(readCard methodu)
        // ve bu method baska bir method dan cagirildiginda cagiran methodun da ya ayni tur exception firlatmasi
        // yada kapsayici exception throw etmesi gerekmektedir
        ex.checkCard(cardNo);
    }
}
