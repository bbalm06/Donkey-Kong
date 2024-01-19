import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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
    public static int[] y8 = {255,233,233,255};
    public static Polygon n8 = new Polygon(x8,y8,4);
    public static int[] x9 = {315,315,205,205};
    public static int[] y9 = {175,155,155,175};
    public static Polygon n9 = new Polygon(x9,y9,4);
    public static ArrayList<Polygon> hitBoxes= new ArrayList<>();
    static Rectangle hitB = new Rectangle(Mario.x,Mario.y,32,32);
    static Rectangle hitBo = new Rectangle(Barrel.x,Barrel.y,32,32);

    public static Image marioLookRight = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bbalm\\IdeaProjects\\Donkey Kong\\marioLookRight.png");
    public static Image marioLookLeft = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bbalm\\IdeaProjects\\Donkey Kong\\marioLookLeft.png");
    public static Image marioRunRight1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bbalm\\IdeaProjects\\Donkey Kong\\marioRunRight1.png");
    public static Image marioRunRight2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bbalm\\IdeaProjects\\Donkey Kong\\marioRunRight2.png");
    public static Image marioRunLeft1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bbalm\\IdeaProjects\\Donkey Kong\\marioRunLeft1.png");
    public static Image marioRunLeft2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bbalm\\IdeaProjects\\Donkey Kong\\marioRunLeft2.png");
    public static Image currentAnimation;

    public static int[] lX1 = {431-5,450+5,450+5,431-5};
    public static int[] lY1 = {645-45,645-45,683-20,683-20};
    public static Polygon LAD1 = new Polygon(lX1,lY1,4);
    public static int[] lX2 = {225-5,245+5,245-5,225+5};
    public static int[] lY2 = {545-46,545-46,605-20,605-20};
    public static Polygon LAD2 = new Polygon(lX2,lY2,4);

    public static int[] lX3 = {75-5,94+5,94+5,75-5};
    public static int[] lY3 = {555-46,555-46,595-20,595-20};
    public static Polygon LAD3 = new Polygon(lX3,lY3,4);

    public static int[] lX4 = {75-5,94+5,94+5,75-5};
    public static int[] lY4 = {555-45,555-45,595-20,595-20};
    public static Polygon LAD4 = new Polygon(lX4,lY4,4);

    public static int[] lX5 = {263-5,280+5,280+5,263-5};
    public static int[] lY5 = {453-45,453-45,514-20,514-20};
    public static Polygon LAD5 = new Polygon(lX5,lY5,4);
    public static int[] lX6 = {430+5,450-5,450-5,430+5};
    public static int[] lY6 = {462-45,462-45,500-20,500-20};
    public static Polygon LAD6 = new Polygon(lX6,lY6,4);
    public static int[] lX7 = {168+2-5,184+2+5,184+2+5,168+2-5};
    public static int[] lY7 = {369-45,369-45,420-20,420-20};
    public static Polygon LAD7 = new Polygon(lX7,lY7,4);
    public static int[] lX8 = {76-5,92+5,92+5,76-5};
    public static int[] lY8 = {374-45,374-45,410-20,410-20};
    public static Polygon LAD8 = new Polygon(lX8,lY8,4);
    public static int[] lX9 = {433-5,448+5,448+5,433-5};
    public static int[] lY9 = {285-45,285-45,322-20,322-20};
    public static Polygon LAD9 = new Polygon(lX9,lY9,4);

    public static ArrayList<Polygon> ladderHitBoxes;
    public background(){
        new Thread(this).start();
    }
    public void paintComponent(Graphics window){
        Graphics2D g2 = (Graphics2D) window;
        g2.fillRect(Mario.x,Mario.y,33,33);
//        g2.fillPolygon(n1);
//        g2.fillPolygon(n2);
//        g2.fillPolygon(n3);
//        g2.fillPolygon(n4);
//        g2.fillPolygon(n5);
//        g2.fillPolygon(n6);
//        g2.fillPolygon(n7);
//        g2.fillPolygon(n8);
//        g2.fillPolygon(n9);
//        g2.fillPolygon(LAD1);
//        g2.fillPolygon(LAD2);
//        g2.fillPolygon(LAD3);
//        g2.fillPolygon(LAD4);
//        g2.fillPolygon(LAD5);
//        g2.fillPolygon(LAD6);
//        g2.fillPolygon(LAD7);
//        g2.fillPolygon(LAD8);
        //g2.fillPolygon(LAD9);


        hitB = new Rectangle(Mario.x,Mario.y,37,37);
        hitBo = new Rectangle(Barrel.x,Barrel.y,37,37);
        Image img1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bbalm\\IdeaProjects\\Donkey Kong\\donkeyStage (1).png"); /*the image cannot be in the SRC folder*/
        g2.drawImage(img1, 0 , 0 , 525 , 700 , this);
        g2.drawImage(currentAnimation, Mario.x, Mario.y,32,32,this);
        window.setColor(Color.WHITE);
        //window.drawString("Mouse  coordinates " + "(" + MouseInfo.getPointerInfo().getLocation().x + "   " + MouseInfo.getPointerInfo().getLocation().y + ")", 250, 30 );
        window.setColor(Color.red);
        g2.fillPolygon(LAD9);
        //first = false;
    }

    public static int smallest(int[] x){
        int smol  = 88888;
        for(int y : x){
            if(y<smol){
                smol = y;
            }
        }
        return smol;
    }
    public void run()
    {

        try
        {
            while( true )
            {

                if(Mario.isIntersecting(hitBoxes) ){
                    if(Mario.y > smallest(Mario.colliding.ypoints)){
                        System.out.println(smallest(Mario.colliding.ypoints) + " " + Mario.y);
                        Mario.y +=2;
                    }
                    Barrel.move();
                    else{
                        Mario.y -= 1;
                    }

                    if(Mario.isClimbing(background.ladderHitBoxes)){
                        Mario.y-=3;
                    }
                }
                if(! Mario.isIntersecting(hitBoxes) ){
                    Mario.y+=1;
                    Barrel.move();
                }
                if(! Barrel.isIntersecting(hitBoxes)){
                    Barrel.y+=1;
                    Barrel.move();
                }





                sleep(15);
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
