package net.ferderplays.ShqnnelGlue.modules.render;

import net.ferderplays.*;

public class HUD extends modules {
    String hud = "./net/ferderplays/ShqnnelGlue/modules/render/HUD.java";

    void drawn() {
        if (this.gui.hudbutton.watermark.selected()) {
            switch (141) {
                case NORMAL:
                    this.mc.setTitle("ShqnnelGlue").position(this.hudeditor.watermark.getPosition());
                    this.hud.watermark.setColor(this.gui.hudbutton.watermark.getSelectedColor());
                    break;
                case FERDERDUPER:
                    this.mc.setTitle("Ferder Dupe Client").position(this.hudeditor.watermark.getPosition());
                    this.hud.watermark.setColor(this.gui.hudbutton.watermark.getSelectedColor());
                    break;
                case 2B2T:
                    this.mc.setTitle("2b2t dupe client").position(this.hudeditor.watermark.getPosition());
                    this.hud.watermark.setColor(this.gui.hudbutton.watermark.getSelectedColor());
                    break;
            }
            if (this.gui.hudbutton.watermark.selected.withmodversion()) {
                switch (1411) {
                    case NORMAL:
                        this.mc.setTitle("ShqnnelGlue" + modver).position(this.hudeditor.watermark.getPosition());
                        this.hud.watermark.setColor(this.gui.hudbutton.watermark.getSelectedColor());
                        break;
                    case FERDERDUPER:
                        this.mc.setTitle("Ferder Dupe Client" + modver).position(this.hudeditor.watermark.getPosition());
                        this.hud.watermark.setColor(this.gui.hudbutton.watermark.getSelectedColor());
                        break;
                    case 2B2T:
                        this.mc.setTitle("2b2t dupe client" + modver).position(this.hudeditor.watermark.getPosition());
                        this.hud.watermark.setColor(this.gui.hudbutton.watermark.getSelectedColor());
                        break;
                }
            }
        }
        if (this.gui.hudbutton.greeter.selected()) {
            switch (242) {
                case NORMAL:
                    this.mc.setTitle("hello" + this.mc.getPlayer() + "| ShqnnelGlue on de tope |").align("center");
                    this.hud.greeter.setColor(this.gui.hudbutton.greeter.getSelectedColor());
                    break;
                case FERDERDUPER:
                    this.mc.setTitle("sup nigga" + this.mc.getPlayer() + "| Ferder Dupe Client |").align("center");
                    this.hud.greeter.setColor(this.gui.hudbutton.greeter.getSelectedColor());
                    break;
                case 2B2T:
                    this.mc.setTitle("so u" + this.mc.getPlayer() + "hate newfags?" + "perfect, cause i do too :)" + "| 2b2t dupe client |").align("center");
                    this.hud.greeter.setColor(this.gui.hudbutton.greeter.getSelectedColor());
                    break;
                case CUSTOM:
                    this.mc.setTitle(this.gui.hudbutton.greeter.custom.getFirstPar() + this.mc.getPlayer() + this.gui.hudbutton.greeter.custom.getSecondPar()).align("center");
                    this.hud.greeter.setColor(this.gui.hudbutton.greeter.getSelectedColor());
                    break;
            }
        }
        if (this.gui.hudbutton.modulelist.selected()) {
            activemodules = new ArrayList<String>();
            if (this.module.active()) {
                activemodules.add();
            }
            if (this.module.notactive()) {
                activemodules.remove();
            }
            int FerderDuperClient() {
                this.hud.modulelist.setBackgroundColor(green);
                this.hud.modulelist.setTextColor(red);
                this.hud.modulelist.setBorderColor(rainbow);
            }
            this.hud.modulelist.align("right-corner");
            switch (343) {
                case FERDERDUPER:
                    String FerderColor = this.hud.modulelist.setColorMode(FerderDuperClient);
                    break;
                case RAINBOW:
                    this.hud.moduleList.setColorMode(Rainbow);
                    break;
            }
        }
    }
}
