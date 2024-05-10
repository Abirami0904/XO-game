import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean check=true;
        while(check){
            char[][] arr=new char[4][4];
            System.out.println("Initially at starting stage:");
            XOgame.display(arr);
            check=XOgame.getinput(arr,in);
        }
    }
}
