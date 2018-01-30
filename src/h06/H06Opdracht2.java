package h06;

import javax.swing.text.html.parser.Parser;
import java.applet.Applet;
import java.awt.*;

public class H06Opdracht2 extends Applet {
    private int sec;
    private int min;
    private int dag;
    private  int jaar;
    private int secinuur;
    private int secindag;
    private int secinjaar;


    @Override
    public void init() {
        super.init();
        sec = 60;
        min = 60;
        dag= 24;
        jaar = 365;
        secinuur = min * sec;
        secindag= sec * min * dag;
        secinjaar= sec * min *dag *jaar;


    }

    @Override
    public void paint(Graphics g) {

        g.drawString("secounden in een uur is :" + secinuur,20,20);
        g.drawString("secounden in een dag is :" + secindag,20,40);
        g.drawString("secounden in een jaar is :" + secinjaar,20,60);

    }
}
