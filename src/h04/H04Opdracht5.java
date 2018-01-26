package h04;


import javafx.scene.shape.Ellipse;

import java.applet.Applet;
import java.awt.*;

public class H04Opdracht5 extends Applet {

    @Override
    public void init() {
        super.init();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawRect(50, 5, 100, 100);
        g.drawArc(50,5,100,100,75,40);
        g.fillArc(50, 5, 100, 100, 75, 40);
    }

}