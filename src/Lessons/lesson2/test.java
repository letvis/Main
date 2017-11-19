package Lessons.lesson2;

import javax.swing.*;

public class test {
    static JFrame jFrame = getJFrame();

    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        jPanel.add(new JTextField("- имя", 20));
        jPanel.add(new JTextField("- город", 20));
        jPanel.add(new JTextField("- возраст", 20));
        jPanel.add(new JTextField("- хобби", 20));
        JTextField jTextField = new JTextField();
        jTextField.getText();
        jPanel.revalidate();

    }

    static JFrame getJFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;

    }

}






