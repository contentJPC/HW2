import java.io.*;
import java.util.*;

public class matrixReaderTest {
    public void matrixReader() {
        String directory = "/home/cormiej/Downloads/matrixA.txt";
        MatrixReader matrixReader = new MatrixReader();
        SparseMatrix sparse = matrixReader.read(directory);
        sparse.print();
    }
}
