package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

    int max=0;
    public void inOrderTraverse(Node node) {
        if (node != null) {
            inOrderTraverse(node.getLeft()); // traverse left sub tree
            if(node.getKey()>max){max=node.getKey(); }
            inOrderTraverse(node.getRight()); // traverse right sub tree
        }
    }
    public int maxValue(){
        Node current=root;
        if(root!=null){
            inOrderTraverse(current);
        }
        return max;
    }

    public void postOrderTraverse(Node node) {
        if (node != null) {
            postOrderTraverse(node.getLeft()); // traverse left sub tree
            postOrderTraverse(node.getRight()); // traverse right sub tree
            System.out.print(" " + node.getKey()); // root
        }
    }


    public void preOrderTraverse(Node node) {
        if (node != null) {
            System.out.print(" " + node.getKey()); // root
            preOrderTraverse(node.getLeft()); // traverse left sub tree
            preOrderTraverse(node.getRight()); // traverse right sub tree
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void breadthFirst(BinaryTree tree){
        ArrayList<Integer> newList = new ArrayList();

    newList.add(tree.root.getKey());
//    breadthFirst(tree.root.getLeft())

    }



}
