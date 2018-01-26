package h04;

import java.applet.Applet;
import java.awt.*;

public class H04Opdracht4 extends Applet {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        //line
        g.drawLine(50,150,270,150);
        g.drawLine(50,10,50,150);


        //graphics
        g.drawRect(70,50,20,100);
        g.drawRect(130,70,20,80);
        g.drawRect(190,110,20,40);

        //Color
        g.setColor(Color.RED);
        g.fillRect(70,50,20,100);
        g.setColor(Color.pink);
        g.fillRect(130,70,20,80);
        g.setColor(Color.YELLOW);
        g.fillRect(190,110,20,40);

        g.setColor(Color.BLUE);
        g.drawString("Hans",125,162);
        g.drawString("Jeroen",60,162);
        g.drawString("Valerie",182,162);


        g.setColor(Color.BLACK);
        g.drawLine(50,50,270,50);
        g.drawLine(50,70,270,70);
        g.drawLine(50,90,270,90);
        g.drawLine(50,110,270,110);
        g.drawLine(50,130,270,130);


        g.setColor(Color.BLACK);
        g.drawString("20KG",10,130);
        g.drawString("40KG",10,110);
        g.drawString("60KG",10,90);
        g.drawString("80KG",10,70);
        g.drawString("100KG",10,50);



    }
}


