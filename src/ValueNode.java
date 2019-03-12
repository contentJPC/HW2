public class ValueNode implements Node {
    private int row;
    private int col;
    private int value;
    private Node nextRow;
    private Node nextCol;

    public ValueNode() {}

    public ValueNode(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public int getValue(){ return value; }

    public void setValue(int value){ this.value = value; }

    public int getCol(){ return col; }

    public void setCol(int col){ this.col = col; }

    public int getRow(){ return row; }

    public void setRow(){ this.row = row; }

    public Node getNextRow(){ return nextRow; }

    public void setNextRow(Node next){ nextRow = next; }

    public Node getNextCol(){ return nextCol; }

    public void setNextCol(Node next){ nextCol = next; }
}
