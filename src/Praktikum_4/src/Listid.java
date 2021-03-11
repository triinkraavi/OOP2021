import java.util.ArrayList;
import java.util.Arrays;

public class Listid {

    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
        ArrayList<Integer> tulemus = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            tulemus.add(list.get(i));
            
        }
        return tulemus;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3));
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i) + " ");
        }

        ArrayList<Integer> intList = new ArrayList<>();
        intList.addAll(Arrays.asList(1, 2, 3));
        System.out.println(reverse(intList));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3));
        list3.add(2, 54);
        System.out.println(list3);



    }
}
