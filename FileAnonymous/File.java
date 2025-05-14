import java.io.*;

public class File {
    public static void main(String[] args){

        /*
         * FileWriter = Good for small medium file
         * BufferedWriter - Better performance for large amount of text
         * PrintWriter - Best for structured Dta, like reports and log
         * FileOutputStream = Best for binary files(images, audio files)
         */

//File writer
        try(FileWriter writer = new FileWriter("text.txt");){
            writer.write("This is my first java file writer application");
            System.out.println("File has been written");

        }
        catch (FileNotFoundException e){
            System.out.println("File location not found");
        }
        catch (IOException e){
            System.out.println("couldn't write file");
        }

//        you can determine the location your file will be written
        // new FileWriter("C:\\Users\\Hp\\Desktop\\text.txt")
        // you can also save your file path as a variable and also the message you are passing to write
/*
how to write a multi line string

String textContent = """
Roses are Red
Violets are Blue
Rocking Rocking Rocking
"""
 */


//Reading a file with java
        /*
        you can use three option
        Buffered Reader + FileReader : Best for reading text files line by lin
        FileImputStream : Best for binary files(images/ audio file)
        RandomAccessFile: Best for read/write specific portions of a large file
                 */

String filePath = "C:\\Users\\HP\\Desktop\\try.txt";

try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

    String line;
  while ((line = reader.readLine()) != null) {
       System.out.println(line);
       System.out.println("This file exists");
  }
}
catch(FileNotFoundException e){
    System.out.println("File not found");

}
catch (IOException e){
    System.out.println("Could not read file");
}
    }

}
