import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangle {

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();


    public void sum() throws FileNotFoundException {
        if (a + b < c) {
            throw new FileNotFoundException("a+b<c  provide another numbers because this not triangle");
        }
       if (a+b>c);
        System.out.println("Triangle");
    }
    }

