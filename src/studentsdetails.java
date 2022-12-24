import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class studentsdetails implements ActionListener
{
    JButton button;
    JPanel panel;
    JFrame frame;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,txt2,txt3,txt4,txt5;
    JTextField txt1;
    JComboBox ComboBox;
    JCheckBox ch1,ch2,ch3;
    JRadioButton rb1,rb2;
    ButtonGroup G1;
    //ImageIcon image1;

    
    public studentsdetails()
    {
        
        //FRAME AND PANEL!!!!
        
               
        G1 = new ButtonGroup(); 
        panel = new JPanel();
        frame = new JFrame("STUDENT REGISTRATION");
        frame.setSize(500,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);  
        
        panel.setLayout(null);
        
        //LABELS!!!!!
        
        label1 = new JLabel("NAME");
        label1.setBounds(10, 20, 80, 25);
        panel.add(label1);
        
        label2 = new JLabel("YEAR OF STUDY");
        label2.setBounds(10, 50, 150, 25);
        panel.add(label2);
        
        label3 = new JLabel("GENDER");
        label3.setBounds(10, 80, 80, 25);
        panel.add(label3);
        
        label4 = new JLabel("SELECT TWO UNITS");
        label4.setBounds(150, 100, 200, 25);
        panel.add(label4);
        
        label5 = new JLabel("DISPLAY INFORMATION");
        label5.setBounds(150, 200, 200, 25);
        panel.add(label5);
        
        label6 = new JLabel("NAME                     :");
        label6.setBounds(10, 220, 150, 25);
        panel.add(label6);
        
        label7 = new JLabel("YEAR OF STUDY  :");
        label7.setBounds(10, 240, 150, 25);
        panel.add(label7);
        
        label8 = new JLabel("GENDER                :");
        label8.setBounds(10, 260, 150, 25);
        panel.add(label8);
        
        label9 = new JLabel("UNITS                     :");
        label9.setBounds(10, 280, 150, 25);
        panel.add(label9);
        
        //COMBOBUTTON!!!!
        
        String years[]= {"2021/22","2022/23","2023/24","2024/25","2025/26"};
        ComboBox=new JComboBox(years);
        ComboBox.setBounds(150, 50, 100, 25);
        panel.add(ComboBox);
      
        //RADIOBUTTONS!!!!
        
        rb1=new JRadioButton();
        rb1.setText("MALE");
        rb1.setBounds(150, 80, 80, 25);
        panel.add(rb1);
        G1.add(rb1);
        
        rb2=new JRadioButton();
        rb2.setText("FEMALE");
        rb2.setBounds(250, 80, 80, 25);
        panel.add(rb2);
        G1.add(rb2);
       
        //CHECKBOXES!!
        
        ch1=new JCheckBox("SCO 200");
        ch1.setBounds(150, 120, 80, 25);
        panel.add(ch1);
        
        ch2=new JCheckBox("SCO 201");
        ch2.setBounds(150, 140, 80, 25);
        panel.add(ch2);
        
        ch3=new JCheckBox("SCO 202");
        ch3.setBounds(150, 160, 80, 25);
        panel.add(ch3);
        
        //TEXTFIELDS!!!!
        
        txt1 = new JTextField();
        txt1.setBounds(150, 20, 180, 25);
        panel.add(txt1);
        
        txt2 = new JLabel();
        txt2.setBounds(150, 220, 250, 20);
        panel.add(txt2);
        
        txt3 = new JLabel();
        txt3.setBounds(150, 240, 250, 20);
        panel.add(txt3);
        
        txt4 = new JLabel();
        txt4.setBounds(150, 260, 250, 20);
        panel.add(txt4);
        
        txt5 = new JLabel();
        txt5.setBounds(150, 280, 250, 20);
        panel.add(txt5);
        
        //BUTTON!!
        
        button = new JButton("SUBMIT");
        button.setBounds(250, 180, 100, 25);
        panel.add(button);
        button.addActionListener(this);
        
        frame.setVisible(true);
         
    }
   
    
    
    public static void main(String args[])
    {
        new studentsdetails();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //name
        String x =txt1.getText();
        txt2.setText(x);
        
        //year of study
        String y= ComboBox.getSelectedItem().toString();
        txt3.setText(y);
       
        
        //gender
        String gender=" ";
        if (rb1.isSelected())
        {
            gender="MALE";
        }
        else if (rb2.isSelected())
        {
            gender="FEMALE";
        }
        txt4.setText(gender);
        
        
        
        //UNITS
        String units= " ";
        if (ch1.isSelected() || ch2.isSelected() || ch3.isSelected())
        {
            units="PLEASE CHOOSE ONE MORE UNIT";
        }
        
        if (ch1.isSelected() && ch2.isSelected() && ch3.isSelected())
        {
            units="PLEASE CHOOSE ONLY TWO UNITS";
        }
             
        else if (ch1.isSelected() && ch2.isSelected())
        {
            units="SCO 200 AND SCO 201";
        }
        else if (ch1.isSelected() && ch3.isSelected())
        {
            units="SCO 200 AND SCO 202";
        }
        else if (ch2.isSelected() && ch3.isSelected())
        {
            units="SCO 201 AND SCO 202";
        }
        txt5.setText(units);     
              
        
    }
    }
