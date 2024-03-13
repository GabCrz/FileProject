import java.io.File;
import java.io.IOException;
import java.util.Scanner;;
public class FileIoProject {
    public static void main(String[] args) throws IOException  {
    createFile();
    }



private static void createFile() { 
        ///* input for filename
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter file name: ");
    String fileName = scan.next();

    //* creating file via input and checking if file was created 
try { 
        fileName = fileName + ".txt";
        File file = new File(fileName);
        boolean isFileCreated = file.createNewFile();

    // * checking to see if the file was properly created 
        if(isFileCreated) { 
            System.out.println(fileName + " file created!"); 
        }
        else { 
            System.out.println("File already exist");
        }
      //  readFile(fileName);
    }


// TODO: Write the exception description 
catch(IOException e) 
    { 
        System.out.println("An error occured");
    }


    }
}
/*private static String readFile(String file){ 
        Scanner Reader = new Scanner(file);
        while (Reader.hasNextLine()) {
            String data = Reader.nextLine();
        return data;
        }
    }
} */



