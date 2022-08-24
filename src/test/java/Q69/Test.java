package Q69;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[][] chs=new String[5][2];
        // System.out.println(chs.length);
        chs[0]=new  String[2];
        chs[1]=new String[5];



        int i=97;
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b]=""+ i;    //   ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
            }
        }


        for (String[] ca:chs) {
            for (String c: ca) {
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }
}
