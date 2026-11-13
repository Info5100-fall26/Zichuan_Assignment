import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel {
    private Color circleColor;

    public ColorPanel() {
        circleColor = null;
    }

    public void setCircleColor(Color color) {
        circleColor = color;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (circleColor != null) {
            g.setColor(circleColor);
            g.fillOval(75, 25, 150, 150);
        }

        g.setColor(Color.BLACK);
        g.drawOval(75, 25, 150, 150);
    }
}
