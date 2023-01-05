package Exersize;

import java.util.ArrayList;

public class ArrayListOfFruit {
    public static ArrayList<String> addArrayList(){
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Banana");
        fruitList.add("mango");
        fruitList.add("BlackBerry");
        fruitList.add("strawberry");

        return fruitList;
    }

    public static void main(String[] args) {
        //System.out.println(addArrayList());
        //System.out.println(addArrayList().size());
        //System.out.println(addArrayList().get(1));

        for (int i = 0; i < addArrayList().size(); i++) {
            if (addArrayList().contains("mango")){
                System.out.println("Buy 10 kg Mango"+ i);
                break;
            } else {
                System.out.println("Buy something Else");
            }

        }
    }
}
