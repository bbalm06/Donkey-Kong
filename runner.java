import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.util.ArrayList;
import javax.swing.JFrame;

import static java.lang.Thread.sleep;

public class runner extends JFrame implements KeyListener {

    public static final int ScreenWidth =525; //(175)*3;
    public static final int ScreenLength=737; //(175)*4;

    public runner(){
        super("Dongay Kong");
        setSize(ScreenWidth,ScreenLength);
        setLocationRelativeTo(null);
        addKeyListener( this);
        // window.addWindowListener();
        add(new background());
        //add(new Mario());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Mario.key = "NO KEY PRESSED YET";

        Mario.keys_typed = "";
        background.hitBoxes.add(background.n1);
        background.hitBoxes.add(background.n2);
        background.hitBoxes.add(background.n3);
        background.hitBoxes.add(background.n4);
        background.hitBoxes.add(background.n5);
        background.hitBoxes.add(background.n6);
        background.hitBoxes.add(background.n7);
        background.hitBoxes.add(background.n8);
        background.hitBoxes.add(background.n9);

        /*all keyListeners must have this in the constructor*/

        setFocusable( true );


    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            Mario.dx = -1;
            Mario.move = true;
            Mario.move();
        }

        else if (key == KeyEvent.VK_RIGHT) {
            Mario.dx = 1;
            Mario.move = true;
            Mario.move();
        }

        else if (key == KeyEvent.VK_UP) {
            Mario.dy= -1;
            Mario.move = true;
            Mario.move();
        }

        else if (key == KeyEvent.VK_DOWN) {
            Mario.dy = 1;
            Mario.move = true;
            Mario.move();
        }
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            Mario.dx = 0;
            Mario.move = false;
        }

        if (key == KeyEvent.VK_RIGHT) {
            Mario.dx = 0;
            Mario.move = false;
        }

        if (key == KeyEvent.VK_UP) {
            Mario.dy = 0;
            Mario.move = false;
        }

        if (key == KeyEvent.VK_DOWN) {
            Mario.dy = 0;
            Mario.move = false;
        }
    }
    public static boolean isIntersecting(ArrayList<Polygon> hit){
        for(Polygon x : hit){
            if( x.intersects(background.hitB)){
                System.out.println("TRUE");
                Mario.colliding = x;
                return true;
            }
        }
        System.out.println("FALSE");
        return false;
    }
    public void keyTyped(KeyEvent e)
    {
        Mario.keys_typed += "" + e.getKeyChar();
        repaint();
    }


    public static void main(String[] args) {
        runner run = new runner();
    }
}
