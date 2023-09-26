import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
public class simpleapplet extends Applet
{
    public void init()
    {
        setBackground(Color.CYAN);
        setForeground(Color.red);
    }
 public void paint(Graphics g)
 {
g.drawString("This is Example of Applet",50,30);
 }
}

/*<applet code="simpleapplet"
    width="200"
    height="300">
</applet>
*/
