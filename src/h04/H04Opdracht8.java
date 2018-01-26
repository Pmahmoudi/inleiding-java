package h04;


import java.applet.Applet;
import java.awt.*;

public class H04Opdracht8 extends Applet {

    @Override
    public void init() {
        super.init();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);


        //Lijn
        g.drawLine(20,80,200,80);
        g.drawString("Lijn",50,100);



        //Rechthoek
        g.drawRect(20,120,160,100);
        g.drawString("Rechthoek",35,240);



        //Afgeronde rechthoek
        g.drawRoundRect(20,260,160,100,20,20);
        g.drawString("Afgeronde rechthoek",35,390);



        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);g.fillRect(240,120,160,100);
        g.setColor(Color.black);g.drawOval(240,120,160,100);
        g.drawString("Gevulde rechthoek met ovaal",230,250);




        //Gevulde ovaal
        g.fillOval(240, 260, 160, 100);
        g.drawString("Gevulde ovaal",280,390);




        //Taartpunt met ovaal eromheen
        g.fillArc(450, 120, 160, 100,0,50);
        g.drawOval(450, 120, 160, 100);
        g.drawString("Taartpunt met ovaal eromheen",450,250);




        //cirkel
        g.drawOval(470, 260, 100, 100);
        g.drawString("cirkel",500,390);








    }
}
