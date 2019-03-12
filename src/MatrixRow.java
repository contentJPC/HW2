public class MatrixRow implements HeadNode {
    private ValueNode head;
    private Node nextRow;
    private Node nextCol;

    public boolean isEmpty(){return head == null;}

    public Node getNextRow(){return nextRow;}

    public void setNextRow(Node next){nextRow = next;}

    public Node getNextCol() {return nextCol;}

    public void setNextCol(Node next) {nextCol = next;}

    public HeadNode getNext(){return (HeadNode) nextRow;}

    public ValueNode getFirst(){return (ValueNode) nextCol;}

    public int get (int position){ //we want to return the value at a given point, for row position will be which column its in
        ValueNode cur = head;
        for(int i=0; i < position; i++) {
            if (cur == null) {
                //OH SHIT, THATS OUT OF THE MATRIX
                //WAT'CHU GONNA DO ABOUT IT FAGLORD
            }
            cur = (ValueNode) cur.getNextCol();
        }
        return cur.getValue();
    }

    public void insert(ValueNode value) {
        ValueNode cur;
         if(head == null) {
             head = value;
         }
         else if(head.getCol() > value.getCol()) {
             cur = head;
             head = value;
             head.setNextCol(cur);
         }
         else if(head.getCol() < value.getCol()) {
             cur = head;
             boolean running = true;
             while (running) {
                 cur = (ValueNode) cur.getNextCol();
                 insert(value);
                 }
             }
         }
    }