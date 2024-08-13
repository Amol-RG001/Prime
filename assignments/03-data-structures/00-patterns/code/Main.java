import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //pattern_01(n);
        //pattern_02(n);
        //pattern_03(n);
        //pattern_04(n);
        //pattern_05(n);
        //pattern_06(n);
        //pattern_07(n);
        //pattern_08(n);
        //pattern_09(n);
        //pattern_10(n);
        //pattern_11(n);
        //pattern_12(n);
        //pattern_13(n);
        //pattern_14(n);
        //pattern_21(n);
        //pattern_22(n);
        //pattern_18(n);
        //pattern_19(n);
        //pattern_20(n);
    }

    static void pattern_19(int n){
        int spaces = 0;
        //upper-half
        for (int row = 0; row < n ; row++) {
            //star
            for (int col = 1; col <= n-row ; col++) {
                System.out.print("*");
            }
            //space
            for (int col = 0; col <spaces; col++) {
                System.out.print(" ");
            }
            //star
            for (int col = 1; col <= n-row ; col++) {
                System.out.print("*");
            }
            spaces+=2;
            System.out.println();
        }

        //lower-half
        spaces = 2*n-2;
        for (int row = 1; row <=n; row++) {

            //star
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }
            //space
            for (int col = 0; col <spaces; col++) {
                System.out.print(" ");
            }
            //star
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }
            spaces-=2;
            System.out.println();
        }
    }

    static void pattern_20(int n){
        int spaces = 2*n-2;
        for (int row = 1; row <=2*n-1 ; row++) {
                int star = row;
            if (row > n) {
               star = 2*n-row;
            }
            //stars
            for (int col = 1; col <=star; col++) {
                System.out.print("*");
            }
            //space
            for (int col = 1; col <= spaces; col++) {
                System.out.print(" ");
            }

            //stars
            for (int col = 1; col <= star; col++) {
                System.out.print("*");
            }
            System.out.println();
            if (row < n) {
                spaces -=2;
            }else {
                spaces +=2;
            }
        }
    }
    static void pattern_18(int n){
        for (int i = 0; i < n; i++) {


            for(int j=0; j<=i; j++ ){
                System.out.print((char)((char)('A'+n-1)-j));
            }
            System.out.println();
        }
    }
    static void pattern_22(int n){
        int index;
        int originalN = n;
        n = 2*n-1;
        for (int row = 0; row < n ; row++) {

            for (int col = 0; col < n ; col++) {
                index = originalN-Math.min(Math.min(col,row), Math.min(n-col-1, n-row-1));
                System.out.print(index+" ");
            }
            System.out.println();
        } 
    }
    static void pattern_21(int n){
        for (int i = 1; i <=n; i++) {

            for (int j=1; j<=n; j++) {
                if (i==1||j==1||i==n||j==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern_14(int n){
        for (int i = 0; i < n ; i++) {
            for (char j = 'A'; j <= 'A'+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern_13(int n){
        int count = 1;
        for (int row = 1; row <=n ; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    static void pattern_12(int n){


        int space = 2*(n-1);

        for (int row = 1; row <=n; row++) {


            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
            //space
            for (int col = 1; col <= space ; col++) {
                System.out.print(" ");
            }

            for (int col = row; col >=1; col--) {
                System.out.print(" "+col);
            }
            System.out.println();
            space-=2;
        }

    }
    static void pattern_11(int n){

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                if((row+col)%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    static void pattern_10(int n){
        //upper-star
        for (int row = 0; row <n; row++) {

            //star
            for (int j = 0; j < row+1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //lower-star
        for (int row = 0; row < n; row++) {

            //star
            for (int j = 0; j <(n)-(row+1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void pattern_09(int n){
        //upper-star
        for (int row = 0; row <n; row++) {
            //space
            for (int j = 0; j < n-row-1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*row+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < n-row-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        //lower-star
        for (int row = 0; row < n; row++) {
            //space
            for (int j = 0; j < row ; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j <(2*n)-(2*row+1); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < row ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern_08(int n){
        for (int row = 0; row < n ; row++) {

            for (int j=0; j<row; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < (2*n)-(2*row+1); j++) {
                System.out.print("*");
            }

            for (int j=0; j<row; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    static void pattern_07(int n){
        for (int row = 0; row < n ; row++) {

            //space

            for (int j = 0; j < n-row-1; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < 2*row+1; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < n-row-1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    static void pattern_06(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i)+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern_05(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i)+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern_04(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern_03(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern_02(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern_01(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
