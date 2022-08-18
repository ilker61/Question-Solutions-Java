package Q95;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        List<Product> st = new ArrayList<>();
        st.add(new Product(10, "IceCream"));
        st.add(new Product(11, "Chokolade"));
        Product p1= new Product(10, "IceCream");
        System.out.println(st.indexOf(p1));

    }
}
