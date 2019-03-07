public class MatrixColumn {
    private Node nextRow;
    private Node nextCol;
    
    public Node getNextRow() { return nextRow; }

    public void setNextRow(Node next) { nextRow = next; }

    public Node getNextCol() { return nextCol; }

    public void setNextCol(Node next) { nextCol = next; }

    public HeadNode getNext(){ return (HeadNode)nextCol; }

    public ValueNode getFirst(){ return (ValueNode)nextRow; }
    
    void insert(ValueNode value);
    
    int get(int position){
        return 0;
    }
}
