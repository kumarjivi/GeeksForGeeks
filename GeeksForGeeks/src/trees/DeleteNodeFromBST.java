package trees;

public class DeleteNodeFromBST {
	TreeNode deleteNode(TreeNode root, int key) 
    {
	// Your code here
	    if(root == null)
	        return root;
	    if(root.key < key) {
	        root.right = deleteNode(root.right, key);
	        //return root;
	    } else if (root.key > key) {
	        root.left = deleteNode(root.left, key);
	        //return root;
	    } else {
	        /*if(root.left == null && root.right == null) {
	            return null;
	        } else */if(root.left == null) {
	            return root.right;
	        } else if(root.right == null) {
	            return root.left;
	        } else {
	            root.key = findInorderSuccessor(root.right).key;
	            root.right = deleteNode(root.right, root.key);
	        }
	        //return root;
	    }
	    return root;
    }
    
	TreeNode findInorderSuccessor(TreeNode node) {
        if(node == null || node.right == null) {
            return node;
        }
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }
}
