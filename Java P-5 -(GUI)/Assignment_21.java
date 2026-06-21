
// ==================    GUI -- > Graphic User Interface




//        JFrame 
/*
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;


class MyFrame extends JFrame
{
    MyFrame()
    {
        this.setTitle("Jframe title gose here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setVisible(true);
        

        ImageIcon imgI = new ImageIcon("Screenshot 2025-10-21 162437.png");
        this.setIconImage(imgI.getImage());
        this.setContentPane(rootPane);
        this.setBackground(new Color(255,255,154));
        this.setForeground(Color.BLACK);
        
    }
}
public class Assignment_21 {

    public static void main(String[] args) {
        new  MyFrame();
    }
}*/











//       Label
/*
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class MyLabel extends JFrame {
    MyLabel() {

        JLabel lab = new JLabel("HI I am bro");
        lab.setText("MY name is YRP");
        lab.setForeground(new Color(0x00FF00));
        lab.setFont(new Font("MV Boli", Font.PLAIN, 20));

        lab.setIconTextGap(25);
        lab.setBackground(Color.black);
        lab.setOpaque(true);
        lab.getHorizontalTextPosition();
        lab.getVerticalTextPosition();



        ImageIcon img = new ImageIcon("Screenshot 2025-10-21 162437.png");
        lab.setIcon(img);




        Border bd = BorderFactory.createLineBorder(Color.GREEN, 3);
        lab.setBorder(bd);
        lab.setVerticalAlignment(JLabel.CENTER);
        lab.setHorizontalAlignment(JLabel.CENTER);
        lab.setBounds(100,100,250,250);




    
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(lab);
        //frame.setLayout(null);
        frame.setVisible(true);
    }

}

public class Assignment_21 {

    public static void main(String[] args) {
        new MyLabel();
    }
}*/








//    JPanel
/*
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyPanal extends JFrame
{
    MyPanal()
    {
        JPanel redP = new JPanel();
        redP.setBackground(Color.red);
        redP.setBounds(0,0, 250, 250);
        JPanel  blueP = new JPanel();
        blueP.setBackground(Color.blue);
        blueP.setBounds(250,0, 250, 250);
        // blueP.setLayout(null);

        JPanel  greenP = new JPanel();
        greenP.setBackground(Color.green);
        greenP.setBounds(0,250, 500, 250);
        // greenP.setLayout(null);


        JLabel lab = new JLabel(" HII");
        lab.setForeground(new Color(0x00FF00));
        lab.setFont(new Font("MV Boli", Font.PLAIN, 20));
        

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.add(redP);
        redP.add(lab);
        frame.add(blueP);
        frame.add(greenP);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
public class Assignment_21 {

    public static void main(String[] args) {
        new MyPanal();
    }
    
}*/








// Botton
/*
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyButton extends JFrame implements ActionListener
{
    JButton btn1;
    JLabel lab;
    MyButton()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);

        ImageIcon icon1 = new ImageIcon("Screenshot 2025-10-21 162437.png");
        ImageIcon icon2 = new ImageIcon("Screenshot 2025-10-21 162437.png");
        lab = new JLabel();
        lab.setIcon(icon2);
        lab.setBounds(150,250,150,150);
        lab.setVisible(false);

        btn1 = new JButton();
        btn1.setBounds(100,100,250,100);
        btn1.addActionListener(this);
        btn1.setText("Ia am a button");
        btn1.setIcon(icon1);
        btn1.setFont(new Font("MV Boli", Font.PLAIN, 20));
        btn1.setIconTextGap(-15);
        btn1.setForeground(Color.blue);
        btn1.setBackground(Color.red);
        btn1.setBorder(BorderFactory.createEtchedBorder());
        frame.add(btn1);
        frame.add(lab);

        
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1)
        {
            System.out.println("POO");
            //btn1.setEnabled(false);
            lab.setVisible(true);
        }
    }
}

public class Assignment_21 {
    public static void main(String[] args) {
        new MyButton();
    }
}*/







