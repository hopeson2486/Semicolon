import java.util.Scanner;

public class CaculateIntegers {

    static int[][] array = new int[5][4];


    public static void main(String[] args) throws InterruptedException, IllegalAccessException {
        setInput("1111111");
        display();
    }


    static void fillA() {

        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 1;
        array[0][3] = 1;
    }

    static void fillB() {

        array[0][3] = 1;
        array[1][3] = 1;
        array[2][3] = 1;
    }

    static void fillC() {

        array[2][3] = 1;
        array[3][3] = 1;
        array[4][3] = 1;
    }

    static void fillD() {

        array[4][0] = 1;
        array[4][1] = 1;
        array[4][2] = 1;
        array[4][3] = 1;
    }

    static void fillE() {

        array[2][0] = 1;
        array[3][0] = 1;
        array[4][0] = 1;

    }

    static void fillF() {

        array[0][0] = 1;
        array[1][0] = 1;
        array[2][0] = 1;

    }

    static void fillG() {
        array[2][0] = 1;
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 1;
    }

    static void setInput(String input) throws IllegalAccessException, InterruptedException {
        if (input.length() > 8){
            input = input.substring(0,8);
        }
        char [] fill = input.toCharArray();
        for(char i : fill){
            if (!(i == '1' || i == '0')){
                throw new IllegalAccessException("input must be 1's and 0's");
            }
        }

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '1'){
                switch (i){
                    case 0->fillA();
                    case 1->fillB();
                    case 2->fillC();
                    case 3->fillD();
                    case 4->fillE();
                    case 5->fillF();
                    case 6->fillG();
                }
            }

        }
    }
    static void display() throws InterruptedException {
        for (int[] i : array) {
            for (int j : i) {
                if (j == 1) {
                    System.out.print("* ");
                }
                else System.out.print("  ");
                Thread.sleep(300);
            }
            System.out.println();
        }
    }
}













