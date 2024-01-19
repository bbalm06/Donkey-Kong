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

public class Mario extends JPanel implements Runnable {
    public static Polygon colliding;
    public static boolean ran = false;

    public static String keys_typed;
    public static String key;
    public static int dx;
    public static int dy;
    public static int x = 12;
    public static int y = 625;
    public static boolean move = false;
    public static boolean isTouching =true;

    public static boolean isRunning = false;
    public static int Mwidth = 32;
    public static int Mheight = 30;

    public static int runInterval = 0;

    public static boolean Facing = true; //True = Right, False = Left
    public static boolean climbing = false;


    public Mario() {
    }

    public static void move() {

        if (wall()) {
            x -= dx*2;
        } else {
            x += dx*5;
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
    public static void jump(){
        isTouching = true;
        y-=25;
    }

    public static boolean isIntersecting(ArrayList<Polygon> hit) {
        for (Polygon x : hit) {
            if (x.intersects(background.hitB)) {
                isTouching = true;
                colliding = x;
                return true;
            }
        }
        isTouching = false;
        //System.out.println("FALSE");
        return false;
    }

    public static boolean isClimbing(ArrayList<Polygon> hit){
        for(Polygon x : hit){
            if(x.intersects(background.hitB)){
                return true;
            }
        }
        return false;
    }

    public static boolean wall() {
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
                //Thread.sleep(50);
                //repaint();
            }
        }
        catch( Exception e )
        {

        }

    }
}



