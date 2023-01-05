package Exersize;

import java.util.ArrayList;

public class ArrayListExersize {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("student1");
        studentList.add("student2");


        //System.out.println(studentList);
        System.out.println(studentList.get(0));
        studentList.add("student3");
        studentList.add("student4");

        System.out.println(studentList);
        for (int i=1; i<=2; i++){
            System.out.println(studentList.get(i));
        }
        System.out.println("  ccccccccccccccccccccccccccccccc");
        //for each loop
        for (String temporyContainer : studentList) {
            System.out.println(temporyContainer);

        }

        System.out.println("ccccccccccccccccccccccccccccccc");
        studentList.forEach(temporaryContainer -> System.out.println(temporaryContainer));


    }
}
