package Simple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] pos = posInput();
        int[] des = posInput();
        boolean isLegit = isLegit(pos,des);
        System.out.println("is knight movement possible:" + isLegit);
    }
    public static int[] posInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter position");
        String posSt = scanner.nextLine();
        int[] pos = new int[2];
        pos[1] = posSt.charAt(1);
        String cords = "abcdefgh";
        for (int i = 0; i < cords.length(); i++) {
            if (posSt.charAt(0) == cords.charAt(i)) {
                pos[0] = i+1;
                break;
            }
        }
        if (pos[0] == 0){
            throw new RuntimeException("WRONG INPUT");
        }
        return pos;
    }
    public static boolean isLegit(int[] pos, int[] des){
        return ((des[0] == pos[0] + 1 || des[0] == pos[0] - 1)
                && (des[1] == pos[1] + 2 || des[1] == pos[1] - 2))
                || ((des[0] == pos[0] + 2 || des[0] == pos[0] - 2)
                && (des[1] == pos[1] + 1) || des[1] == pos[1] - 1);
    }
}
