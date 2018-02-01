package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08Opdracht1 extends Applet {

    String tekst;
    TextField tekstvak;
    Button knop;
    Button resetknop;
    Label titel;

    public void init()
    {
        tekst= "Druk op oke";
        titel= new Label("Tekstvak");
        add(titel);
        tekstvak= new TextField("vul hier in",30);
        add(tekstvak);

        knop= new Button();
        knop.setLabel("oke");
        KnopListenertwee p0= new KnopListenertwee();
        knop.addActionListener(p0);
        add(knop);

        resetknop= new Button();
        resetknop.setLabel("reset");
        KnopListener p = new KnopListener();
        resetknop.addActionListener( p );
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

    class KnopListenertwee implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekst= tekstvak.getText();
            repaint();
        }
    }

}

