package trees;

public class DeleteNodeFromBSTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode fifty = new TreeNode(50);
		TreeNode twenty = new TreeNode(20);
		TreeNode eighty = new TreeNode(80);
		TreeNode ten = new TreeNode(10);
		TreeNode thirtyFive = new TreeNode(35);
		TreeNode seventy = new TreeNode(70);
		TreeNode hundred = new TreeNode(100);
		TreeNode thirty = new TreeNode(30);
		TreeNode forty = new TreeNode(40);
		fifty.left = twenty;
		fifty.right = eighty;
		twenty.left = ten;
		twenty.right = thirtyFive;
		eighty.left = seventy;
		eighty.right = hundred;
		thirtyFive.left = thirty;
		thirtyFive.right = forty;
		DeleteNodeFromBST deleteNodeFromBST = new DeleteNodeFromBST();
		deleteNodeFromBST.deleteNode(fifty, 20);
	}

}
