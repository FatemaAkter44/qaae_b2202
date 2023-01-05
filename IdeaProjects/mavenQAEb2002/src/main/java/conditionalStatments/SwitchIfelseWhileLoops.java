package conditionalStatments;

import java.util.Scanner;

public class SwitchIfelseWhileLoops {
    static Scanner scanner= new Scanner(System.in);
    //System.out.println("enter time: ");
    //int time = scanner.nextInt();

    public static void main(String[] args) throws InterruptedException {
        //positiveOrNagative();
        //TestData testData = new TestData();
        //testData.elseIfStatement();
        //switchExample();
        //whildLoop();
       // whileLoopPrOne();
        //traingleWhile();
        //numberTringle();
        //numberPatern();
        //numberPatternTwo();
        //numberPatternThree();
        //drowingZ();
    }
    public static void drowingZ(){
        /**       5 4 3 2 1          row(i)   colum(j)          when i == 1 print *
         *      1 * * * * *          1        5
         *      2       *            2        4               when i==j print *
         *      3     *              3        3
         *      4   *                 4        2
         *      5 * * * * *         n=5        1              when i == 5 print *
         *                         1 to 5     n to 1
         *                         i++        j--
        * */
        int i , j, n=5;
        i=1;
        while(i<=n){
            j=n;
            while(j>=1){
                if(i==1 || i==j || i==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
    public static void numberPatternThree(){
        /**
         *                         row(i)    space(k)  numberpatern(j)    n=5

                1                  1            1 to 4      1 to 1
              1 2 3                2            1 to 3      1 to 3
            1 2 3 4 5              3           1 to 2       1 to 5
           1 2 3 4 5 6 7           4           1 to 1       1 to 7
         1 2 3 4 5 6 7 8 9       n=5           0            1 to 9
                                 1 to n      1 to (n-i)     1 to (2*i-1)
                                n++            k++             j++
         */
        int i,j,k,n=5;
        i=1;
        while (i<=n){
            k=1;
            while(k<=n-i){
                System.out.print("  ");
                k++;
            }
            j=1;
            while(j<=2*i-1){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
     public static void numberPatternTwo(){
               //row            colum           space
/**12345        1                1--5           0--0
*   2345        2                2--5           1--1
*    345        3                3--5           1--2
*     45        4                4--5           1--3
*      5     n= 5                  5            1--4
 *            1 to n            row to n        1 to (row-1)
 *            ++                  ++              ++           */
int row,colum,space,n=5;
row=1;
while (row<=n){
    space=1;
    while (space<=(row-1)){
        System.out.print(" ");
        space++;
    }
    //colum=1;
    colum=row;
    while (colum<=n){
       // System.out.print(colum+" ");
        System.out.print(colum);
        colum++;
    }
    System.out.println();
    row++;
}
     }
    public static void numberPatern(){
/**1
* 22
* 333
* 4444
* 55555*/
        int row,colum,numberOfLine=5;
        row=1;
        while (row<=numberOfLine){
            colum =1;
            while (colum<=row){
                System.out.print(row);
                colum++;
            }
            System.out.println();
            row++;
        }

    }
    public static void numberTringle(){
       /* 1
          12
          123
          1234
          12345 */


        int i, j, n=10;
        i =1;
        while (i<=n){
            j=1;
            while (j<=i){
                //System.out.println(j);
                //System.out.print(j);
                System.out.print(j+" ");
                //System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void traingleWhile() throws InterruptedException {
        int i=0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*");
       // while (true) {
       while (i <=10){
            System.out.println(stringBuilder);
            stringBuilder.append("*");
            i=i+1;
            //Thread.sleep(1000);

        }
    }
    public static void whileLoopPrOne(){
        int distance =0;
        while(distance <=10){
            System.out.println("*");
            distance = distance+1;
        }
    }
    public static void whileloop(int num){
       while(num>10){
           System.out.println("grater then 10");
           num=0;
       }
        //System.out.println("less then 10");
    }

    public static void whildLoop(){
        int number =0;
        while(number<10){
            System.out.println(number);
            number++;
        }
        System.out.println("======================");
        int numberTwo = 10;
        while(numberTwo>0){
            System.out.println(numberTwo);
            numberTwo--;
        }
    }

    public static void switchExample(){
        int day = 8;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("you entered invalid number.");
        }


    }
    public void elseIfStatement(){
        //Scanner scanner= new Scanner(System.in);
        System.out.println("enter time: ");
        int time = scanner.nextInt();
        if(time<11){
            System.out.println("good morning");
        }else if ( time >11 & time<16){
            System.out.println("good noon");
        }else {
            System.out.println("good night");
        }
    }
    public static void positiveOrNagative(){
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int input = scanner.nextInt();
        if (input< 18){
            System.out.println("input smaller");
        }else{
            System.out.println("input bigger");
        }
        //return input;
    }
}
