package Q179;

public class Tepedelen {
    static int count=0;
    int i=0;
    public void changeCount(){
        while (i<5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Tepedelen check1=new Tepedelen();
        Tepedelen check2=new Tepedelen();

        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " : " + check2.count);
    }
}
