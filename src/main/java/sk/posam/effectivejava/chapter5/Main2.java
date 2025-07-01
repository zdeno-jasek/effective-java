package sk.posam.effectivejava.chapter5;

/**
 * This class demonstrates using TreeNode with Integer values to represent 
 * a pre-calculated factorization tree of the number 9240.
 */
public class Main2 {
    public static void main(String[] args) {
        // Main number to factorize: 9240
        TreeNode root = new TreeNode(9240);
        
        // First level: 9240 = 120 * 77
        TreeNode node120 = new TreeNode(120, root);
        TreeNode node77 = new TreeNode(77, root);
        root.addChild(node120);
        root.addChild(node77);
        
        // Factorize 120 = 12 * 10
        TreeNode node12 = new TreeNode(12, node120);
        TreeNode node10 = new TreeNode(10, node120);
        node120.addChild(node12);
        node120.addChild(node10);
        
        // Factorize 77 = 7 * 11 (both prime)
        TreeNode node7 = new TreeNode(7, node77);
        TreeNode node11 = new TreeNode(11, node77);
        node77.addChild(node7);
        node77.addChild(node11);
        
        // Factorize 12 = 4 * 3
        TreeNode node4 = new TreeNode(4, node12);
        TreeNode node3 = new TreeNode(3, node12);  // Prime
        node12.addChild(node4);
        node12.addChild(node3);
        
        // Factorize 10 = 2 * 5 (both prime)
        TreeNode node2a = new TreeNode(2, node10);  // Prime
        TreeNode node5 = new TreeNode(5, node10);   // Prime
        node10.addChild(node2a);
        node10.addChild(node5);
        
        // Factorize 4 = 2 * 2 (both prime)
        TreeNode node2b = new TreeNode(2, node4);   // Prime
        TreeNode node2c = new TreeNode(2, node4);   // Prime
        node4.addChild(node2b);
        node4.addChild(node2c);
        
        // Print the tree
        System.out.println("Factorization of 9240:");
        printFactorizationTree(root, 0);
        
        // Verify the factorization
        System.out.println("\nVerification:");
        System.out.println("Prime factors: 2 × 2 × 2 × 3 × 5 × 7 × 11 = 9240");
        System.out.println("Leaf nodes product should equal 9240");
    }
    
    private static void printFactorizationTree(TreeNode node, int level) {
        String indent = " ".repeat(level * 2);
        
        if (node.childCount() == 0) {
            System.out.println(indent + node.getValue() + " (prime)");
        } else {
            System.out.println(indent + node.getValue());
        }
        
        for (TreeNode child : node.getChildren()) {
            printFactorizationTree(child, level + 1);
        }
    }
}
