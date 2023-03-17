package com.knoldus.fileHandling;

import java.io.*;

public class ContentinOutputFile {

    //this class contains method that reads the data from inputfile, calculate the average and write data into output file
    public static void WriteinOutputFile(File inputfile, File outputfile,int numberofpersons) {
        try {
            FileReader fileReader = new FileReader(inputfile);
            BufferedReader readinputFile = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(outputfile);

            Integer sumofallage = 0;
            String str;
            while ((str = readinputFile.readLine()) != null) {

                String[] details = str.split(",");
                String name = details[0].trim();
                int age = Integer.parseInt(details[1].trim());

                fileWriter.write(name + "(" + age + ")\n");

                sumofallage += age;

            }
            fileWriter.write("Average age of all students: " + sumofallage / numberofpersons);
            fileWriter.close();

            System.out.println("Average age of all students:" +sumofallage / numberofpersons);

        }
        catch (FileNotFoundException e) {
            System.out.println("File doesn't exists");
        }
        catch(IOException error){
            System.out.println("IO exception occured");
        }
    }
}
