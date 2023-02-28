package BST;

import java.util.ArrayList;


public class Bstjava {

    // creating a node
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    // inserting into tress
    public static Node insert(Node root,int val){   
        if(root == null){
            root = new Node(val);
            return root;
        }

        // inserting at left
        if(root.data > val){
            root.left = insert(root.left, val);
        }

        else{
            // for right
            root.right = insert(root.right, val);
        }

        return root;


    }

    // traversaling inorder
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    // searching in bst
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }

        if(root.data > key){
            // left subtree
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }

    }

    // deleting in bst
    public static Node delete(Node root,int val){
        // need to search the val
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else {
            // root.dat == val 
            // case 1 no children
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 one children
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3 two children 
            // in this we have to find the inorder sucessor

            Node IS = inorderSucessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSucessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    // quetions answer
    public static void printinRange(Node root,int X,int Y){
        if(root == null){
            return;
        }
        if(root.data >=X  && root.data <=Y){
            printinRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printinRange(root.right, X, Y);
        }
        else if(root.data >= Y){
            printinRange(root.left, X, Y);
        }
        else {
            printinRange(root.right, X, Y);
        }
    
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void printrootToleaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        else{
            // not a leaf
            printrootToleaf(root.left, path);
            printrootToleaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[] = {5,3,7,9,4,8,1};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }


        inorder(root);

        if(search(root, 5)){
            System.out.println("Found");

        }
        else{
            System.out.println("Not found");
        }

        delete(root, 4);
        inorder(root);

        System.out.println();
        printinRange(root, 3, 7);

        System.out.println();
        printrootToleaf(root, new ArrayList<>());

    }
}
