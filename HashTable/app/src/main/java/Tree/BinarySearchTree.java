package Tree;


public class BinarySearchTree<T> {
    private Node<T> root;

    public void add(int key) {
        if (root == null) {
            root = new Node<T>(key);
        } else {
            Node<T> current = root;
            traversal(current, key);
        }
    }

    public void traversal(Node<T> current, int key) {
        if (key > current.getKey()) {
            if (current.getRight() == null) {
                current.setRight(new Node<T>(key));
                return;
            }
            current = current.getRight();
        } else {
            if (current.getLeft() == null) {
                current.setLeft(new Node<T>(key));
                return;
            }
            current = current.getLeft();
        }
        traversal(current, key);
    }

    public boolean contains(int key) {
        Node<T> current = root;
        current = searchBT(current, key);
        if (current != null)
            return true;
        else
            return false;
    }

    public Node<T> searchBT(Node<T> current, int key) {
        if (current == null || current.getKey() == key)
            return current;
        if (current.getKey() > key)
            return searchBT(current.getLeft(), key);
        return searchBT(current.getRight(), key);
    }

    public Node<T> getRoot() {
        return root;
    }

    public int getRootKey() {
        return root.getKey();
    }

    public int getLeftKey() {
        return root.getLeft().getKey();
    }

    public int getRightKey() {
        return root.getRight().getKey();
    }

    public boolean isEmpty() {
        if (root == null)
            return true;
        else
            return false;
    }

//    int odd_sum(node *root){
//        if (root == NULL) {
//            return 0;
//        }
//        else {
//            int add = 0;
//            if(root->info % 2 != 0)  add = root->info;
//            return add + odd_sum(root->left) + odd_sum(root->right);
//        }
//    }

    public int addOdd(Node<T> root,int sum) {
        if (root == null) {
            return sum + 0;
        } else
        if (root.getKey() % 2 != 0)
            sum = sum + root.getKey()+addOdd(root.getLeft(),sum)  + addOdd(root.getRight(),sum);
        else
        if(root.getRight() != null || root.getLeft()!=null)
            return addOdd(root.getRight(),sum)+addOdd(root.getLeft(),sum);
        return sum;

    }


}