



//------------------    JTextField      ---------------------------//
/* 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JTextField1 extends JFrame implements ActionListener
{
    JButton btn;
    JTextField textField;
    JTextField1()
    {
        JFrame f = new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        f.setVisible(true);

        btn = new JButton("Sumbit");
        btn.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00ff00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.pink);
        textField.setText("Usernmae");
        //textField.setEditable(false);

        this.add(btn);
        this.add(textField);
        
        this.pack();
        this.setVisible(true);
    } 

     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn)
        {
            System.out.println("Welcome " + textField.getText());
            btn.setEnabled(false);
            textField.setEditable(false);
        }
    } 
}
public class Assignment_22 {
    public static void main(String[] args) {
      new JTextField1();
    }
}
*/








//  ---------------------   JCheckBox -------------------------//
/*
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener
{
     JButton button;
     JCheckBox checkBox;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        button = new JButton();
        button.setText("Sumbit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consols", Font.PLAIN , 35));

        this.add(checkBox);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
           System.out.println(checkBox.isSelected());
        }
    }
}
public class Assignment_22 {
    public static void main(String[] args) {
      new MyFrame();
    }
}
*/








//   -------------------------  JRadioButton -------------------------------//









//  -----------------------   JComboBox   ---------------------------------// 









//  ------------------------ JSlider ---------------------------------------//







//  ------------------------    JProgress bar ----------------------------//
/*
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

class MyFrame extends JFrame
{
    JFrame f = new JFrame();
    JProgressBar bar = new JProgressBar(0 , 100);
    
    MyFrame()
    {
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Mv Boil", Font.BOLD, 25));
        bar.setBackground(Color.gray);
        bar.setForeground(Color.red);   

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(420,420);
        f.add(bar);
        f.setLayout(null);
        f.setVisible(true);
        fill();
    }
    public void fill()
    {
        int count = 100;
        while (count>=0) {
            bar.setValue(count);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            count--;
        }
        bar.setString("Done :)");
    }

}
public class Assignment_22 {
public static void main(String[] args) {
    new MyFrame();
}
}
*/






// ----------------------- Meanuebar =================================//
/* 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MyFrame extends JFrame implements ActionListener
{
    JMenuBar menuB;
    JMenu film;
    JMenu editm;
    JMenu helpm ;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
    
        menuB = new JMenuBar();

        film = new JMenu("File");
        editm = new JMenu("Edit");
        helpm = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        film.add(loadItem);
        film.add(saveItem);
        film.add(exitItem);

        menuB.add(film);
        menuB.add(editm);
        menuB.add(helpm);
        this.add(menuB);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == loadItem )
        {
            System.out.println("beep booop you load a file");
        }
        if(e.getSource() == saveItem )
        {
            System.out.println("beep booop you save a file");
        }
        if(e.getSource() == exitItem )
        {
            System.out.println("beep booop you exit a file");
        }
    }
    
}
public class Assignment_22 {
    public static void main(String[] args) {
      new MyFrame();
    }
}*/







//-----------------------   select a File    --------------------------------//
/*
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener
{
    JButton btn ;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        btn = new JButton("Select a file");
        btn.addActionListener(this); 
        this.add(btn);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fChooser = new JFileChooser();
        //fChooser.showOpenDialog(null);  // select file to open
        //System.out.println(fChooser.showOpenDialog(null));
        int responce = fChooser.showOpenDialog(null);
        int responce2 = fChooser.showSaveDialog(null);   // Select file to save
        if(responce == JFileChooser.APPROVE_OPTION)
        {
            File file = new File(fChooser.getSelectedFile().getAbsolutePath());
            System.out.println(file);
        }
    }
}

public class Assignment_22 {
    public static void main(String[] args) {
        new MyFrame();
    }
}*/








// ---------------------- coller Chooser ----------------//
/* 
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame implements ActionListener
{
    JLabel lab ;
    JButton btn;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        btn = new JButton("select a color");
        btn.addActionListener(this);

        lab = new JLabel();
        lab.setBackground(Color.white);
        lab.setText("This is some text :D");
        lab.setFont(new Font("Mv Boli", Font.PLAIN, 100));
        lab.setOpaque(true);

        this.add(btn);
        this.add(lab);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn)
        {
            JColorChooser colorChooser = new JColorChooser();
            Color col = JColorChooser.showDialog(null,  "Pick a color....I guess", Color.black);
            //lab.setForeground(col);
            lab.setBackground(col);
        }
    }
}
public class Assignment_22 {
    public static void main(String[] args) {
        new MyFrame();
    }
}
*/






