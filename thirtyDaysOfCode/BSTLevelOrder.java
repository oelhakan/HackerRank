package thirtyDaysOfCode;

import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class BSTLevelOrder {
    static void levelOrder(Node root){

        String out = "";

        Queue<Node> queue = new LinkedList<Node>();

        //if root is not empty enqueue current root
        if(root != null){
            queue.add(root);
        }

        //while there are nodes to process
        while(!queue.isEmpty()){
            //dequeue next node and print
            Node node = queue.remove();
            out += node.data + " ";

            //enqueue child elements from next level in order
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        System.out.println(out.trim());
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
