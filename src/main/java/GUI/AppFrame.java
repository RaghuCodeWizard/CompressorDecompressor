package GUI;

import comp_decomp.Compress;
import comp_decomp.DeCompress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class
AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton deCompressButton;

    public AppFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocation(400,150);
        this.getContentPane().setBackground(Color.PINK);
        this.setLayout(null); // Set layout to null for custom button positioning

        compressButton = new JButton("Select here for Compression");
        compressButton.setLocation(100, 50);
        compressButton.setSize(300, 50);
        compressButton.addActionListener(this);
        this.add(compressButton);

        deCompressButton = new JButton("Select here for DeCompression");
        deCompressButton.setLocation(100, 120);
        deCompressButton.setSize(300, 50);
        deCompressButton.addActionListener(this);
        this.add(deCompressButton);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        AppFrame app = new AppFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==compressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    Compress.method(file);
                }catch (Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
        if(e.getSource()==deCompressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    DeCompress.method(file);
                }catch (Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }
}
