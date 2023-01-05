package conditionalStatments;

public class PatternsWithForLoop {
    public static void main(String[] args) {
        pattern9(5);
    }
    public static void pattern10(int n){
/**
     *
    * *
   * * *
  * * * *
 * * * * *  */
    for (int row = 1; row <=n ; row++) {
            for (int space = row; space <=n ; space++) {
                System.out.print(" ");

            }
            for (int col=1 ; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){

        for (int row = 1; row <=n ; row++) {
            for (int space = 1; space <=row-1 ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=2*n-row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        /**
             *
            ***
           *****
          *******
         **********/
        for (int row = 1; row <=n ; row++) {
            for (int space =1 ; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
/**
 *****
  ****
   ***
    **
     *
 */
        for (int row = 1; row <=n ; row++) {
            for (int space =1; space <=row-1 ; space++) {
                System.out.print(" ");

            }
            for (int col=1 ; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
/**
     *
    **
   ***
  ****
 *****
  */
        for (int row = 1; row <=n ; row++) {
            for (int space = row; space <=n ; space++) {
                System.out.print(" ");

            }
            for (int col=1 ; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        /**
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         **/
        for (int row = 0; row < 2*n; row++) {
            int totalColumInRow= row > n ? 2*n-row : row;
            for (int col = 0; col < totalColumInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        /**
         1
         12
         123
         1234
         12345 **/
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        /**
         *****
         ****
         ***
         **
         *
         */
        for (int row=1; row<=n; row++){
           // for( int col=1; col<=n-row+1; col++){
              for(int col =0; col<n-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        /**
         *
         **
         ***
         ****
         *****
         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern1(int n){
        /**
         ******
         ******
         ******
         ******
         ******    */
        for (int row=1; row<=n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }


}
