package h05;

import java.applet.Applet;
import java.awt.*;

public class H05 extends Applet {

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



         // variable jeroen
        int jeroengewicht = 100;
        int jeroenlengte = 50;

        //variable hans
        int hansgewicht = 80;
        int hanslengte = 70;


        //varibale valerie
        int valeriegewicht = 40 ;
        int valerielengte = 110;



        //Color
        g.fillRect(70,jeroenlengte,20, jeroengewicht);
        //Hans
        g.setColor(Color.pink);
        g.fillRect(130,hanslengte,20,hansgewicht);
        //valerie
        g.setColor(Color.YELLOW);
        g.fillRect(190,valerielengte,20,valeriegewicht);

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


