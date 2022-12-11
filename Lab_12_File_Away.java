import javax.swing.*;
import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;


public class Lab_12_File_Away

{

    public static void main(String args[])

    {

//Create a file chooser object
        final JFileChooser file_chooser = new JFileChooser();

//show  dialog to select file
        int returnVal = file_chooser.showOpenDialog(null);

//get selected file
        File file=file_chooser.getSelectedFile();

//variable to store data

        int line_count=0;
        int word_count=0;
        int character_count=0;
        String line="";

        try {

//create a scanner to read from file
            Scanner read=new Scanner(file);

//keep on reading untill the file is empty

            while(read.hasNextLine())

            {

                line=read.nextLine();

//split line by spaces

                String words[]=line.split(" ");

//update counts

                character_count=character_count+line.length();
                word_count=word_count+words.length;
                line_count=line_count+1;

            }

        } catch (FileNotFoundException e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        }

//display stats

        System.out.printf("File name: %s \n Number of Characters: %d \n Number of Words: %d \n Number of lines: %d \n",file.getName(),character_count,word_count,line_count);

    }

}