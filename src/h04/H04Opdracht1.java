package h04;

import java.applet.Applet;
import java.awt.*;

public class H04Opdracht1 extends Applet  {


    @Override
public void init() {
    super.init();
}
    public void paint(Graphics g){
        g.drawLine(50, 50, 50, 100);
        g.drawLine(50,100,100,100);
        g.drawLine(100,100,50,50);

    }
}