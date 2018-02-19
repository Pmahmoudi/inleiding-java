package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    int hoogstegetal;
    int invoer;
    TextField tekstvak;
    String tekst;



    public void init() {
        setSize(600, 300);
        tekstvak = new TextField("Voer hier iets", 50);
        TekstvakListener kl = new TekstvakListener();
        tekstvak.addActionListener(kl);
        add(tekstvak);
        tekst = "";
    }


    public void paint(Graphics g) { g.drawString("het hoogste getal is:" + hoogstegetal, 20 , 50);}

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);
            if (hoogstegetal < invoer) {
                hoogstegetal = invoer;
                repaint();

            }
        }

    }
}


