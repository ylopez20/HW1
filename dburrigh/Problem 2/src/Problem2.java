import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        String commandLine;
        Scanner scan = new Scanner(System.in);
        commandLine = scan.nextLine();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int nu;
        while(upperbound!=0)
            if (commandLine.contains("3")) {
                count3++;
            }
            if (commandLine.contains("2")) {
                count2++;
            }
            if (commandLine.contains("1")) {
                count1++;
            }
            System.out.println("groups of 3 =");
            System.out.print(count3);
        }
    }
