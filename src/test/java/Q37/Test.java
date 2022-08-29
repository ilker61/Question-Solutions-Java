package Q37;

public class Test {
    public static void main(String[] args) {
        int data[]={2010, 2013, 2014, 2015, 2014};
        int key=2014;
        int count=0;
        for (int e:data
             ) {
            if (e!=key){
                //continue;
                count++;  // ===>  unreachebel code oldugundan hata verir
            }
        }
        System.out.println(count + " Found");
    }
}
