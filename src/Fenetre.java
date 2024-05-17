import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;



public class Fenetre extends JFrame {
    
    private Incrementeur increment;

    public Fenetre(){

        this.increment = new Incrementeur(0);
        creerInterface();
    }

    public void creerInterface(){

    }
}
