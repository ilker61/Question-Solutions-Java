package Q34;

public class Triangel {
    static double area;
    int b=2, h=3;

    public static void main(String[] args) {

        double p, b, h;   // line 1
        if (area==0){
            b=3;
            h=4;
            p=0.5;
            area=p*b*h;    // line 2
        }

        System.out.println(" Area is " +area);    //  Area is 6.0

    }
}
