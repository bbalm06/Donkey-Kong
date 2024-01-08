import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Timer;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Mario extends JPanel {
    public static Polygon colliding;

    public static String keys_typed;
    public static String key;
    public static int dx;
    public static int dy;
    public static int speed = 4;
    public static int gravity = 2;
    public static int x = 12;
    public static int y = 625;
    public static boolean move = false;

    public static int Mwidth = 32;
    public static int Mheight = 30;





    public Mario() {

    }
    public static void move() {

            if (wall()) {

            }
            else if(isIntersecting(background.hitBoxes)){
                System.out.println(colliding.getBounds());
            }
            else {
                x += dx;
                y += dy;
            }
            //y += gravity;}
//        if (isIntersecting(background.hitBoxes)) {
//            System.out.println("HAP");
//            wall();
//            x += -dx * speed;
//            y += -dy * speed*1.5;
//                    //y += gravity;}
//            }

    }
    public static boolean isIntersecting(ArrayList<Polygon> hit){
        for(Polygon x : hit){
            if( x.intersects(background.hitB)){
                System.out.println("TRUE");
                colliding = x;
                return true;
            }
        }
        //System.out.println("FALSE");
        return false;
    }

    public static boolean checkPoint(int[] x, int point){
        for(int y : x){
            if(y == point){
                System.out.println(Arrays.toString(x));
                System.out.println("TRUE");
                return true;
            }
        }
        System.out.println("FALSE");
        return false;
    }
    public static boolean wall(){
        if (x + dx < 0) {
            x += -dx;
            return true;
        }
        if (x + dx > runner.ScreenWidth - 50) {
            x += -dx;
            return true;
        }
        if (y + dy < 0) {
            y += -dy;
            return true;
        }
        if (y + dy > runner.ScreenLength - 74) {
            y += -dy;
            return true;
        }
        return false;
    }



    public void run()
    {

        try
        {
            while( true )
            {
                sleep(10);
                //repaint();
            }
        }
        catch( Exception e )
        {

        }

    }


}
