import java.util.Scanner;

public class ch1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        if(x>=-100 && x<=100 && y>=-100 &&y<=100) {
            System.out.println("inside");
        }
        else {
            System.out.println("outside");
        }
    }
}
