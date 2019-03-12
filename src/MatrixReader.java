import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class MatrixReader {
    private int pRow = 1;

    //I had no idea how many functions were gonna be wrapped up in this one whew
    public SparseMatrix read(String pFile) {
//        File file = new File(pFile);
//        Path path = Paths.get(file);
//        //why am I getting an IOException here and how can I fix this
//        Scanner reader = new Scanner(path);
//        //currently getting an IOException when attempting to set reader to the file
//        try {
//            reader = new Scanner(path);
//        }
//        catch (IOException e) {
//            System.out.println("WHY");
//        }
        Scanner reader = new Scanner(pFile);


        String line1 = reader.nextLine();
        int numberOfRows = Integer.parseInt(line1);
        String line2 = reader.nextLine();
        int numberOfColumns = Integer.parseInt(line2);
        SparseMatrix textFile = new SparseMatrix(numberOfRows, numberOfColumns);

        while(reader.hasNext()) {
            String currentLine =  reader.nextLine();
            String[] tokens = currentLine.split(" ");
       
            for (int j = 0; j < tokens.length; j++) {
                String[] matrixValue = tokens[j].split(",");
                int pCol = Integer.parseInt(matrixValue[0]);
                int value = Integer.parseInt(matrixValue[1]);
                //call on sparse matrix's insert, which in turn calls on matrix row and cols inserts
                textFile.insert(pRow, pCol, value);

            }
            pRow = pRow + 1;
        }
        return textFile;
        }

//    public int tokensLength(){
//        return tokens.length;
//    }
    // what does tokensLength even do at the moment?
    }
