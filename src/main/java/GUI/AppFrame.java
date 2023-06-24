package GUI;

import Compress_DeCompress.Compress;
import Compress_DeCompress.DeCompress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class AppFrame extends JFrame implements ActionListener {
    JButton compress;
    JButton decompress;

    public AppFrame() {
        // Set frame properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set the default close operation for the frame
        this.setSize(500, 500);  // Set the size of the frame
        this.getContentPane().setBackground(Color.GREEN);  // Set the background color of the content pane
        this.setLayout(null);  // Set the layout manager for the frame

        // Calculate the center position of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (screenSize.width - this.getWidth()) / 2;
        int centerY = (screenSize.height - this.getHeight()) / 2;

        // Set frame position at the center of the screen
        this.setLocation(centerX, centerY);

        // Create and add buttons
        compress = new JButton("Select a File for Compression");
        decompress = new JButton("Select a File for DeCompression");
        compress.setSize(250, 100);
        decompress.setSize(250, 100);

        // Calculate button positions
        int buttonX = (this.getWidth() - compress.getWidth()) / 2;
        int compressY = (this.getHeight() - compress.getHeight()) / 2 - 100;
        int decompressY = (this.getHeight() - decompress.getHeight()) / 2 + 50;
        compress.setLocation(buttonX, compressY);
        decompress.setLocation(buttonX, decompressY);

        // Add action listeners to buttons
        compress.addActionListener(this);
        decompress.addActionListener(this);

        // Add buttons to the frame
        this.add(compress);
        this.add(decompress);

        // Set the frame visible
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == compress) {
            // Open file chooser dialog for selecting a file to compress
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    // Call the compress method from the Compress class
                    Compress.method(file);
                    JOptionPane.showMessageDialog(null, "Compression Successful");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                    JOptionPane.showMessageDialog(null, "Compression Error: " + ex.toString());
                }
            }
        }
        if (e.getSource() == decompress) {
            // Open file chooser dialog for selecting a file to decompress
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    // Call the decompress method from the DeCompress class
                    DeCompress.method(file);
                    JOptionPane.showMessageDialog(null, "DeCompression Successful");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                    JOptionPane.showMessageDialog(null, "DeCompression Error: " + ex.toString());
                }
            }
        }
    }

}
