import java.util.Scanner;

public class XO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] b = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        char p = 'X';
        int m = 0;

        while (true) {

            // print board
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++)
                    System.out.print(b[i][j] + " ");
                System.out.println();
            }
            
            System.out.println("Player " + p + " enter row & col:");
            int r = sc.nextInt(), c = sc.nextInt();

            if (r < 0 || r > 2 || c < 0 || c > 2 || b[r][c] != '-') continue;
            b[r][c] = p;
            m++;

            // win check
            for (int i = 0; i < 3; i++)
                if ((b[i][0]==p && b[i][1]==p && b[i][2]==p) ||
                    (b[0][i]==p && b[1][i]==p && b[2][i]==p) ||
                    (b[0][0]==p && b[1][1]==p && b[2][2]==p) ||
                    (b[0][2]==p && b[1][1]==p && b[2][0]==p)) {
                    System.out.println("Player " + p + " wins!");
                    return;
                }
            if (m == 9) 
            { System.out.println("Draw!"); 
            return; 
            }

            p = (p == 'X') ? 'O' : 'X';
        }
    }
}
