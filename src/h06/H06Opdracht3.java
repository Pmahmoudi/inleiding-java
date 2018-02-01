package h06;

import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;

public class H06Opdracht3 extends Applet {
    int uitkomst;
    int nummer;
    int numeren;

    public void init() {
        nummer = 6;
        numeren = 7;

        uitkomst = -(nummer + numeren);
    }

    public void paint(Graphics g) {
        g.drawString("De Uitkomst is :" + uitkomst, 20, 20);
    }
}

