
// ==============    File Handeling   ===================//

/*
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
*/

public class Assignment_19 {


    // create a file 
    /* 
    public static void main(String[] args) {
        File myfile = new File("Assignment_19.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create file");
            System.out.println(e);
            e.getStackTrace();
        }

        if(myfile.exists())
        {
            System.out.println("The file is exixr !");
            System.out.println(myfile.getPath());
            System.out.println(myfile.getAbsolutePath());
            System.out.println(myfile.isFile());
        }
    }*/


    // Write in file
    /*
    public static void main(String[] args) {
        try {
            FileWriter fmWriter = new FileWriter("Assignment_19.txt");
            fmWriter.write("this i an first file from the file concepts");
            fmWriter.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }*/


    // Reading from file
/* 
    public static void main(String[] args) {
        // try {
        //     FileReader rd1 = new FileReader("Assignment_19.txt");
        //     int data = rd1.read();
        //     while (data != -1) {
        //         System.out.print((char)data);
        //         data = rd1.read();
        //     }
        // } catch (IOException e) {
        //     e.getStackTrace();
        // }


        // Second option for reading
        File rd2 = new File("Assignment_19.txt");
        try {
            Scanner sc = new Scanner(rd2);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.print(line);
            }
            rd2.getClass();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }*/





// Deleate file 
/* 
public static void main(String[] args) {
    File dFile = new File("Assignment_19.txt");
    if(dFile.delete())
    {
        System.out.println("I have detete: "+ dFile.getName());
    }
    else{
        System.out.println("Some Problem is occor");
    }
}*/





}



