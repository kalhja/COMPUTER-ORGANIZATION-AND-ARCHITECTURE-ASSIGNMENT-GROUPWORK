import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Conversions extends JFrame implements ActionListener {
    JLabel LBin,LDec,LHex; //labels for binary,decimal,octal, Hexadecimal.
    JTextField TDec,TBin,THex;//Textfield in for binary, octal , Hexadecimal
    JButton calculate,clear;  //Button to get the output
    JPanel p;
    public Conversions(){
        //initialization of declared object variable.
        LDec= new JLabel("Decimal Number:");
        LBin= new JLabel("Binary number:");
        LHex = new JLabel("Hexadecimal number:");

        TDec= new JTextField(30);
        TBin= new JTextField("");
        THex= new JTextField("");
        calculate =new JButton("Convert");
        clear=new JButton("Clear");

        p = new JPanel();
        p.setLayout(new GridLayout(4,2));
        p.add(LDec);
        p.add(TDec);
        p.add(LBin);
        p.add(TBin);
        p.add(LHex);
        p.add(THex);
        p.add(calculate);
        p.add(clear);
        setLayout(new FlowLayout());
        add(p);
        setTitle("Binary and Hexadecimal conversions");
        setSize(700,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        calculate.addActionListener(this);
        clear.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {   //we have to define operations
        JButton btn=(JButton)e.getSource();         // to perform some actions
        if(btn==calculate){
            //changes the given decimal into binary and hexadecimal
            int n = Integer.parseInt(TDec.getText());
            TBin.setText(Integer.toBinaryString(n));
            THex.setText(Integer.toHexString(n));
        }
        if (btn==clear){  //it will clear all the text Box
            TDec.setText("");
            TBin.setText("");
            THex.setText("");

        }
    }
    public static void main(String []args){
        new Conversions();

    }


}
