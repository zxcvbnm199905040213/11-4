import java.util.Scanner;

public class ch3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        if(m>=3 && m<=5) {
            System.out.println("Spring");
        }
        if(m>=6 && m<=8){
            System.out.println("Summer");
        }
        if(m>=9 && m<=11) {
            System.out.println("Autumn");
        }
        if(m<=2 || m>=12){
            System.out.println("Winter");
        }
    }
}