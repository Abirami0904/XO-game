import java .util.*;
public class XOgame
{
    public static boolean getinput(char[][] arr,Scanner in){
        for(int ind=1;ind<=9;++ind){
            if(ind%2==1){
                System.out.print("Enter index to place X:");
                int i=in.nextInt();
                int j=in.nextInt();
                if(checkforemptyness(arr,i,j)){
                    arr[i][j]='X';
                    System.out.println("After placing X at "+i+","+j+":");
                    display(arr);
                    if(checkforvictory(arr,i,j,'X')){
                        System.out.println("X won!!");
                        System.out.println("Do u want to contiune,if yes press 1 else 0");
                        int n=in.nextInt();
                        return n==1;
                    }
                }
                else{
                    System.out.print("Re-enter correct index");
                    --ind;
                }
            }
            else{
                System.out.print("Enter index to place O:");
                int i=in.nextInt();
                int j=in.nextInt();
                if(checkforemptyness(arr,i,j)){
                    arr[i][j]='O';
                    System.out.println("After placing O at "+i+","+j+":");
                    display(arr);
                    if(checkforvictory(arr,i,j,'O')){
                        System.out.println("O won!!");
                        System.out.println("Do u want to contiune,if yes press 1 else 0");
                        int n=in.nextInt();
                        return n==1;
                    }
                }
                else{
                    System.out.println("Re-enter correct index\n");
                    --ind;
                }
            }
        }
        System.out.println("Match Draw");
        System.out.println("Do u want to contiune,if yes press 1 else 0");
        int n=in.nextInt();
        return n==1;
    }
    public static boolean checkforemptyness(char[][] arr,int i,int j){
        return ((i<=3&&j<=3)&&(arr[i][j]!='X'&&arr[i][j]!='O'));
    }
    public static void display(char[][] arr){
        System.out.println(" _ _ _");
        for(int i=1;i<=3;++i){
            System.out.print("|");
            for(int j=1;j<4;++j){
                System.out.print(arr[i][j]=='\0'?" |":arr[i][j]+"|");
                //System.out.print("_");
            }
            System.out.println("\n _ _ _");
        }
    }
    public static boolean checkforvictory(char[][] arr,int i,int j,char ch){
        char ans=' ';
        for(int k=1;k<4;++k){
            if(arr[i][k]==ch){
                ans=ch;
            }
            else{
                ans=' ';
                break;
            }
        }
        if(ans==ch){return ans==ch;}
        for(int k=1;k<=3;++k) {
            if (arr[k][j] == ch) {
                ans = ch;
            } else {
                ans = ' ';
                break;
            }
        }
        if(arr[1][1]==ch&&arr[2][2]==ch&&arr[3][3]==ch){ans=ch;}
        if(arr[1][3]==ch&&arr[2][2]==ch&&arr[3][1]==ch){ans=ch;}
        return ans==ch;
    }
}
