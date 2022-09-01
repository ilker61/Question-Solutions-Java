package Q188;

public class Test {
    public static void main(String[] args) {
        CheckingAccount acct=new CheckingAccount((int)(Math.random()*1000));
        acct.changeAmount(-acct.amount);
        System.out.println(acct.getAmount());
    }
}
