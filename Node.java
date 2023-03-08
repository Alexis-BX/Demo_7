class Node {
    protected int value;
    protected Node left;
    protected Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public void add_element(int value){
        if (value == this.value)
            return;
        
        else if (value < this.value){
            if (left == null){
                left = new Node(value);
            }
            else {
                left.add_element(value);
            }
        }
        else {
            if (right == null){
                right = new Node(value);
            }
            else {
                right.add_element(value);
            }
        }
    }
}
