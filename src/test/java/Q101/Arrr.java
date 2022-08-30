package Q101;

public class Arrr {
    public static void main(String[] args) {
        int n[];
        n=new int[2];
        n[0]=10;
        n[1]=20;

        n=new int[4];
        n[2]=30;
        n[3]=40;
        for (int x:n
             ) {
            System.out.print(" " + x);   //  0 0 30 40
        }
    }
}
