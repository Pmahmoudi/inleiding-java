package h04;

import java.applet.Applet;
import java.awt.*;

public class H04Opdracht7 extends Applet {

    @Override
    public void init() {
        super.init();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawRoundRect(20, 20, 80, 80, 10, 10);
        g.setColor(Color.BLACK);
        g.fillOval(30,30,20,20);
        g.fillOval(30,70,20,20);
        g.fillOval(70,70,20,20);
        g.fillOval(70,30,20,20);







    }
}


