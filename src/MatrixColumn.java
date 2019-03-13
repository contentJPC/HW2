public class MatrixColumn implements HeadNode {
    private ValueNode head = new ValueNode();
    private Node nextRow;
    private Node nextCol;

    public boolean isEmpty(){return head == null;}

    public Node getNextRow() { return nextRow; }

    public void setNextRow(Node next) { nextRow = next; }

    public Node getNextCol() { return nextCol; }

    public void setNextCol(Node next) { nextCol = next; }

    public HeadNode getNext(){ return (HeadNode)nextCol; }

    public ValueNode getFirst(){ return (ValueNode) head.getNextRow(); }

    public int get(int position){ //we want to return the value at a given point, for column position will be which row its in
        //go to a specified position in the sparse matrix and return the value

        ValueNode cur = head;
        for(int i=0; i < position; i++) {
            if (cur == null) {
                //OH SHIT, THATS OUT OF THE MATRIX
            }
            cur = (ValueNode) cur.getNextRow();
        }
        return cur.getValue();
    }

    public void insert(ValueNode value) {
        ValueNode cur = (ValueNode) head.getNextRow();
        ValueNode preCur;
        boolean running = true;
        if(cur == null) {
            head.setNextRow(value);
        }
        else if(cur.getRow() > value.getRow()) {
            preCur = cur;
            head.setNextRow(value);
            value.setNextRow(preCur);
        }
        else if(cur.getRow() < value.getRow()) {
            preCur = cur;
            while (running && cur.getRow() < value.getRow()) {
                try {
                    cur = (ValueNode) cur.getNextRow();
                    if (preCur.getRow() < value.getRow() && cur.getRow() > value.getRow()){
                        preCur.setNextRow(value);
                        value.setNextRow(cur);
                    }
                    preCur = cur;
                }
                catch(NullPointerException e) {
                    preCur.setNextRow(value);
                    running = false;
                }
            }
        }
    }
    }