package com.effectivejava.chapter20.chapter19;


/**
 * Created by maskwang on 2017/8/27 0027.
 */
public class Solution {
    public static TreeNode createTree(int [] a){
        if(a.length>0){
            TreeNode root=new TreeNode(a[0]);
            return createTreeFun(a,root,1);
        }
        return null;
    }
    public static TreeNode createTreeFun(int []a,TreeNode root,int i){
        if(2*i<=a.length){
            TreeNode left=new TreeNode(a[2*i-1]);
            root.left=left;
        }
        else {
            root.left=null;
        }
        if(2*i+1<=a.length){
            TreeNode right=new TreeNode(a[2*i]);
            root.right=right;
        }
        else {
            root.right=null;
        }
        if(2*i<=a.length) {
            createTreeFun(a, root.left, i*2);
        }
        if(2*i+1<=a.length) {
            createTreeFun(a, root.right, i*2+1);
        }
        return root;
}

    public static void main(String[] args) {
//        TreeNode p1 = new TreeNode(1);
//        TreeNode p2 = new TreeNode(2);
//        TreeNode p3 = new TreeNode(3);
//        TreeNode p4 = new TreeNode(4);
//        TreeNode p5 = new TreeNode(5);
//        TreeNode p6 = new TreeNode(6);
//        TreeNode p7 = new TreeNode(7);
//        p1.left=p2;
//        p1.right=p3;
//        p2.left=p4;
//        p2.right=p5;
//        p3.left=p6;
//        p3.right=p7;
//        p4.left=null;
//        p4.right=null;
//        p5.left=null;
//        p6.right=null;
//        p6.left=null;
//        p5.right=null;
//        p7.left=null;
//        p7.right=null;
        TreeNode root=createTree(new int[]{1,2,3,4,5,6,7});
        System.out.println(root.val+"..."+root.left.val+"..."+root.right.val);



    }

}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}