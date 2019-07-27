import java.io.*;
import java.util.Scanner;

public class TextJava {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        FileReader reader;
        Scanner fileIntput;
        PrintWriter fileOutput;
        String nameLists [] = new String [30], 
        name, strLine, nameOfInputFile, nameOfOutputFile;

        int matchesCount = 0, inches;

        System.out.print("Name of the input file: ");
        nameOfInputFile = keyboard.next();
        System.out.print("Name of the output file: ");
        nameOfOutputFile = keyboard.next();

        try{
            reader = new FileReader(nameOfInputFile);
            fileIntput = new Scanner (reader);

            while (fileIntput.hasNextLine()) {
                strLine = fileIntput.nextLine();
                name = strLine;
                strLine = fileIntput.nextLine();
                inches = Integer.valueOf(strLine);
                
                if (inches <= 62) {
                    nameLists[matchesCount] = name;
                    matchesCount += 1;
                }
            }
            fileIntput.close();
        }catch(IOException e) {
            System.out.println("File error " + e);
        }
        try {
            fileOutput = new PrintWriter(nameOfOutputFile);
            for (int i = matchesCount - 1; i >= 0; i++) {
                System.out.println(nameLists[i]);
                fileOutput.println(nameLists[i]);
            }
            fileOutput.close();
        }catch(IOException e) {
            System.out.println("File error " + e);
        }
    }
}
