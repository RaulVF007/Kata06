package Kata06.apps.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main().execute();

    }

    public Main() {
        this.setTitle("Block shifter");
        this.setSize(700, 750);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(blockPanel());

    }

    private void execute() {
        this.setVisible(true);
    }

    private JPanel blockPanel() {
        BlockPanel blockPanel = new BlockPanel();
        return blockPanel;
    }

}
