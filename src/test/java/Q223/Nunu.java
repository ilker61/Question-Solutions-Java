package Q223;

public class Nunu {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int i=0;
        do {
            System.out.println(arr[i] + " ");
            i++;
        }while (i< arr.length+1);
    }

    /*
    1
    2
    3
    4
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
     */
}
