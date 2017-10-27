package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree <T extends Comparable>{
	private static class BinaryNode<T>{
		private Integer theElement;
		private BinaryNode<T> left;
		private BinaryNode<T> right;
		public BinaryNode(Integer theElement,BinaryNode<T> left,BinaryNode<T> right){
			this.theElement=theElement;
			this.left=left;
			this.right=right;
		}
		public BinaryNode(Integer theElement){
			this(theElement,null,null);
		}
		private BinaryNode<T> insert(Integer x,BinaryNode<T> t){
			if(t==null){
				return new BinaryNode<T>(x);
			}
			//int compareResult=
			return null;
		}  
		//前序遍历
		private List<Integer> preorder(BinaryNode root){
			List<Integer> result=new ArrayList<Integer>();
			if(root==null){
				return result;
			}
			Stack<BinaryNode> stack = new Stack<BinaryNode>();
			stack.push(root);
			while(!stack.isEmpty()){
				BinaryNode node=stack.pop();
				result.add(node.theElement);
				if(node.right!=null){
					stack.push(node.right);
				}
				if(node.left!=null){
					stack.push(node.left);
				}
			}
			return result;
		}
		//中序遍历
		private List<Integer> postorder(BinaryNode root){
			 List<Integer> result = new ArrayList<Integer>();
			if(root==null){
				return result;
			}
			Stack<BinaryNode> stack=new Stack<>();
			stack.push(root);
			while(!stack.isEmpty()){
				BinaryNode node=stack.pop();
				result.add(node.theElement);
				if(root.left!=null){
					stack.push(root.left);
				}
				if(root.right!=null){
					stack.push(root.right);
				}
			}
			return result;
		}
		//后序遍历
		private List<Integer> inorder(BinaryNode root){
			List<Integer> result = new ArrayList<>();
			if(root==null){
				return result;
			}
			Stack<BinaryNode> stack = new Stack<>();
			while(root!=null&&!stack.isEmpty()){
				while(root!=null){
					stack.push(root);
					root=root.left;
				}
				BinaryNode node=stack.pop();
				result.add(node.theElement);
				root=node.right;
			}
			return result;
		}
	}
}
