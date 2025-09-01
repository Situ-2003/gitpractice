import java.util.*;
public class BinaryTreesYT
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTrees{
        static int idx=-1;
        public static Node buidTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buidTree(nodes);
            newNode.right=buidTree(nodes);

            return newNode;

        }

    }
    //PreoOrder traversal
    public static void Preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    //Inorder Traversal
    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    //Postorder traverasal
    public static void Postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }
    //level order Traversal
    public static void Levelorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            if(currNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }else{
                    q.add(null);
                }
            }else
            {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }

        }


    }
    //count no of nodes
    public static int countOfNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftNodes=countOfNodes(root.left);
        int rightNodes=countOfNodes(root.right);

        return leftNodes+rightNodes+1;
    }
    //Sum of Nodes
    public static int SumOfNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftsum=SumOfNodes(root.left);
        int rightsum=SumOfNodes(root.right);

        return leftsum+rightsum+root.data;
    }
    //Height of tree
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        int myHeight=Math.max(leftheight, rightheight)+1;

        return myHeight;
    }
    //diameter of tree
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees tree=new BinaryTrees();
        Node root=tree.buidTree(nodes);
        //System.out.println(root.data);
        Preorder(root);
        System.out.println("");
        Inorder(root);
        System.out.println("");
        Postorder(root);
        System.out.println();
        Levelorder(root);
        System.out.println(countOfNodes(root));
        System.out.println("Sum of nodes is "+SumOfNodes(root));
        System.out.println("Height of Tree="+height(root));
    }
}