package h08;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht extends Applet {
    TextField tv1;
    TextField tv2;
    Button plus;
    Button min;
    Button keer;
    Button deel;
    double s;
    double a;
    double antwoord;

    public void init() {
        tv1 = new TextField("", 10);
        tv2 = new TextField("", 10);
        plus = new Button("+");
        plus.addActionListener(new Plus());
        min = new Button("-");
        min.addActionListener(new Min());
        keer = new Button("x");
        keer.addActionListener(new Keer());
        deel = new Button("/");
        deel.addActionListener(new Deel());
        add(tv1);
        add(tv2);
        add(plus);
        add(min);
        add(keer);
        add(deel);

    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(antwoord), 50, 60);
    }

    class Plus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tv1.getText());
            a = Double.parseDouble(tv2.getText());
            antwoord = s + a;
            repaint();

        }
    }

    class Min implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tv1.getText());
            a = Double.parseDouble(tv2.getText());
            antwoord = s - a;
            repaint();

        }
    }

    class Keer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tv1.getText());
            a = Double.parseDouble(tv2.getText());
            antwoord = s * a;
            repaint();

        }
    }

    class Deel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Double.parseDouble(tv1.getText());
            a = Double.parseDouble(tv2.getText());
            antwoord = s / a;
            repaint();

        }
    }
}
