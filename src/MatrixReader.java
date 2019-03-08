import java.util.Scanner;

public class MatrixReader {
    public SparseMatrix read(String pFile) {
        int pRow = 0;
        Scanner reader = new Scanner(pFile);
        String line1 = reader.nextLine();
        int numberOfRows = Integer.parseInt(line1);
        String line2 = reader.nextLine();
        int numberOfColumns = Integer.parseInt(line2);
        SparseMatrix textFile = new SparseMatrix(numberOfRows, numberOfColumns);

        while(reader.hasNext()) {
            String currentLine =  reader.nextLine();
            String[] tokens = currentLine.split(" ");
            pRow = pRow + 1;
            for (int j = 0; j < tokens.length; j++) {
                String[] matrixValue = tokens[j].split(",");
                int pCol = Integer.parseInt(matrixValue[0]);
                int value = Integer.parseInt(matrixValue[1]);
                textFile.insert(pRow, pCol, value);

            }
        }
        return textFile;

    }
}
