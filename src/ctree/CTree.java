package ctree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class CTree extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    TPanel panel = new TPanel();
    SPanel spanel = new SPanel();

    CTree() {
        add(spanel);
        add(panel);

        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Timer timer = new Timer(500, this);
        this.setVisible(true);
        timer.start();
    }

    public static void main(String[] args) {
        new CTree();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        panel.moveStar();
        panel.flashLights();
        panel.repaint();
        panel.changeColor();
        panel.flashLights2();

    }
}
