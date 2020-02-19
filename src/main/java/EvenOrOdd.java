import java.util.Scanner;

public class EvenOrOdd {
    public static void evenOrOdd (int num){

    if (num % 2 == 0 ){
        System.out.println("even number");
    }
    else{
        System.out.println("odd number");
    }

}

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number \n");
        int num = input.nextInt();
        evenOrOdd(num);
    }
}
