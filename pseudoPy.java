
import java.util.Scanner;

public class pseudoPy {

    public static String input(String request){
        print(request);
        Scanner a = new Scanner(System.in);
        return a.next();
    }
    public static void print(String input){
        System.out.print(input);
    }
    public static void println(String input){
        System.out.println(input);
    }
    public static void println(){
        System.out.println();
    }


    public static void main(String[] args) {

       String test = input("First query> ");
       print(test);

       println();

       println(input("Second query> "));

    }


}

