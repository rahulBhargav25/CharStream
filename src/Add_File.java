import java.io.File;
import java.io.IOException;

public class Add_File {
	
	public static void addFile(String pathAndFile)
	{
		File file=new File(pathAndFile);
		FileWriter.files.add(file);
		
		try {
			if(file.createNewFile())
			{
				boolean a = FileWriter.files.add(file);
				System.out.println("Created successfully");
			}
			else
			{
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("Problem encounterd please try again with correct details");
			e.printStackTrace();
		}
	}
  
}
