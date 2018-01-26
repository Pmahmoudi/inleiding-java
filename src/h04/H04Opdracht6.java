package h04;

import java.applet.Applet;
import java.awt.*;

public class H04Opdracht6 extends Applet {
    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
      g.drawRect(50,50,70,220);
//      g.drawArc(50,60,80,80,150,300);
        g.setColor(Color.RED);
      g.fillOval(55,60,60,60);
      g.setColor(Color.ORANGE);
      g.fillOval(55,130,60,60);
      g.setColor(Color.green);
      g.fillOval(55,200,60,60);


    }
}
