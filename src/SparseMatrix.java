public class SparseMatrix {
    private int totalRows;
    private int totalCols;
    private HeadNode firstRow;
    private HeadNode firstCol;

    public SparseMatrix(int rows, int cols){ //sparse matrix should be working properly now, will continue testing though
        //all we're doing is making a matrix where every value is 0, we use insert later to add values
        //taking in row and col number (matrix size) to be used in the forloops below
        this.totalCols = cols;
        this.totalRows = rows;

        //create cCurrent, a variable to track the column piece by piece, it is a matrix column
        //i guess it tracks which column we are creating for
        MatrixColumn cCurrent = new MatrixColumn();
        this.firstCol = cCurrent;

        //check to make sure this loops the proper number of times
        for(int i=0;i<totalCols;i++) {
            cCurrent.setNextCol(new MatrixColumn());
            cCurrent = (MatrixColumn) cCurrent.getNextCol();
        }

        //same as above but for row instead
        MatrixRow rCurrent = new MatrixRow();
        this.firstRow = rCurrent;

        for(int i=0;i<totalRows;i++) {
            rCurrent.setNextRow(new MatrixRow());
            rCurrent = (MatrixRow) rCurrent.getNextRow();
        }
    }

    //is this finished or not?
    public void insert(int pRow, int pCol, int pVal) {
        ValueNode nodeToInsert = new ValueNode(pRow, pCol, pVal);
        //get and insert row
        HeadNode rowHead = getRow(pRow-1);
        rowHead.insert(nodeToInsert);
        //get and insert column
        HeadNode colHead = getCol(pCol-1);
        colHead.insert(nodeToInsert);
    }


    //make these return the proper values
    public HeadNode getRow(int pos) {
        HeadNode cur = firstRow;
        for(int i=0;i<pos;i++){
            cur = (HeadNode)cur.getNextRow();
        }
        return cur;
    }

    public HeadNode getCol(int pos) {
        HeadNode cur = firstCol;
        for(int i=0;i<pos;i++){
            cur = (HeadNode)cur.getNextCol();
        }
        return cur;
    }

    public int getValue(int row, int col) {
        return 9999999;
    }

    public void print() {
        HeadNode rowHead = firstRow;
        ValueNode value;
        for(int i=0;i<totalRows;i++) {
            value = rowHead.getFirst();
            for(int k=0;k<i;k++) {
                value = (ValueNode)value.getNextRow();
            }
            for (int j=0;j<totalCols;j++) {
                try {
                    System.out.print(value.getValue());
                    value = (ValueNode) value.getNextCol();
                }
                catch (NullPointerException e){
                    j=totalCols+1;
                }
            }
            System.out.println("");
        }
    }

    public SparseMatrix transpose() {
        return null;
    }

    public SparseMatrix product(SparseMatrix other) {
        return null;
    }


    private void printEmptyNodes(int x) {
        for (int i=0;i<x;i++) {
            System.out.print("0");
        }
    }

}
