package Q129;

public class TryCatch {

    public static void main(String[] args) {

        try {
            int num=10;
            int div=0;
            int ans=num/div;
        }catch (ArithmeticException ae){
            // ans=0;
        }catch (Exception e){
            System.out.println("Invalid calculation");
        }
        // System.out.println("Answer = " + ans);

    }
}
