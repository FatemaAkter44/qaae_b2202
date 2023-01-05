package Exersize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ArrayLIstColor {
    ArrayList<String> colors = new ArrayList<>(Arrays.asList("red", "blue","Green", "white"));
    public int getSizeOfArrayList(){
       int size = colors.size();
        return size;
    }
    public void PrintArrayListWithForEachLoop(){
        for ( String i : colors) {
            System.out.println(i);
        }
    }
    public void ArrayListColor(){
        for (int i = 0; i <colors.size() ; i++) {
            System.out.println(colors.get(i));
        }
    }
    public void ArrayListWithLamda(){
        colors.forEach(i -> System.out.println(i));
    }
    public void lemdaOne(){
        colors.forEach(temporaryContainer -> System.out.println(temporaryContainer.toUpperCase(Locale.ROOT)));
    }
    public void lamdaTwo(){
        colors.forEach(temp -> System.out.println(temp.toLowerCase(Locale.ROOT)));
    }

    public static void main(String[] args) {
        ArrayLIstColor arrayLIstColor = new ArrayLIstColor();
        //System.out.println(arrayLIstColor.getSizeOfArrayList());
        //arrayLIstColor.PrintArrayListWithForEachLoop();
        //arrayLIstColor.ArrayListColor();
        //arrayLIstColor.ArrayListWithLamda();
        //arrayLIstColor.lemdaOne();
        arrayLIstColor.lamdaTwo();
    }
}
