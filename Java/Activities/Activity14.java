package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.logging.FileHandler;

public class Activity14 {
    public static void main(String[] args) {
        try {
            File file = new File("src/session4/newfile.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }


            File fileUtil = FileUtils.getFile("src/session4/newfile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            File dir = new File("resources");
            FileUtils.copyFileToDirectory(file, dir);

            File newfile = new File(dir,"newFile.txt");
            String fileData = FileUtils.readFileToString(newfile, "UTF8");
            System.out.println("Data in new file : " + fileData);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
