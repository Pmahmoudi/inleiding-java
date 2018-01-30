package h05;

import java.applet.Applet;
import java.awt.*;

public class H05 extends Applet{

    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;


    @Override
    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
    }


    @Override
    public void paint(Graphics g) {
        //teken rechthoek
        g.drawRect(100,100,breedte, hoogte);
        // teken afgronde rechthoek
        g.drawRoundRect(100,225, breedte, hoogte, 30,30);
        // teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315,100,breedte,hoogte);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315,100,breedte,hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315,225,breedte,hoogte)
    }
}
