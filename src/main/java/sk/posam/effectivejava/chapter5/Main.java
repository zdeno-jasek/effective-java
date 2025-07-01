package sk.posam.effectivejava.chapter5;

/**
 * This class simulates a Windows directory structure using TreeNode.
 * Each TreeNode represents a directory or file in the file system.
 */
public class Main {
    public static void main(String[] args) {

        TreeNode cDrive = new TreeNode("C:\\");
        TreeNode programFiles = new TreeNode("Program Files", cDrive);
        cDrive.addChild(programFiles);
       
        TreeNode windows = new TreeNode("Windows", cDrive);
        cDrive.addChild(windows);
        
        TreeNode users = new TreeNode("Users", cDrive);
        cDrive.addChild(users);
        
        TreeNode microsoftFolder = new TreeNode("Microsoft", programFiles);
        programFiles.addChild(microsoftFolder);
        
        TreeNode office = new TreeNode("Office", microsoftFolder);
        microsoftFolder.addChild(office);
        

        TreeNode word = new TreeNode("word.exe", office);
        office.addChild(word);
        
        TreeNode excel = new TreeNode("excel.exe", office);
        office.addChild(excel);
        

        TreeNode userJohn = new TreeNode("John", users);
        users.addChild(userJohn);
        
        TreeNode desktop = new TreeNode("Desktop", userJohn);
        userJohn.addChild(desktop);
        
        TreeNode documents = new TreeNode("Documents", userJohn);
        userJohn.addChild(documents);
        

        TreeNode report = new TreeNode("report.docx", documents);
        documents.addChild(report);
                

        System.out.println("Windows Directory Structure Simulation:");
        System.out.println("======================================");
        
        printDirectoryStructure(cDrive, 0);
    }
    
    private static void printDirectoryStructure(TreeNode node, int level) {
        String indent = " ".repeat(level * 2);

        String nodeValue = (String) node.getValue();
        System.out.println(indent + nodeValue);
        
        for (TreeNode child : node.getChildren()) {
            printDirectoryStructure(child, level + 1);
        }
    }
    
}
