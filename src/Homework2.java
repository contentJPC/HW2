public class Homework2 {
    public void run() {
        System.out.println("hi");
    }

//    SparseMatrix test = new SparseMatrix(0,0);
//    test.print();
//    use this to test if print will work normally and stuff



    //gonna write up some pseudo code that we can fill out as time goes on

    MatrixReader fileReader = new MatrixReader();

    //read file matrixA and build the matrix
    SparseMatrix matrixA = fileReader.read("File for matrix A");
    //print matrixA
    //matrixA.print(); currently does not work because matrix A does not become a proper Sparse Matrix I believe

    //read matrixB and build
    SparseMatrix matrixB = fileReader.read("File for matrix B");
    //print matrixB

    //transpose A and print

    //transpose B and print

    //product of A and B
    //print it
}
