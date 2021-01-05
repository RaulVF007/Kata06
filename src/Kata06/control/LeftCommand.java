package Kata06.control;

import Kata06.model.Block;

public class LeftCommand implements Command {
    private final Block block;

    public LeftCommand(Block block){
        this.block = block;
    }
    
    @Override
    public void execute() {
        block.left();
    }
    
}
