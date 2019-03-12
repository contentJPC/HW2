public class MatrixRow implements HeadNode {
    private ValueNode head;
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



    //why on earth is this insert completely and utterly different, I'll need to go and check
    //which one of these has the more correct structure for what we need done

    //I cannot believe what I'm seeing, the completely different code was because get and insert were flip flopped
    //and someone copied and pasted based on the function order and not the function name
    //why were they even out of order in the first place
    //this is some ridiculous shit

     public void insert(ValueNode value) {
         //insert a value at its specified position, because we're placing it in a predetermined column
         //I believe we place it based on the row value
         head.setRow(value.getRow());
         ValueNode cur = head; //the problem here is head is currently null and we need to make it not null for this shit to work
         for(int i=0; i < value.getCol(); i++) {
             if (cur == null) {
                 //OH SHIT, THATS OUT OF THE MATRIX
                 //WAT'CHU GONNA DO ABOUT IT FAGLORD
             }
             cur = (ValueNode) cur.getNextCol();
         }
         cur.setValue(value.getValue());





        //commenting out all of this because it seems superfluous and I currently think the other version is what will be needed
         //im leaving this here for posterity and because maybe it might prove useful, probably not but I've been wrong before
//        MatrixReader matrixReader = new MatrixReader();
//        //need variable for total values
//        ValueNode node = new ValueNode(value);
//        if (isEmpty()) {
//            node = head;
//        }
//        else if (!isEmpty()) {
//            for (int i = 0; i < totalValues; i++ ) {
//
//                //insert before first node
//                if () {
//                    IntegerNode node = new IntegerNode(value);
//                    node.setNext(head);
//                    head = node;
//                }
//
//                else () {
//                    ValueNode node = new ValueNode(value);
//
//                    if(isEmpty()) {
//                        head = node;
//                    }
//                }
//            }
//        }
    }
}