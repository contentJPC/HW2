import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

    public int get (int position){
        ValueNode cur = head;
        for(int i=0; i < index; i++) {
            if (cur == null) {
                throw new NotImplementedException();
            }
            cur = cur.getNext();
        }
        return cur.getValue();
    }

     public void insert(ValueNode value) {
        MatrixReader matrixReader = new MatrixReader();
        //need variable for total values
        ValueNode node = new ValueNode(value);
        if (isEmpty()) {
            node = head;
        }
        else if (!isEmpty()) {
            for (int i = 0; i < totalValues; i++ ) {

                //insert before first node
                if () {
                    IntegerNode node = new IntegerNode(value);
                    node.setNext(head);
                    head = node;
                }

                else () {
                    ValueNode node = new ValueNode(value);

                    if(isEmpty()) {
                        head = node;
                    }
                }
            }
        }
    }
}