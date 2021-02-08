package Sharustry.content;

import mindustry.ctype.*;



public class ModLoader implements ContentList{
    private final ContentList[] contents = {
        new SItems(),
        new SLiquids(),
        new SStatusEffects(),
        new SBullets(),
        new SBlocks()
    };

    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }
}
