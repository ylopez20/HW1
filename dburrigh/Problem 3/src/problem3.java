import java.util.Scanner;

public class problem3 {

    public static void main(String[] args)throws Exception {
        Scanner scan = new Scanner(System.in);
        String [] firstNames = {"Dallas","Bob"};
        String [] lastNames = {"Burright","Johnson"};
        int i =0;

        do {
            System.out.println(i.toLowerCase(firstNames));
            i++;
        }
        while(i<7; i++){

            if(firstNames[i]<lastNames[i-i]){
                System.out.println(i.toLowerCase(firstNames));}
                else{
                System.out.print(i.toLowerCase(lastNames));}
            }
        }
    }