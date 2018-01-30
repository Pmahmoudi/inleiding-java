package h06;

import javax.swing.text.html.parser.Parser;
import java.applet.Applet;
import java.awt.*;

public class H06Opdracht2 extends Applet {

    private int min;
    private int uur;
    private int dag;
    private  int jaar;


    @Override
    public void init() {
        super.init();
        min = 60;
        uur = min * 60;
        dag= uur * 24;
        jaar = dag * 365;
    }

    @Override
    public void paint(Graphics g) {

        g.drawString("secounden in een uur is :" + uur,20,20);
        g.drawString("secounden in een dag is :" + dag,20,40);
        g.drawString("secounden in een jaar is :" + jaar,20,60);

    }
}
