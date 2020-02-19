import java.util.Scanner;

public class Hello {



    public static void hello(String name){

        System.out.println("Hello " + name + "!");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name \n");
        String name = input.nextLine();
        hello(name);

    }

    }

