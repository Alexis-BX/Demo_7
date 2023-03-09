public class App {
    public boolean checker(BinaryTree tree){
        return checker(tree.root);
    }

    public int max(int v1, int v2){
        return v1>v2 ? v1 : v2;
    }

    public int min(int v1, int v2){
        return v1>v2 ? v2 : v1;
    }

    public int get_max(Node current){
        if (current==null)
            return -1;

        int max_right = get_max(current.right);
        int max_left  = get_max(current.left);

        return max(max(current.value, max_right), max_left);
    }

    public int get_min(Node current){
        if (current==null)
            return 2147483647; // max int in java

        int min_right = get_min(current.right);
        int min_left  = get_min(current.left);

        return min(min(current.value, min_right), min_left);
    }

    public boolean checker(Node tree){
        if (tree == null)
            return true;
            
        if (get_max(tree.left) > tree.value)
            return false;
    
        if (tree.value > get_min(tree.right))
            return false;
            
        return checker(tree.left) && checker(tree.right);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
