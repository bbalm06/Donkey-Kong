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

public class Barrel extends JPanel implements Runnable
{
    public static Polygon colliding;
    public static int dx;
    public static int dy;
    public static int x= 163;
    public static int y= 198;
    public static boolean Facing = true; //True = Right, False = Left
    public static boolean move = false;
    public static boolean isTouching =true;

    public static boolean isIntersecting(ArrayList<Polygon> hit) {
        for (Polygon x : hit) {
            if (x.intersects(background.hitBo)) {
                isTouching = true;
                colliding = x;
                y+=1; //CHECK AT HOME HELP
                return true;
            }
        }
        isTouching = false;
        //System.out.println("FALSE");
        return false;
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
    public void run(){

    }
}
