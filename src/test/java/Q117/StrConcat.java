package Q117;

public class StrConcat {
    public static void main(String[] args) {
        String ta="A ";
        ta=ta.concat("B ");
        String tb="C ";
        ta=ta.concat(tb);
        ta.replace('C','D'); // Atama yapilmayik
        ta=ta.concat(tb);
        System.out.println(ta);   // A B C C
    }
}
