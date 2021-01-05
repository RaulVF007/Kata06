package Kata06.control;

import Kata06.model.Block;

public class UpCommand implements Command {
    private final Block block;

    public UpCommand(Block block){
        this.block = block;
    }
    
    @Override
    public void execute() {
        block.up();
    }
    
}
