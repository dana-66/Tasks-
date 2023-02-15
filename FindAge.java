package Tasks;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FindAge {
    public static void main(String[] args){
        JFrame af = new JFrame("Find age");
        af.setLayout(new FlowLayout());
        JLabel ta = new JLabel();
        ta.setText("age : ");
        af.add(ta);
        JTextField tx = new JTextField();
        tx.setColumns(2);
        af.add(tx);
        JRadioButton add = new JRadioButton("add");
        JRadioButton sub = new JRadioButton("sub");
        ButtonGroup bg = new ButtonGroup(); 
        bg.add(add);
        bg.add(sub);
         af.add(add);
         af.add(sub);
         
        JComboBox jb =new JComboBox();
        jb.addItem(1);
        jb.addItem(2);
        jb.addItem(4);
        af.add(jb);
        
        JButton b1 = new JButton("compute");
        JButton b2 = new JButton(" Exit ");
        af.add(b1);
        af.add(b2);
    af.setVisible(true);
        af.setBounds(600,450,660,150);
        af.setResizable(false);
        af.pack();

    }}
