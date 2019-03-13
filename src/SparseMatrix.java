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
        return 9;
    }

    public void print() { //the good news is this prints out with the correct number of rows and columns
        //will need to make sure it can print out the correct values at the correct points once
        //insert has been properly implemented

        //lets try something else
        HeadNode rowHead = firstRow;
        ValueNode value = rowHead.getFirst();
        for(int i=0;i<totalRows;i++) {
            for (int j=0;j<totalCols;j++) {
                try {
                    System.out.print(value.getValue());
                    value = (ValueNode) value.getNextCol();
                }
                catch (NullPointerException e){
                    j=totalCols+1;
                }
            }
            value = rowHead.getFirst();
            value = (ValueNode)value.getNextRow();
            System.out.println("");
        }
    }

    public SparseMatrix transpose() {
        return null;
    }

    public SparseMatrix product(SparseMatrix other) {
        return null;
    }


}
