/*Alex Kerr told me about the .contain command and I used it */
/*
2014_Mud-run_for_fun.xml
Spartan_run_in_the_Mud.doc
Boston-Marathon_2019
Bun_Run_In_The_Sun.pdf
*/
package probleOne;
import java.util.Arrays;
import java.util.Scanner;

public class Filesharing {
	public static void main(String[]args){
		
		Scanner numFiles = new Scanner(System.in); //input number of files
	    System.out.println("Enter number of files: ");
	    int num = numFiles.nextInt();    
	    //int count=0;
		Scanner fiLe = new Scanner(System.in);  // input file names
		//String[] userFile = new String[num]; Array for files
		for (int i=0; i<num/*userFile.length*/; i++){	
			System.out.println("Enter File Name:   ");
			String file = fiLe.next();
			int count =0;
			if (file.contains("BunRun")){
				count = count+1;
				//System.out.println(count); Used for troubleshooting			
				}
			if(file.contains("Zombie")){
				count =count +1;
				//System.out.println(count); Used for troubleshooting			
				}
			if (file.contains("Boston")){
				count =count +1;
				//System.out.println(count); Used for troubleshooting			
				}
			if (file.contains("Spartan")){
				count =count +1;
				//System.out.println(count); Used for troubleshooting			
				}
			if (file.contains("Mud")){
				count =count +1;
				//System.out.println(count); Used for troubleshooting			
				}
			if (count==1){
				System.out.println(file);
			}
			else if (count>1){
				System.out.println(file);
				//System.out.println(count); Used for troubleshooting
			}
			/*else{
				System.out.println("N/A");

			}  */ /*Used to troubleshoot problem with for loop got help from Professor Ifland*/ 
			//userFile[i] =fiLe.next();
			//System.out.println(userFile[i]);
		}
		/*String[] foundFile = new String[10];
		String[] keYword = new String[] {"BunRun","Zombie","Boston","Spartan","Mud" };
		for (int i=0; i<num;i++){			//for loop which purpose is compare file  with trigger word and pushes copies wanted file into array called foundFile
			for(int j=0;j<keYword.length;j++){
				if (userFile[i].contains(keYword[j])){
					
				}
				//foundFile.add(userFile[i]);
			//System.out.println((userFile[i].contains(keYword[0]))); 
			 
			
			}
		}
		for (int k=0; k<foundFile.length; k++){			//Prints out files that found
			System.out.println(foundFile[k]);
		}*/
		
		
		
	}
}


	

