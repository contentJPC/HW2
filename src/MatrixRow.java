public class MatrixRow implements HeadNode {
    private Node nextRow;
    private Node nextCol;
    
    public Node getNextRow() { return nextRow; }

    public void setNextRow(Node next) { nextRow = next; }

    public Node getNextCol() { return nextCol; }

    public void setNextCol(Node next) { nextCol = next; }

    public HeadNode getNext(){ return (HeadNode)nextRow; }

    public ValueNode getFirst(){ return (ValueNode)nextCol; }
    
    void insert(ValueNode value);
    
    int get(int position){
        return 0;
    }
}
