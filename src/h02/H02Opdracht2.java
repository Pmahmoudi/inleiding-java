package h02;

import java.applet.Applet;
import java.awt.*;

public class H02Opdracht2 extends Applet  {

  public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    g.setColor(Color.blue);
    g.drawString("peyman",50,50);
    g.setColor(Color.red);
    g.drawString("mahmoudi",50,60);
  }

}
