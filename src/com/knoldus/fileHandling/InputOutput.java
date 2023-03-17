package com.knoldus.fileHandling;

import java.io.*;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args)  {
        File inputFile=null;
        File outputFile=null;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the name of the input file : ");

             inputFile= new File(input.next());
            System.out.println("File created : " + inputFile.getName());

            System.out.println("Enter the name of the output file : ");
             outputFile= new File(input.next());

            // if output file already exists either overwrite the file or create a new file as per user response.
            while (outputFile.exists()) {
                System.out.println("File already exits!! Do you want to overwrite the file?(1 or 0)");
                int permit = input.nextInt();

                if (permit == 1) {
                    outputFile.createNewFile();
                    break;
                } else if (permit == 0) {
                    System.out.println("File not overridden!! please enter a different name");
                    String file = input.next();
                    outputFile = new File(file);
                }
            }
            System.out.println("File created : " + outputFile.getName());

        }
        catch(IOException error){
            System.out.println("IO exception occured!!");
        }
        System.out.println("Enter the number of persons for which you want to enter the data");
        int numberofpersons = input.nextInt();

        ContentinInputFile.writeContentinInputFile(inputFile, numberofpersons); // writing content in inputfile
        ContentinOutputFile.WriteinOutputFile(inputFile, outputFile, numberofpersons); //writing content in outputfile
    }
}
