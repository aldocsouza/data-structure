package problem;

import dataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

public class LargestTreeValues {

    public static List<Integer> largesValues(Tree tree){
        var list = new ArrayList<Integer>();
        solveTree(tree.root, 0, list);
        return list;
    }

    private static void solveTree(Tree.Node node, final int level, final ArrayList<Integer> list) {

        if(node == null) return;
        if(level == list.size()){
            list.add(node.value);
        }else {
            list.set(level, Math.max(list.get(level), node.value));
        }

        solveTree(node.left, level+1, list);
        solveTree(node.right, level+1, list);

    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(37);
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);

        System.out.println(largesValues(tree));
    }

}
