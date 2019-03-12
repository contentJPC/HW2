import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MatrixRow implements HeadNode {
    //I set the head 'Node' here because it isn't created anywhere else
    //Should it be a 'Node' or a ValueNode?
    private Node head;
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

    int get (int position){
        ValueNode cur = head;
        for(int i=0; i < index; i++) {
            if (cur == null) {
                throw new NotImplementedException();
            }
            cur = cur.getNext();
        }
        return cur.getValue();
    }

    void insert(int value) {
        //retrieves the total amount of values from the MatrixReader class and sets it to a useable variable
        MatrixReader matrixReader = new MatrixReader();
        int totalValues = matrixReader.getTotalValues();
        //still need to find a way to create a variable node to check against the 'head' node
        ValueNode node = new ValueNode();

        if (isEmpty()) {
            check = head;
        }
        else if (!isEmpty()) {
            for (int i = 0; i < totalValues; i++ ) {

                //insert before first node
                if () {
                    ValueNode node = new ValueNode(value);
                    node.setNextRow(head);
                    head = node;
                } else {
                    ValueNode node = new ValueNode(value);

                    if(isEmpty()) {
                        head = node;
                    }
                }
            }
        }
    }
}
