import java.util.*;
import java.io.*;

public class MatrixReader {
    //creating counters to return the number or rows and length of the file
    private int pRow = 1;
    private int arrayLength;
    public SparseMatrix textFile;

    public SparseMatrix read(String pFile) {
        try {
            //File pFile = new File("C:\\Users\\Micha\\IdeaProjects\\Homework 2\\matrixFiles\\matrixA.txt");
            Scanner reader = new Scanner(new File(pFile));
            //reads the first line of the file and sets the amount of rows to a variable named numberOfRows
            String line1 = reader.nextLine();
            int numberOfRows = Integer.parseInt(line1);
            //reads the second line fo the file and sets the amount of columns to a variable named numberOfColumns
            String line2 = reader.nextLine();
            int numberOfColumns = Integer.parseInt(line2);
            //allows the information from line1 and line2 to be accessed by SparseMatrix
            textFile = new SparseMatrix(numberOfRows, numberOfColumns);


            //a while loop to run until the file is empty
            while (reader.hasNext()) {
                //creates an array named 'tokens' to split the currentLine into an array then separates each cell by the spaces in the file
                String currentLine = reader.nextLine();
                String[] tokens = currentLine.split(" ");
                //counter to set the total amount of values in the file
                arrayLength = tokens.length + arrayLength;

                //a for loop to run through the new created array 'tokens'
                for (int j = 0; j < tokens.length; j++) {
                    //creates a new array that separates the cell values by ','
                    //then sets the column number to the number in cell [0]
                    //then sets the value to the number in cell [1]
                    String[] matrixValue = tokens[j].split(",");
                    int pCol = Integer.parseInt(matrixValue[0]);
                    int value = Integer.parseInt(matrixValue[1]);
                    textFile.insert(pRow, pCol, value);

                }
                pRow = pRow + 1;
            }
            return textFile;
        }

        catch (java.io.FileNotFoundException e) {
            System.out.println("another fucking error yay<3");
            return null;
        }

        //return textFile;
    }
}