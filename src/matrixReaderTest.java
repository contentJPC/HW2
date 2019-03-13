import java.io.*;
import java.util.*;

public class matrixReaderTest {
    public void matrixReader() {
        String directory = "C:\\Users\\Micha\\IdeaProjects\\Homework 2\\matrixFiles\\matrixA.txt";
        MatrixReader matrixReader = new MatrixReader();
        matrixReader.read(directory);
    }
}
