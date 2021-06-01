import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWriter {
	static ArrayList<File> files = new ArrayList<>() ; 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean close=true; // to stop while loop of label
	boolean subClose=true;
	//String option="";
	label :
	while(close) { // welcome interface
		System.out.println("---------------Welcome --------------");
		System.out.println("Application Name : File Management");
		System.out.println("Devloper Name : Sirisha");
		System.out.println("------------------------------------");
		System.out.println("Menu details listed as below : ");
		System.out.println("1.Sort and retrieve all existing files");
		System.out.println("2.Add/Delete/search for a file");
		System.out.println("3.Exit the application");
		System.out.println("-------------------------------------");
		System.out.println("Please choose an option : ");
		int optionSelected=sc.nextInt();
		sc.nextLine();
		
		switch(optionSelected)
		{
		
		case 1:
			
				
			
			FileStreamSDEMo.getFiles(); // retrieves all files 
			
			System.out.println("Press  any key to return main menu");
			sc.nextInt();
			continue label; // returns to main menu
		
			
		case 2:
			sublabel:
			while(subClose){ // sub options for ADD/delete/search
				System.out.println("1. Add file");
				System.out.println("2. Delete file");
				System.out.println("3.Search");
				System.out.println("4.Return to main menu");
				System.out.println("Please choose an option:");
				int suboption=sc.nextInt();
				sc.nextLine();
				
			
				switch(suboption)
				{
				case 1:  // add operation
					String fileName="";
					System.out.println("Provide file name you want to add : ");
					fileName=sc.nextLine();
					Add_File.addFile(fileName);
					break;
//				case 2:  // delete file from specified path
//					String deleteFile="";
//					System.out.println("Specify the path along with file name to delete");
//					deleteFile=sc.nextLine();
//					Delete_File.deleteFile(deleteFile);
//					break;
//				case 3:  // Search for the file
//					String fileSearch="";
//					String pathForSearch="";
//					System.out.println("Enter the file name that you want to search : ");
//					fileSearch=sc.nextLine();
//					System.out.println("Enter the path in which you want to search the file : ");
//					pathForSearch=sc.nextLine();
//					Search_File.searchFile(fileSearch, pathForSearch);
//					break;
				case 4:   // return to main menu
					continue label;
				default:
					System.out.println("Invalid option selected, please select again from below menu");
					continue sublabel;
					
				}
			}
		case 3:  //exit code or terminate the cli
			System.out.println("Do you want to exit from application (Y/N) : ");
			char option=sc.next().charAt(0);
			if(option=='Y' || option=='y')
			{
				close=false;
				continue label;
			}
			continue label;
			
		 default :
			 System.out.println("Not valid, please again choose from below menu");
			 continue label;
		}
	}
	
	System.out.println("Thank you for visiting the page");
	
	
	
	
}
}
