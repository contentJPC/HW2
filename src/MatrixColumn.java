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
        ValueNode cur;
        if(head == null) {
            head = value;
        }
        else if(head.getRow() > value.getRow()) {
            cur = head;
            head = value;
            head.setNextRow(cur);
        }
        else if(head.getRow() < value.getRow()) {
            cur = head;
            boolean running = true;
            while (running) {
                cur = (ValueNode) cur.getNextRow();
                insert(value);
            }
        }
    }
}
