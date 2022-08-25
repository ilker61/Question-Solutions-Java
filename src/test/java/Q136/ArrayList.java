package Q136;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> arrayList=new java.util.ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0, "Java");

        arrayList.forEach(a-> a.concat("Forum")); // Degisiklikler foreach loop icinde kalir

        arrayList.replaceAll(s-> s.concat("Group"));  // degisiklikler kalicidir

        System.out.println(arrayList);   // [JavaGroup, ExpertGroup]
    }
}
