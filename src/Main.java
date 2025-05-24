import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read(); // Зчитує один символ з клавіатури
            System.out.println("code = " + x + " x = " + (char)x);
        } catch (IOException e) {
            e.printStackTrace(); // Виводить помилку, якщо вона сталася
        }
    }
}
