import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lines will there be in the array: ");
        int M = sc.nextInt();
        System.out.print("How many colluns will there be in the array: ");
        int N = sc.nextInt();
        int[][] mat = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Position [" + i + "," + j + "]");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("");
        System.out.println("PRINT ARRAY");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println("\n");

        }
        sc.close();
    }

}
