package tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private Node root;


    public void add(int key){
        if(root == null){
            root= new Node(key);
        }else{
            Node current= root;
            traversal(current,key);
        }
    }
    public void traversal(Node current,int key){
        if(key>current.getKey()) {
            if (current.getRight()==null){
                current.setRight(new Node(key));
                return;
            }
            current=current.getRight();
        }else{
            if(current.getLeft()==null){
                current.setLeft(new Node(key));
                return;
            }
            current=current.getLeft();
        }
        traversal(current,key);
    }
    public boolean contains(int key){
        Node current = root;
        current = searchBT(current,key);
        if(current!=null)
            return true;
        else
            return false;
    }
    public  Node searchBT(Node current,int key){
        if(current==null|| current.getKey()==key)
            return current;
        if (current.getKey()>key)
            return searchBT(current.getLeft(),key);
        return searchBT(current.getRight(),key);
    }
    public Node getRoot() {
        return root;
    }
    public int getRootKey(){
        return root.getKey();
    }
    public int getLeftKey(){
        return root.getLeft().getKey();
    }
    public int getRightKey(){
        return root.getRight().getKey();
    }
    public  boolean isEmpty(){
        if (root==null)
            return true;
        else
            return false;
    }


}
