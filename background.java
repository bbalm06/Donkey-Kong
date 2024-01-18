import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

import static java.lang.Thread.sleep;

public class background extends JPanel implements Runnable , MouseListener, MouseMotionListener {
    public static int[]x1 = {0,0,261,261};
    public static int[] y1 = {680,700,700,680};
    public static Polygon n1 = new Polygon(x1,y1,4);
    public static int[] x2 = {262,262,522,522};
    public static int[] y2 = {677,697,680,661};
    public static Polygon n2 = new Polygon(x2,y2,4);
    public static int[] x3 = {485,485,0,0};
    public static int[] y3 = {645-20,625-20,590-20,610-20};
    public static Polygon n3 = new Polygon(x3,y3,4);
    public static int[] x4 = {37,37,525,525};
    public static int[] y4 = {536,515,480,500};
    public static Polygon n4 = new Polygon(x4,y4,4);
    public static int[] x5 = {485,485,0,0};
    public static int[] y5 = {445,425,390,410};
    public static Polygon n5 = new Polygon(x5,y5,4);
    public static int[] x6 = {37,37,525,525};
    public static int[] y6 = {355,335,300,320};
    public static Polygon n6 = new Polygon(x6,y6,4);
    public static int[] x7 = {485,485,337,337};
    public static int[] y7 = {265,245,235,255};
    public static Polygon n7 = new Polygon(x7,y7,4);
    public static int[] x8 = {0,0,335,335};
    public static int[] y8 = {255,235,235,255};
    public static Polygon n8 = new Polygon(x8,y8,4);
    public static int[] x9 = {315,315,205,205};
    public static int[] y9 = {175,155,155,175};
    public static Polygon n9 = new Polygon(x9,y9,4);
    public static ArrayList<Polygon> hitBoxes= new ArrayList<>();
    static Rectangle hitB = new Rectangle(Mario.x,Mario.y,32,32);
    static Rectangle hitBo = new Rectangle(Barrel.x,Barrel.y,32,32);

    public static Image barrelRoll = Toolkit.getDefaultToolkit().getImage("barrelRoll.png");
    public static Image marioLookRight = Toolkit.getDefaultToolkit().getImage("marioLookRight.png");
    public static Image marioLookLeft = Toolkit.getDefaultToolkit().getImage("marioLookLeft.png");
    public static Image marioRunRight1 = Toolkit.getDefaultToolkit().getImage("marioRunRight1.png");
    public static Image marioRunRight2 = Toolkit.getDefaultToolkit().getImage("marioRunRight2.png");
    public static Image marioRunLeft1 = Toolkit.getDefaultToolkit().getImage("marioRunLeft1.png");
    public static Image marioRunLeft2 = Toolkit.getDefaultToolkit().getImage("marioRunLeft2.png");
    public static Image currentAnimation;
    public boolean first = true;
    public background(){
        new Thread(this).start();
    }
    public void paintComponent(Graphics window){
        Graphics2D g2 = (Graphics2D) window;
        g2.fillRect(Mario.x,Mario.y,33,33);
        g2.fillPolygon(n1);
        g2.fillPolygon(n2);
        g2.fillPolygon(n3);
        g2.fillPolygon(n4);
        g2.fillPolygon(n5);
        g2.fillPolygon(n6);
        g2.fillPolygon(n7);
        g2.fillPolygon(n8);
        g2.fillPolygon(n9);
        hitB = new Rectangle(Mario.x,Mario.y,37,37);
        Image img1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\s866250\\IdeaProjects\\Donkey Kong\\donkeyStage.png"); /*the image cannot be in the SRC folder*/
        g2.drawImage(img1, 0 , 0 , 525 , 700 , this);
        g2.drawImage(currentAnimation, Mario.x, Mario.y,32,32,this);
        g2.drawImage(barrelRoll, Barrel.x , Barrel.y , 32 , 32 , this);
        window.setColor(Color.WHITE);
        //window.drawString("Mouse  coordinates " + "(" + MouseInfo.getPointerInfo().getLocation().x + "   " + MouseInfo.getPointerInfo().getLocation().y + ")", 250, 30 );
        window.setColor(Color.red);
        first = false;
    }
    public void run()
    {

        try
        {
            while( true )
            {

                if(Mario.isIntersecting(hitBoxes) ){
                    Mario.y -= 1;
                    Mario.ran = true;
                }
                if(! Mario.isIntersecting(hitBoxes) ){
                    Mario.y+=1;

                }
                if(!Barrel.isIntersecting(hitBoxes)){
                    Barrel.y+=1;
                }


                sleep(20);
                repaint();
            }
        }
        catch( Exception e )
        {

        }

    }







    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}
