public class Main {
    public static void main(String[] args) {
        Requirements.requireNonNull("hello", "Object cannot be null");
        Requirements.checkArgument(true, "Must be true");
    }
}
