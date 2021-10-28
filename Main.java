/**
 *
 * @author JohnRelix
 */
public class Main {
    public static void main(String args[]) {
        farmsInventory f = new farmsInventory();
        /* Create and display the form */
        f.setDefaultCloseOperation(farmsInventory.EXIT_ON_CLOSE);  
        f.setResizable(false);
        f.setSize(350, 250);
        java.awt.EventQueue.invokeLater(() -> {
            new farmsInventory().setVisible(true); //call the farmsInventory class for me.     
     });
    }    
}
