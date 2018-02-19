package h10;

import java.applet.Applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht4 extends Applet {
    TextField tekstvak;
    String y, tekst;
    Label label;
    int maand;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("typ een maand in");
        tekst = "";
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            y = tekstvak.getText();
            maand = Integer.parseInt(y);
            jaartal = Integer.parseInt(y);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();

            if (maand == 1) {
                tekst = "Januari: heeft 31 dagen";
            }
            if (maand == 2) {
                tekst = "Februari: heeft 28 dagen";
            }
            if (maand == 3) {
                tekst = "Maart: heeft 31 dagen";
            }
            if (maand == 4) {
                tekst = "April: heeft 30 dagen";
            }
            if (maand == 5) {
                tekst = "Mei: heeft 31 dagen";
            }
            if (maand == 6) {
                tekst = "Juni: heeft 30 dagen";
            }
            if (maand == 7) {
                tekst = "Juli: heeft 31 dagen";
            }
            if (maand == 8) {
                tekst = "Augustus: heeft 31 dagen";
            }
            if (maand == 9) {
                tekst = "September: heeft 30 dagen";
            }
            if (maand == 10) {
                tekst = "Oktober: heeft 31 dagen";
            }
            if (maand == 11) {
                tekst = "November: heeft 30 dagen";
            }
            if (maand == 12) {
                tekst = "Decemer: heeft 31 dagen";
            }
            if ((maand >= 13) && maand<= 100){
                tekst = "Foutmelding!";
            }

            repaint();
        }

    }
}
