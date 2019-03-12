public class MatrixColumn implements HeadNode {
    private ValueNode head;
    private Node nextRow;
    private Node nextCol;

    public boolean isEmpty() {
        return head == null;
    }

    public Node getNextRow() { return nextRow; }

    public void setNextRow(Node next) { nextRow = next; }

    public Node getNextCol() { return nextCol; }

    public void setNextCol(Node next) { nextCol = next; }

    public HeadNode getNext(){ return (HeadNode)nextCol; }

    public ValueNode getFirst(){ return (ValueNode)nextRow; }

    public int get(int position){ //we want to return the value at a given point, for column position will be which row its in
        //go to a specified position in the sparse matrix and return the value

        ValueNode cur = head;
        for(int i=0; i < position; i++) {
            if (cur == null) {
                //OH SHIT, THATS OUT OF THE MATRIX
                //WAT'CHU GONNA DO ABOUT IT FAGLORD
            }
            cur = (ValueNode) cur.getNextRow();
        }
        return cur.getValue();
    }

    public void insert(ValueNode value) {
        //insert a value at its specified position, because we're placing it in a predetermined column
        //I believe we place it based on the row value
        ValueNode cur = head;
        for(int i=0; i < value.getRow(); i++) {
            if (cur == null) {
                //OH SHIT, THATS OUT OF THE MATRIX
                //WAT'CHU GONNA DO ABOUT IT FAGLORD
            }
            cur = (ValueNode) cur.getNextRow();
        }
        cur.setValue(value.getValue());
    }
}
