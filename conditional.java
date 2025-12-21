import java.util.Scanner;
public class conditional {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        String csk = a.nextLine();
        if (csk.equals("win"))
        {
            System.out.println("csk won the match");
        }
        else
        {
            System.out.println("csk loss the match");
        }

    }
}
