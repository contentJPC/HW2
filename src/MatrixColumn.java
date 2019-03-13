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

    public int get(int position){
        try {
            ValueNode cur = (ValueNode)head.getNextRow();
            boolean keepGoing = true;
            int getValue = 0;

            while (keepGoing == true){
                if (cur.getRow() == position){
                    getValue = cur.getValue();
                    keepGoing = false;
                }
                else if (cur.getRow() > position){
                    keepGoing = false;
                    getValue = 0;
                }
                else {
                    cur = (ValueNode) cur.getNextRow();
                }
            }

            return getValue;
        }
        catch (NullPointerException e) {
            return 0;
        }
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