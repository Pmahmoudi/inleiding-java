package h04;

import java.applet.Applet;
import java.awt.*;

public class H04Opdracht3 extends Applet{
    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {

        //rof
        g.fillRect(60,80,10,150);


        //vlag
        g.drawRect(70,80,90,15);
        g.drawRect(70,95,90,15);
        g.drawRect(70,110,90,15);

        //Color
        g.setColor(Color.red);
        g.fillRect(70,80,90,15);
        g.setColor(Color.white);
        g.fillRect(70,95,90,15);
        g.setColor(Color.BLUE);
        g.fillRect(70,110,90,15);



    }
}
