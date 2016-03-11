/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 16/03/10
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
 
public class ProjectSnake extends JFrame{
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = new ProjectSnake();
                ex.setVisible(true);                
            }
        });
    }
    
    public ProjectSnake() {

        add(new Layout());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}