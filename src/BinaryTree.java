
import java.util.*;

/**
 * @ProjectName: ArithmeticProgram
 * @Package: PACKAGE_NAME
 * @ClassName: BinaryTree
 * @Description: java类作用域描述
 * @Author: 111111
 * @CreateDate: 2019/2/27 13:47
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
public class BinaryTree {

    private Integer num;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(Integer num, BinaryTree left, BinaryTree right) {
        this.num = num;
        this.left = left;
        this.right = right;
    }

    public static BinaryTree binaryTreeReverse(BinaryTree root) {

        if (root == null) {
            return root;
        }

        BinaryTree l= root.left;
        BinaryTree r = root.right;
        if (l != null || r!= null) {
            BinaryTree swapTree = swap(root, l, r);

            if (swapTree.left != null) {
                binaryTreeReverse(swapTree.left);
            }

            if (swapTree.right != null) {
                binaryTreeReverse(swapTree.right);
            }
        }
        return root;
    }

    private static BinaryTree swap(BinaryTree root, BinaryTree left, BinaryTree right) {
        root.left = right;
        root.right = left;
        return  root;
    }

    public static void main(String[] args) {
        BinaryTree thrLL = new BinaryTree(4, null, null);
        BinaryTree thrLR = new BinaryTree(5, null, null);
        BinaryTree thrRL = new BinaryTree(6, null, null);

        BinaryTree secL = new BinaryTree(2, thrLL, thrLR);
        BinaryTree secR = new BinaryTree(3, thrRL, null);

        BinaryTree root = new BinaryTree(1, secL, secR);

        System.out.println(breadthTraversal(root));

        BinaryTree reverseTree = binaryTreeReverse(root);

        System.out.println(breadthTraversal(reverseTree));

    }

    private static String breadthTraversal(BinaryTree root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            Integer[] arr = result.toArray(new Integer[result.size()]);
            return Arrays.toString(arr);
        }
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTree tree = queue.poll();
            result.add(tree.num);
            if (tree.left != null) {
                queue.offer(tree.left);
            }
            if (tree.right != null) {
                queue.offer(tree.right);
            }
        }
        Integer[] arr = result.toArray(new Integer[result.size()]);
        return Arrays.toString(arr);
    }
}