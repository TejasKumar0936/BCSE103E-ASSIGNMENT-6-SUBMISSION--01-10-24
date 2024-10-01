import java.util.*;

public class BCSE103E_ASSIGNMENT__01_10_24__PRG2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int moves = sc.nextInt();
        System.out.println();   
        System.out.println(weight);
        if (moves <= 6) {
            if (row < 8) {
                System.out.println((row + 1) + "," + col);
            }
        } else {
            int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}, {-1,-1}, {-1,1}, {1,-1}, {1,1}};
            for (int[] i : dir) {
                int row1 = row + i[0];
                int col1 = col + i[1];
                if (row1 >= 1 && row1 <= 8 && col1 >= 1 && col1 <= 8) {
                    System.out.println(row1 + "," + col1);
                }
            }
        }
    }
}