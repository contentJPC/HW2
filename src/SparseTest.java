/**
 * Created by cormiej on 3/7/19.
 */
//very quick test
public class SparseTest {
    public void testA() {
        int numRows = 4;
        int numCols = 6;
        SparseMatrix matrixA = new SparseMatrix(numRows,numCols);
        matrixA.insert(1,1,8);
        matrixA.insert(1,6,60);
        matrixA.insert(1,2,5);
        matrixA.insert(2,2,33);
        matrixA.insert(2,4,36);
        matrixA.print();
        }
    }
