import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

    //is the insert method here supposed to be the same as the one in MatrixRow?
    void insert(ValueNode value) {
        MatrixReader matrixReader = new MatrixReader();
        int totalValues = matrixReader.getTotalValues();
        //ValueNode doesn't take in any variables and the variable 'value' is not created anywhere
        ValueNode node = new ValueNode(value);
        if (isEmpty()) {
            node = head;
        }
        else if (!isEmpty()) {
            for (int i = 0; i < totalValues; i++ ) {

                //insert before first node
                if () {
                    ValueNode node = new ValueNode(value);
                    node.setNextColumn(head);
                    head = node;
                } else {
                    ValueNode node = new ValueNode(value);

                    if(isEmpty()) {
                        head = node;
                    }
                }
    }

    //is the get method here supposed to be the same as the on in MatrixRow?
    int get(int position){
      ValueNode cur = head;
                for(int i=0; i < index; i++) {
                    if (cur == null) {
                        throw new NotImplementedException();
                    }
                    //'getNext' is only set in the class ValueNode
                    //so if you want to use it you have to implement ValueNode before hand
                    cur = cur.getNext();
                }
                return cur.getValue();
            }
        }
    }
}