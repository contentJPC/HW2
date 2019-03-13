public class MatrixRow implements HeadNode {
    private ValueNode head = new ValueNode();
    private Node nextRow;
    private Node nextCol;

    public boolean isEmpty(){return head == null;}

    public Node getNextRow(){return nextRow;}

    public void setNextRow(Node next){nextRow = next;}

    public Node getNextCol() {return nextCol;}

    public void setNextCol(Node next) {nextCol = next;}

    public HeadNode getNext(){return (HeadNode) nextRow;}

    public ValueNode getFirst(){return (ValueNode) head.getNextCol();}

    public int get (int position){ //we want to return the value at a given point, for row position will be which column its in
        try {
            ValueNode cur = (ValueNode)head.getNextCol();
            boolean keepGoing = true;
            int getValue = 0;

            while (keepGoing == true){
                if (cur.getCol() == position){
                    getValue = cur.getValue();
                    keepGoing = false;
                }
                else if (cur.getCol() > position){
                    keepGoing = false;
                    getValue = 0;
                }
                else {
                    cur = (ValueNode) cur.getNextCol();
                }
            }

            return getValue;
        }
        catch (NullPointerException e) {
            return 0;
        }
    }

    public void insert(ValueNode value) {
        ValueNode cur = (ValueNode) head.getNextCol();
        ValueNode preCur;
        boolean running = true;
         if(cur == null) {
             head.setNextCol(value);
         }
         else if(cur.getCol() > value.getCol()) {
             preCur = cur;
             head.setNextCol(value);
             value.setNextCol(preCur);
         }
         else if(cur.getCol() < value.getCol()) {
             preCur = cur;
             while (running && cur.getCol() < value.getCol()) {
                 try {
                     cur = (ValueNode) cur.getNextCol();
                     if (preCur.getCol() < value.getCol() && cur.getCol() > value.getCol()){
                         preCur.setNextCol(value);
                         value.setNextCol(cur);
                     }
                     preCur = cur;
                 }
                 catch(NullPointerException e) {
                     preCur.setNextCol(value);
                     running = false;
                 }
             }
         }
         }
    }