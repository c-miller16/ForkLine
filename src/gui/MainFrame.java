package src.gui;

import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JComponent;

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JComponent implements ActionListener {
    private JFrame f;
    private Dimension SIZE = new Dimension(900, 632);

    MainFrame() {
        f = new JFrame("Concordia");
        f.setSize(SIZE.width+17, SIZE.height+40);//to more accurately set the size
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);

        Container c = f.getContentPane();
        c.setBackground(Color.WHITE);
        c.add(this);

        Timer t = new Timer(1, this); //timer to assist with updating the frame
        t.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(PieceImage.BOARD.pieceImage, 0, 0, SIZE.width, SIZE.height, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //update if needed
        //repaint();
    }
}

class TestMainFrame {
    public static void main(String[] args) {
        MainFrame m = new MainFrame();
    }
}