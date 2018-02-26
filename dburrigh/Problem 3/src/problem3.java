import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstNames = {"dallas", "bob", "j"};
        String[] lastNames = {"burright", "johnson","life"};
        int i;
        for (i = 0; i < firstNames.length; i++) {
            System.out.print((firstNames[i].charAt(0)));
            int j = 0;
            int Letter = 0;
            int count = 1;
            while (j < Math.min(firstNames[i].length() - 1, lastNames[i].length()) && firstNames[i].charAt(j + 1) < lastNames[i].charAt(0)) {
                System.out.print(firstNames[i].charAt(j + 1));
                j++;
                count++;
            }
            if(count + lastNames[i].length()<8) {
                System.out.print(lastNames[i]);
            }else{

            while (Letter < 7 - count) {
                System.out.print(lastNames[i].charAt(Letter));
                Letter++;
            }
                System.out.print(lastNames[i].charAt(Letter) + "\n");
                Letter++;
            }
        }
    }
}
