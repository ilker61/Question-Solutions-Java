package Q55;

public class Test {
    public static void main(String[] args) {
        int x=5;
        while (isAvaliable(x)){
            System.out.print(x);
            x--;
        }
    }
    public static boolean isAvaliable(int x){
        return x-- > 0 ? true: false;
    }
}
