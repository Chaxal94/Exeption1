import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        try {
            triangle.sum();

        } catch ( FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}



