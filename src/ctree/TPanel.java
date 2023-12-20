package ctree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

class TPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    boolean isBlue = true;
    int starY = 0;
    boolean lightsOn = true;
    boolean lightsOn2 = true;

    public void changeColor() {
        isBlue = !isBlue;
    }

    public void moveStar() {
        starY += 10;
        if (starY > 80) {
            starY = 80; // Reset the star position
        }
    }

    public void flashLights() {
        lightsOn = Math.random() > 0.5;
    }
    public void flashLights2() {
        lightsOn2 = Math.random() > 0.5;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int[] x1 = {200, 100, 300};
        int[] y1 = {100, 200, 200};
        int[] x2 = {200, 100, 300};
        int[] y2 = {200, 300, 300};
        Polygon triangle1 = new Polygon(x1, y1, 3);
        Polygon triangle2 = new Polygon(x2, y2, 3);
        g2.setColor(Color.GREEN);
        g2.fillPolygon(triangle1);
        g2.fillPolygon(triangle2);

        g2.setColor(new Color(130, 70, 0));
        g2.fill3DRect(185, 300, 30, 80, true);

        if (isBlue) {
            g2.setColor(Color.BLUE);
        } else {
            g2.setColor(Color.RED);
        }
        g2.fillOval(90, 200, 20, 20);
        g2.fillOval(290, 200, 20, 20);
        g2.fillOval(90, 300, 20, 20);
        g2.fillOval(290, 300, 20, 20);

        if (lightsOn) {
            g2.setColor(Color.PINK);
            g2.fillOval(195, 220, 10, 10);
            g2.setColor(Color.BLUE);
            g2.fillOval(230, 150, 10, 10);
            g2.setColor(Color.CYAN);
           g2.fillOval(195, 250, 10, 10);
           g2.setColor(Color.MAGENTA);
           g2.fillOval(195, 180, 10, 10);
            g2.setColor(Color.WHITE);
            g2.fillOval(260, 280, 10, 10);
            g2.setColor(Color.YELLOW);
            g2.fillOval(160, 150, 10, 10);
            g2.setColor(Color.RED);
    g2.fillOval(130, 280, 10, 10);

        }
        if (lightsOn2) {
            g2.setColor(Color.PINK);
         g2.fillOval(195, 120, 10, 10);
         g2.setColor(Color.BLUE);
          g2.fillOval(230, 250, 10, 10);
          g2.setColor(Color.MAGENTA);
         g2.fillOval(195, 150, 10, 10);
         g2.setColor(Color.YELLOW);
         g2.fillOval(195, 280, 10, 10);
         g2.setColor(Color.WHITE);
        g2.fillOval(260, 180, 10, 10);
        g2.setColor(Color.RED);
     g2.fillOval(160, 250, 10, 10);
     g2.setColor(Color.CYAN);
 g2.fillOval(130, 180, 10, 10);
        }

        ImageIcon img = new ImageIcon("gif/star2.gif");
        img.paintIcon(this, g2, 175, starY);
    }
}
