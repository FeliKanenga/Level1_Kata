import java.util.Scanner;

public class Square {
    public static void square(int num){

        for (int i = 0; i < num ; i++ ) {

            for (int j = 0; j < num ; j++) {

                System.out.print("#");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number \n");
        int num1 = input.nextInt();
        square(num1);
    }
}
