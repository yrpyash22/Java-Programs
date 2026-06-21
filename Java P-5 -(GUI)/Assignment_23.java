






//------------------------------    KeyListener -------------------------------//
/*
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame implements KeyListener
{
    JLabel lab;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        lab = new JLabel();
        lab.setBounds(0,0,100,100);
        lab.setBackground(Color.red);
        lab.setOpaque(true);
        
        this.add(lab);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar())
        {
            case 'a' :lab.setLocation(lab.getX()-10, lab.getY());
                break;
            case 'w' :lab.setLocation(lab.getX(), lab.getY()-10);
                break;
            case 's' :lab.setLocation(lab.getX(), lab.getY()+10);
                break;
            case 'd' :lab.setLocation(lab.getX()+10, lab.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode())
        {
            case 37 :lab.setLocation(lab.getX()-10, lab.getY());
                break;
            case 38 :lab.setLocation(lab.getX(), lab.getY()-10);
                break;
            case 40 :lab.setLocation(lab.getX(), lab.getY()+10);
                break;
            case 39 :lab.setLocation(lab.getX()+10, lab.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You relesed Code : "+ e.getKeyCode());
        System.out.println("You relesed Char : "+ e.getKeyChar());
    }
}
public class Assignment_23 {
    public static void main(String[] args) {
        new MyFrame();
    }
}*/








//------------------------------    MouseListener -----------------------------//
/*
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame implements MouseListener
{
    JLabel lab;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        lab = new JLabel();
        lab.setBounds(0,0,100,100);
        lab.setBackground(Color.red);
        lab.setOpaque(true);

        lab.addMouseListener(this);
        this.add(lab);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You click the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
       System.out.println("You Press the mouse");
       lab.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You Relesed the mouse");
        lab.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You Enter the mouse");
        lab.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You Exit the mouse");
        lab.setBackground(Color.black);

    }
}
public class Assignment_23 {
    public static void main(String[] args) {
        new MyFrame();
    }
}*/










//------------------------------    Key Bindings -------------------------------//
/*
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Game
{
    JFrame frame;
    JLabel label;
    UpAction upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Game()
    {
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);
        }
    }
    public class DownAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }
    }
    public class RightAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }
    }
}
public class Assignment_23 {

    public static void main(String[] args) {
        new Game();
    }
}*/












//------------------------------   2D Graphic -------------------------------//
/*
import javax.swing.*;
import java.awt.*;
class MyPanel extends JPanel
{
    MyPanel()
    {
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.blue);

        g2D.drawLine(0, 0, 500, 500);
        g2D.setPaint(Color.pink);

        g2D.drawRect(0, 0, 100, 50);

        g2D.fillRect(0, 0, 100, 50);

        g2D.drawOval(100, 100, 50, 50);
        g2D.fillOval(100, 100, 50, 50);
        
    }
}
class MyFrame extends JFrame
{
    MyPanel panel;
    MyFrame()
    {
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

public class Assignment_23 {
    public static void main(String[] args) {
        new MyFrame();
    }
}*/










// ---------------------  2D Animation ----------------------------// 
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPanel extends JPanel implements ActionListener
{
    final int Panal_Width = 500;
    final int Panal_Height = 500;
    Image enemy;
    Image background;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    MyPanel()
    {
        this.setPreferredSize(new Dimension(Panal_Width ,Panal_Height ));
        this.setBackground(Color.black);
        enemy = new ImageIcon("Screenshot 2025-10-21 162437.png").getImage();
        timer = new Timer(2, this);
        timer.start();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(enemy, x,y, null);

    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(x>Panal_Width - enemy.getWidth(null) || x < 0)
        {
            xVelocity = xVelocity * -1;
        }
        if(y>Panal_Height - enemy.getHeight(null) || y < 0)
        {
            yVelocity = yVelocity * -1;
        }
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
    }
}
class MyFrame extends JFrame
{
    MyPanel panel;
    MyFrame()
    {
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
public class Assignment_23 {
    public static void main(String[] args) {
        new MyFrame();
    }
}
*/