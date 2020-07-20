import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inp;
        Scanner scan = new Scanner(System.in);
        int otw = 0, zamyk = 0;
        inp = scan.nextLine();

        char[] toArray = inp.toCharArray();
        for (char output : toArray){
            if (output == '('){
                otw++;
                //System.out.println(otw);
            }
            else if (output == ')'){
                zamyk++;
                //System.out.println(zamyk);
            }
        }
        int out = otw - zamyk;
        System.out.println(Math.abs(out));
    }

}
