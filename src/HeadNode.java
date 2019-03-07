public interface HeadNode extends Node {
    HeadNode getNext();
    ValueNode getFirst();
    void insert(ValueNode pValue);
    int get(int pPosition);
}
