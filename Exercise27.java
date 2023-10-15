import java.util.Arrays;

public class Exercise27 {
    public static void main(String args[]) {
        int [][] numbers = {{3, 7, 12}, {6, 11, 13}, {4, 14, 2}};
        System.out.println((add(numbers)));
    }
    public static int add(int [][] firstRow) {
        int sum = 0;
        for (int i = 0; i < firstRow.length; i++)
            sum = sum + firstRow[0][i];
        return sum;
    }
}