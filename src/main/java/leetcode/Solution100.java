package leetcode;

import leetcode.model.TreeNode;

public class Solution100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        if ((p == null && q !=null) || (p !=null && q == null)) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
