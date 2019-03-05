public interface HeadNode {
    HeadNode getNext();
    ValueNode getFirst();
    void insert(ValueNode pValue);
    int get(int pPosition);
}
