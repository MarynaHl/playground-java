public class Main {
    public static void main(String[] args) {
        int[] [] spiral = Spiral.spiral(3, 4);
        for (int[] row : spiral) {
            for (int col : row) {
                System.out.print(String.format("%4d", col));
            }
            System.out.println();
        }
    }

}