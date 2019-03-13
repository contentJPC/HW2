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

    public void print() {
        HeadNode rowHead = firstRow;
        for(int i=0;i<totalRows;i++) {
            for(int j=1;j<=totalCols;j++) {
                System.out.print(rowHead.get(j)+" ");
            }
            System.out.println("");
            rowHead = (HeadNode) rowHead.getNextRow();
        }
    }

    public SparseMatrix transpose() { //currently has issues on moving values to the correct point
        SparseMatrix transposed = new SparseMatrix(totalCols,totalRows);

        HeadNode colHead = firstCol;
        for(int i=1;i<=totalCols;i++) {
            for(int j=1;j<=totalRows;j++) {
                transposed.insert(i,j,colHead.get(j));
            }
            colHead = (HeadNode) colHead.getNextCol();
        }
        return transposed;
    }

    public SparseMatrix product(SparseMatrix other) {
        SparseMatrix production = new SparseMatrix(totalRows,other.getTotalCols());
        int sum = 0;

        HeadNode rowHead = firstRow;
        HeadNode colHead = firstCol;

//        for(int i=1;i<totalRows;i++){
//            for(int j=1;j<other.getTotalCols();j++){
//                for(int k=1;k<totalCols;k++){
//                    sum = (rowHead.get(j))*();
//                }
//                production.insert(i,j,sum);
        // would this go after the for loop with k or inside it? I don't wanna mess with it without asking you guys but just something I was wondering
//            }
//        }

        return production;
    }

    public int getTotalCols() {
        return this.totalCols;
    }

}
