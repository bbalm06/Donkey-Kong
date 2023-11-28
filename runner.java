import javax.swing.*;
import java.awt.event.WindowListener;

public class runner {

    public void create(){
        JFrame window = new JFrame("Dongay Kong");
        window.setSize(4*(250),3*(250));
        //window.addWindowListener();
        window.setVisible(true);
    }
    public static void main(String[] args){
        runner run = new runner();
        run.create();
    }
}
