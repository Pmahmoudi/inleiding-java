package H06;

import java.applet.Applet;
import java.awt.*;

public class H06Opdracht1 extends Applet {
    double karwei;
    double verdelen;
    double uitkomst;


    @Override
    public void init() {
       karwei = 113.00;
        verdelen = 4;
        uitkomst= karwei / verdelen;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Ttotaal verdiend is:" + karwei,20,20);
        g.drawString("Ali:" + uitkomst,20,50);
        g.drawString("Jan:" + uitkomst,20,70);
        g.drawString("Jeannette:" + uitkomst,20,90);
        g.drawString("Peyman:" + uitkomst, 20,110);
    }
}
