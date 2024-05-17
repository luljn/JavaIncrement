import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;



public class Fenetre extends JFrame {
    
    private Incrementeur increment;
    private JButton button;
    private JLabel label;
    private JPanel panel; 

    public Fenetre(){

        this.increment = new Incrementeur(0);
        this.setTitle("Incrémentation");
        this.setResizable(false);
        creerInterface();
    }

    public void creerInterface(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        
        this.label = new JLabel("Cliquer pour incrémenter : " + increment.getValeur());
        this.label.setHorizontalAlignment(SwingConstants.CENTER);
        this.label.setVerticalAlignment(SwingConstants.CENTER);
        this.button = new JButton("Incrementer");
        this.panel = new JPanel(new BorderLayout());

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                increment.Incrementer();
                label.setText( "Cliquer pour incrémenter : " + increment.getValeur());
            }
        });

        this.setLayout(new BorderLayout());
        this.panel.add(label);
        this.add(panel, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);

        this.setVisible(true);
    }
}