//---------------------------    Layout Manager   ----------------------------------//
/*
//[ 1 ] BorderLayout

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BorderLayout1 extends JFrame
{
    BorderLayout1()
    {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(new BorderLayout(10,10));   // Parimeter is gap betweeen layout 10px
        f.setVisible(true);
        

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        p1.setBackground(Color.red);
        p2.setBackground(Color.green);
        p3.setBackground(Color.yellow);
        p4.setBackground(Color.magenta);
        p5.setBackground(Color.blue);

        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.WEST);
        f.add(p3, BorderLayout.SOUTH);
        f.add(p4, BorderLayout.EAST);
        f.add(p5, BorderLayout.CENTER);
    }
}

// [ 2 ] Flow Layout
class FlowLayout1 extends JFrame
{
    FlowLayout1()
    {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));   // Parimeter is gap betweeen layout 10px
        f.setVisible(true);

        JPanel p1 = new JPanel();
        p1.setPreferredSize(new Dimension(100, 250));
        p1.setForeground(Color.LIGHT_GRAY);
        p1.setLayout(new FlowLayout());

        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p1.add(new JButton("4"));
        p1.add(new JButton("5"));
        p1.add(new JButton("6"));
        p1.add(new JButton("7"));
        p1.add(new JButton("8"));
        p1.add(new JButton("9"));
        f.add(p1);
    }
    
}

// [ 3] Grid Layout
class GridLayour1 extends JFrame
{
    GridLayour1()
    {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(new GridLayout(3,3,10,10)); 
        f.setVisible(true);

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));

    }
}

public class Assignment_21 {

    public static void main(String[] args) {
        new BorderLayout1();
        new FlowLayout1();
        new GridLayour1();
    }
}*/










// JlayeredPlane
/*
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

class JlayeredPlane1 extends JFrame
{
    JlayeredPlane1()
    {
        JFrame f = new JFrame();
        f.setSize(700, 700);
        f.setLayout(null); 
        f.setVisible(true);

        JLabel lab1 = new JLabel();
        JLabel lab2 = new JLabel();
        JLabel lab3 = new JLabel();
        lab1.setOpaque(true);
        lab2.setOpaque(true);
        lab3.setOpaque(true);
        lab1.setBackground(Color.RED);
        lab2.setBackground(Color.blue);
        lab3.setBackground(Color.green);
        lab1.setBounds(50,50,200,200);
        lab2.setBounds(100,100,200,200);
        lab3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(lab1, Integer.valueOf(8));   // red
        layeredPane.add(lab2, Integer.valueOf(2));   // blue
        layeredPane.add(lab3, Integer.valueOf(1));   // green 

        f.add(layeredPane);

    }
}
public class Assignment_21 {

    public static void main(String[] args) {
        new JlayeredPlane1();
    }
}*/







// one to another class shift 
// one page to another pages shift
/*
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class NewWindow extends JFrame
{
    JFrame f = new JFrame();
    JLabel lab = new JLabel("This is new window");
    NewWindow()
    {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420,420);
        f.setLayout(null);
        f.setVisible(true);
        lab.setBounds(0,0,100,100);
        lab.setFont(new Font("MV Boli", Font.PLAIN, 15));
        f.add(lab);
    }
}
class LaunchPage implements ActionListener
{
    JFrame f = new JFrame();
    JButton btn = new JButton("New Window");

    LaunchPage()
    {
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(420,420);
        btn.setBounds(100,100,200,40);
        btn.setFocusable(false);
        btn.addActionListener(this);
        f.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn)
        {
            f.dispose();        // for close prev window
            NewWindow myNewWindow = new NewWindow();
        }
    }
    
}

public class Assignment_21 {

    public static void main(String[] args) {
        LaunchPage lauch = new LaunchPage();
    }
}*/