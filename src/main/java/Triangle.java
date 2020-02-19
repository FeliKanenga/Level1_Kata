import java.util.Scanner;

public class Triangle {

    public static void triangle(int num){

        for (int i = 0; i <= num ; i++ ) {

            for (int j = 0; j <= i ; j++) {

                System.out.print("#");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number \n");
        int num2 = input.nextInt();
        triangle(num2);
    }

}
