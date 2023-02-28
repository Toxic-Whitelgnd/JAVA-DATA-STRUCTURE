package BT;

import java.net.SocketTimeoutException;
import java.util.LinkedList;
import java.util.Queue;

public class Btjava {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildtree(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }

            Node newnode = new Node(Nodes[idx]);
            newnode.left = buildtree(Nodes);
            newnode.right = buildtree(Nodes);

            return newnode;
        }
    }

    // traverseling in the binary tree
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void LevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);// this is for we have to print in level wise for that

        while (!q.isEmpty()) {
            Node currnode = q.remove();
            if (currnode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currnode.data + " ");
                if (currnode.left != null) {
                    q.add(currnode.left);
                }
                if(currnode.right != null) {
                    q.add(currnode.right);
                }
            }
        }
    }

    public static int countNoofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftnode = countNoofNodes(root.left);
        int rightnode = countNoofNodes(root.right);

        return leftnode + rightnode + 1;
    }

    public static int sumofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumofNodes(root.left);
        int rightsum = sumofNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    public static int heightoftree(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = heightoftree(root.left);
        int rightheight = heightoftree(root.right);

        int myheight = Math.max(leftheight, rightheight) +1;

        return myheight;
    }

    // finding the diameter of the height 
    // making the datatype for storing both the height and diameter
    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameterofTree(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }

       TreeInfo left = diameterofTree(root.left);
       TreeInfo right = diameterofTree(root.right);

       int myhet = Math.max(left.ht, right.ht)+1;

       int leftdiam = left.diam;
       int rightdiam = right.diam;
       int diam3 = left.ht + right.ht +1;

       int diam = Math.max(Math.max(rightdiam, leftdiam),diam3);

       TreeInfo newnode = new TreeInfo(myhet,diam);
       return newnode;

    }



    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildtree(nodes);
        System.out.println(root.data);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);

        System.out.println();
        LevelOrder(root);

        System.out.println(countNoofNodes(root));
        System.out.println(sumofNodes(root));
        System.out.println(heightoftree(root));
        System.out.println(diameterofTree(root).diam); //in this i just only want the diam so i used diam
    }
}