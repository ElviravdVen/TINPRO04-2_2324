/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   04/12/2023          *                                                                                          *
 *******************************/

package week3.les6;

public class Factory {
    Smelter oven;
    Shaper shaper;
    Polisher polisher;
    Rivetter klinker;
    Painter schilder;
    public Factory(){
        oven = new Smelter(400);
        shaper = new Shaper();
        polisher = new Polisher();
        klinker = new Rivetter();
        schilder = new Painter();
    }

    public Material processMaterial(Material material){
        this.oven.process(material);
        this.shaper.process(material);
        this.polisher.process(material);
        this.klinker.process(material);
        this.schilder.process(material);
        return material;
    }
}