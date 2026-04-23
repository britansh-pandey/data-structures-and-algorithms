class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
        left=null;
        right=null;

    }

}
public class BST {
    Node createBst(int[] a){
        Node root=null;
        for(int val:a){
            root=insertion(root,val);
        }
        return root;

        
    }
    Node insertion(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.data){
            root.left=insertion(root.left,val);
        }
        else{
            root.right=insertion(root.right,val);
        }
        return root;
        }
    void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String[] args){
        BST m1=new BST();
        int[] a={5,6,3,8,1,9,4,7};
        Node root=m1.createBst(a);
        m1.inOrder(root);
    }
}


    

