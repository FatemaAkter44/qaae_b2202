package Exersize;

import java.util.Arrays;

public class ArraysPractice {
    String [] name = {"akhi", "pinki", " bithi"};
    String bucket = Arrays.toString(name);
    int i;

    void printName(){
        System.out.println(Arrays.toString(name));
    }
     void printArraywithForLoop(){
        for (i = 0; i<name.length; i++ ){
            System.out.println(name[i]);
        }
    }
    void ValuePrint(){
        for (i =0; i< name.length; i++){
            System.out.println(name[i]);
        }
    }
    void  valueOfIndexZero(){
        System.out.println(name[0]);
    }


    public static void main(String[] args) {
        ArraysPractice arraysPractice = new ArraysPractice();
        //arraysPractice.printName();
        //arraysPractice.printArraywithForLoop();
        arraysPractice.valueOfIndexZero();
    }
}
