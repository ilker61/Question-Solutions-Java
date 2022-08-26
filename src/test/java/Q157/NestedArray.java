package Q157;

import java.util.Arrays;

public class NestedArray {
    public static void main(String[] args) {

        int num[][]=new int[3][1];
        System.out.println(num.length);

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]=10;
            }

        }



    }
}
