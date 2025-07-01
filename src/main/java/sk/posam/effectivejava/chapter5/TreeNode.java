package sk.posam.effectivejava.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a node in a tree structure.
 * It can have a value, a parent node, and a list of child nodes.
 */
public class TreeNode {
    private Object value;
    private TreeNode parent;
    private List<TreeNode> children;

    /**
     * Constructor with value, parent will be null (for root nodes).
     */
    public TreeNode(Object value) {
        this(value, null);
    }
    
    /**
     * Constructor with value and parent reference.
     */
    public TreeNode(Object value, TreeNode parent) {
        this.value = value;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }

    public TreeNode getChild(int index) {
        return children.get(index);
    }

    public int childCount() {
        return children.size();
    }

    public TreeNode getParent() {
        return parent;
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
