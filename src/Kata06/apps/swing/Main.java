package Kata06.apps.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import Kata06.model.Block;
import Kata06.view.BlockDisplay;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main().execute();
    }
    private BlockDisplay blockDisplay;
    
    public Main() {
        this.setTitle("Block shifter");
        this.setSize(700, 750);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(blockPanel());
        Block block = new Block(4,4);
        this.blockDisplay.display(block);
    }

    private void execute() {
        this.setVisible(true);
    }

    private JPanel blockPanel() {
        BlockPanel blockPanel = new BlockPanel();
        this.blockDisplay = blockPanel;
        return blockPanel;
    }

}
