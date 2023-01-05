package JavaQuizeThree;

import java.util.Scanner;

public class PrintMessegeOfGradeNine {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your grade: ");
        String grade = scanner.next();

        switch(grade){
            case "A+":
                System.out.println("Excelent");
                break;
            case "A":
                System.out.println("very good");
                break;

        }
    }

}
