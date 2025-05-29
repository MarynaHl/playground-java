public class Spiral {
    public static int[] [] spiral(int rows, int columns) {
        int [] [] result = new int[rows][columns];
        int num = 1;
        int top = 0, bottom = rows - 1;
        int left = 0, right = columns - 1;

        while (num <= rows * columns) {
            for (int i = left; i<= right && num <= rows * columns; i++) {
                result[top][i] = num++;
            }
            top++;

            for (int i = top; i)
        }
    }
}