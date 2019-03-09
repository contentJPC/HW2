public class MatrixRow implements HeadNode {
    private Node nextRow;
    private Node nextCol;

    public boolean isEmpty() {
        return getFirst() == null;
    }

    public Node getNextRow() {
        return nextRow;
    }

    public void setNextRow(Node next) {
        nextRow = next;
    }

    public Node getNextCol() {
        return nextCol;
    }

    public void setNextCol(Node next) {
        nextCol = next;
    }

    public HeadNode getNext() {
        return (HeadNode) nextRow;
    }

    public ValueNode getFirst() {
        return (ValueNode) nextCol;
    }

    int get ( int position){
        return 0;
    }

    void insert(ValueNode value) {
        MatrixReader matrixReader = new MatrixReader();
        int temp = 0;
        if (isEmpty()) {
            //set first node to value;
        }
        else if (!isEmpty()) {
            while ( amount of values to process isnt empty ) {
                if (before) {

                }

                else (after) {

                }
            }
        }
    }
}