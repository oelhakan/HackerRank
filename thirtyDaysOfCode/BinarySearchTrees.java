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

public class BinarySearchTrees {

    public static int getHeight(Node root){
        int height = 0;
        int leftHeight = 0;
        int rightHeight = 0;


        //when both right or left is not null
        while(root.left != null || root.right != null){

            //if they both exist check which is higher, then set root to that and increase height by one
            if(root.left != null && root.right != null){
                leftHeight = getHeight(root.left);
                rightHeight = getHeight(root.right);
                height++;
                if(leftHeight > rightHeight){
                    root = root.left;
                }else{
                    root = root.right;
                }
            }

            //if only left exists, set root to left and increase height by one
            if(root.left != null && root.right == null){
                height++;
//                System.out.println("Height : " + height);
                root = root.left;
            }

            //if only right exists, set root to left and increase height by one
            if(root.left == null && root.right != null){
                height++;
//                System.out.println("Height : " + height);
                root = root.right;
            }

        }
        return height;
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
        int height=getHeight(root);
        System.out.println(height);
    }
}
