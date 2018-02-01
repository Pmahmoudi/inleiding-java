package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H08Opdracht1 extends Applet {

    String tekst;
    TextField tekstvak;
    Button knop;
    Button resetknop;
    Label titel;

    public void init()
    {
        tekst= "Druk op oke";
        titel= new Label("recht is een tekstvak");
        add(titel);
        tekstvak= new TextField("vul hier wat in",30);
        add(tekstvak);

        knop= new Button();
        knop.setLabel("oke");
        KnopListener2 kl2 = new KnopListener2();
        knop.addActionListener(kl2);
        add(knop);

        resetknop= new Button();
        resetknop.setLabel("reset");
        KnopListener kl = new KnopListener();
        resetknop.addActionListener( kl );
        add(resetknop);
    }
    public void paint(Graphics g){
        g.drawString(tekst,30,60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekst= tekstvak.getText();
            repaint();
        }
    }




}
