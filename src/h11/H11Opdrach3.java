package h11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdrach3 extends Applet {
    int n1 = -1;
    int n2 = 1;
    int n3;
    int y = 10;

    public void paint(Graphics g) {
        for (int a = 0; a < 10; a++) {
            y += 20;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            g.drawString("" + n3, 20, y);

        }


    }
}
