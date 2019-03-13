public class Homework2 {
    public void run() {
        System.out.println("hi");

        //    SparseMatrix test = new SparseMatrix(0,0);
//    test.print();
//    use this to test if print will work normally and stuff


        matrixReaderTest test = new matrixReaderTest();
        test.matrixReader();

        //gonna write up some pseudo code that we can fill out as time goes on

        /////////////////////MatrixReader fileReader = new MatrixReader();

        ////////////////SparseMatrix matrixA = fileReader.read("matrixFiles/matrixA.txt");
        //read file matrixA and build the matrix
        //first we read the file, initializing the matrix for its number of rows and columns
        //then we go through one by one as we read through the file and place values at their correct positions
        //that should all happen through file reader calling on sparse matrix which in turn calls on matrix row and column I think


        //print matrixA
        //matrixA.print(); currently does not work because matrix A does not become a proper Sparse Matrix I believe
        //it also just isn't written to print out the matrix and such

        //read matrixB and build
        //////////////////SparseMatrix matrixB = fileReader.read("File for matrix B");
        //print matrixB

        //transpose A and print

        //transpose B and print

        //product of A and B
        //print it
    }


}
