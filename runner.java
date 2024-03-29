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
        background.ladderHitBoxes = new ArrayList<>();
        background.hitBoxes.add(background.n1);
        background.hitBoxes.add(background.n2);
        background.hitBoxes.add(background.n3);
        background.hitBoxes.add(background.n4);
        background.hitBoxes.add(background.n5);
        background.hitBoxes.add(background.n6);
        background.hitBoxes.add(background.n7);
        background.hitBoxes.add(background.n8);
        background.hitBoxes.add(background.n9);
        background.ladderHitBoxes.add(background.LAD1);
        background.ladderHitBoxes.add(background.LAD2);
        background.ladderHitBoxes.add(background.LAD3);
        background.ladderHitBoxes.add(background.LAD4);
        background.ladderHitBoxes.add(background.LAD5);
        background.ladderHitBoxes.add(background.LAD6);
        background.ladderHitBoxes.add(background.LAD7);
        background.ladderHitBoxes.add(background.LAD8);
        background.ladderHitBoxes.add(background.LAD9);

        /*all keyListeners must have this in the constructor*/

        setFocusable( true );


    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            Mario.isRunning = true;
            Mario.dx = -1;
            Mario.Facing = false;
            Mario.move();
            background.currentAnimation = background.marioLookLeft;

        }
//        if(key == KeyEvent.VK_SPACE){
//            if(Mario.isClimbing(background.ladderHitBoxes)) {
//                while (Mario.isClimbing(background.ladderHitBoxes)) {
//                    Mario.y += 3;
//                    repaint();
//                }
//            }
//        }

         if (key == KeyEvent.VK_RIGHT) {
             Mario.isRunning = true;
             Mario.dx = 1;
             Mario.Facing = true;
            Mario.move();
            background.currentAnimation = background.marioLookRight;

        }

         if (key == KeyEvent.VK_UP) {
            Mario.dy= -1;
            Mario.jump();
        }
         if (key == KeyEvent.VK_DOWN) {
            Mario.dy = 1;
            Mario.move = true;
            Mario.move();
        }
        repaint();
        Mario.isRunning = false;
        Mario.climbing = false;
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

    public void keyTyped(KeyEvent e)
    {
        Mario.keys_typed += "" + e.getKeyChar();
        repaint();
    }


    public static void main(String[] args) {
        runner run = new runner();
    }
}
