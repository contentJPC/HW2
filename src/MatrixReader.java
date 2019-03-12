import java.util.Scanner;

public class MatrixReader {
    private int pRow = 1;
    public SparseMatrix read(String pFile) {
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
