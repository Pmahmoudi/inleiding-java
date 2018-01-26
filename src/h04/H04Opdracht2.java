package h04;

        import java.applet.Applet;
        import java.awt.*;

public class H04Opdracht2 extends Applet {

    @Override
    public void init() {
        super.init();
    }

    public void paint(Graphics g){

        // huis frame
        g.drawRect(50,50,100,100);

        // raam
        g.fillRect(60,80,20,20);

        //dak
        g.drawLine(50,50,100,20);
        g.drawLine(150,50,100,20);

        //deur
        g.drawRect(100,90,40,60);


    }

}
