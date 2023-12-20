package ctree;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

class SPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public SPanel() {
        ImageIcon img = new ImageIcon("gif/star2.gif");
        if (img.getIconWidth() == -1) {
            System.out.println("GIF not found");
        }
//        JLabel lbl = new JLabel(img);
//        this.add(lbl);
    }
}
