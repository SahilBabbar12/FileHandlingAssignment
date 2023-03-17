package com.knoldus.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContentinInputFile {
    // this class contains method that takes name and age from user and write in inputfile
    public static  void writeContentinInputFile(File inputFile,int numberofpersons){
        Scanner input = new Scanner(System.in);
        int count=1;
        try {
            FileWriter fileWriter = new FileWriter(inputFile);
            while (count <=numberofpersons) {
                System.out.println("Enter the name of person "+count);
                String name = input.next();
                System.out.println("Enter the age");
                int age = input.nextInt();
                fileWriter.write(name +", "+age+"\n");
                count++;
            }
            fileWriter.close();
        }catch(IOException error){
            System.out.println("IO exception occured");
        }
    }

}
