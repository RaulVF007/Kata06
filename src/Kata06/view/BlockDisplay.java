package Kata06.view;

import Kata06.model.Block;

public interface BlockDisplay extends Block.Observer {
    void display(Block block);
    Block block();
}
