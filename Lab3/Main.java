import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {

    JFrame frame;
    ColorPanel circlePanel;
    JComboBox<String> colors;
    JTextField output;

    public Main() {

        // Create a frame
        frame = new JFrame("Circle Color Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 330);
        frame.setLayout(new BorderLayout());

        // Create a circle panel
        circlePanel = new ColorPanel();
        frame.add(circlePanel, BorderLayout.CENTER);

        // Create a bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 2, 5, 5));

        // Create dropdown choices
        bottomPanel.add(new JLabel("Choose Color:"));

        String[] colorNames = {
            "Select Color", "Red", "Blue", "Green"
        };

        colors = new JComboBox<String>(colorNames);
        bottomPanel.add(colors);

        // Create text output field
        bottomPanel.add(new JLabel("Selected Color:"));

        output = new JTextField();
        output.setEditable(false);
        bottomPanel.add(output);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Listen for color selection
        colors.addActionListener(this);

        // Show the frame
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String selected = (String) colors.getSelectedItem();

        if (selected.equals("Red")) {
            circlePanel.setCircleColor(Color.RED);
            output.setText("Red");

        } else if (selected.equals("Blue")) {
            circlePanel.setCircleColor(Color.BLUE);
            output.setText("Blue");

        } else if (selected.equals("Green")) {
            circlePanel.setCircleColor(Color.GREEN);
            output.setText("Green");

        } else {
            circlePanel.setCircleColor(null);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}

