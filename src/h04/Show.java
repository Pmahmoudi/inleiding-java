package h04;

import java.applet.Applet;
import java.awt.*;

public class Show extends Applet {
    public void init() {

    }
    public void paint(Graphics g){
        setBackground(Color.BLUE);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 50);
        g.drawOval(20,20,100,50);
        g.fillArc(20, 20, 100, 50, 90, 45);
        
    }


}
