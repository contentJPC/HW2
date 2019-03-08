public class SparseMatrix {
    private int totalRows;
    private int totalCols;
    private HeadNode firstRow;
    private HeadNode firstCol;

    public SparseMatrix(int rows, int cols){
        //all we're doing is making a matrix where every value is 0, we use insert later to add values
        //taking in row and col number to be use in the forloops below
        this.totalCols = cols;
        this.totalRows = rows;

        //create cCurrent, a variable to track the column piece by piece, it is a matrix column
        //i guess it tracks which column we are creating for
        MatrixColumn cCurrent = new MatrixColumn();
        this.firstCol = cCurrent;

        //check to make sure this loops the proper number of times
        for(int i=0;i<totalCols;i++) {
            cCurrent.setNextCol(new MatrixColumn());
            cCurrent = cCurrent.getNextCol(); //written as its shown in the guide, but type mismatch
            //is there an implementation of something not being used?
        }

        //same as above but for row instead
        MatrixRow rCurrent = new MatrixRow();
        this.firstRow = rCurrent;

        for(int i=0;i<totalRows;i++) {
            rCurrent.setNextCol(new MatrixRow());
            rCurrent = rCurrent.getNextRow(); //gaaah same issue as above
        }

    }

    public void insert(int pRow, int pCol, int pVal) {
        ValueNode nodeToInsert = new ValueNode(pRow, pCol, pVal);
        //get and insert row
        HeadNode rowHead = getRow(pRow);
        rowHead.insert(nodeToInsert);
        //get and insert column
        HeadNode colHead = getCol(pCol);
        colHead.insert(nodeToInsert);
    }

    public HeadNode getRow(int pos) {
        return null;
    }

    public HeadNode getCol(int pos) {
        return null;
    }

    public int getValue(int row, int col) {
        return 0;
    }

    public void print() {

    }

    public SparseMatrix transpose() {
        return null;
    }

    public SparseMatrix product(SparseMatrix other) {
        return null;
    }


}
