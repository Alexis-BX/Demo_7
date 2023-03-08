public class BinaryTree {
    Node root;

    BinaryTree(int value){
        root = new Node(value);
    }

    public void add(int value){
        root.add_element(value);
    }

    public int biggest(){
        Node biggest = root;

        while(biggest.right != null)
            biggest = biggest.right;

        return biggest.value;
    }

    public int search(int value){
        Node current = root;
        int height = 0;

        while(current != null){
            if (current.value == value)
                return height;
            else if (current.value < value)
                current = current.right;
                else
                current = current.left;
            height++;
        }

        return -1;
    }
}
