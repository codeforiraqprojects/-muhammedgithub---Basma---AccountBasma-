package account;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Account {
    JFrame frame;

//    JPanel contentPanel;
    JPanel depositPanel;
    JPanel withdrawPanel;

    JLabel depositLabel;
    JLabel withdrawLabel;
//    JLabel finalbalanceLabel;
    JLabel initialBalanceLabel;
  static  JLabel finalbalanceLabelshow;
  static  JLabel userNameShowLable;
    JLabel userNameLable;
  static  JLabel userIdLable;
  JLabel userIdShowLable;
    int i=0;
    static int d;


    JTextField depositField;
    JTextField withdrawField;

    JButton depositButton;
    JButton withdrawButton;

    public static void main (String args[]) { 
    	d=400;
        new Account();
    }
    Account () {
        frame = new JFrame("Account Information");
        depositPanel = new JPanel(new FlowLayout());
        withdrawPanel = new JPanel(new FlowLayout());
        depositLabel = new JLabel("Deposit ");
        withdrawLabel = new JLabel("Withdraw ");
        userNameLable=new JLabel("Name  : ");
        userNameLable.setForeground(Color.BLACK);
        userNameShowLable=new JLabel("Basma Alkhalisy   ");
        userNameShowLable .setForeground(Color.BLACK);
        initialBalanceLabel = new JLabel("amount : ");
        initialBalanceLabel.setForeground(Color.BLACK);
        finalbalanceLabelshow = new JLabel();
        userIdLable=new JLabel("  acc_no :   ");
        userIdLable.setForeground(Color.BLACK);
        userIdShowLable=new JLabel("83");
        userIdShowLable.setForeground(Color.BLACK);
        finalbalanceLabelshow.setText(String.valueOf(d)); 
        finalbalanceLabelshow.setForeground(Color.BLACK);
        depositField = new JTextField("", 10);
        withdrawField = new JTextField("", 10);
  	  depositField.setText("0");
  	 withdrawField.setText("0");
  	 
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");

        depositPanel.add(depositLabel);
        depositPanel.add(depositField);
        depositPanel.add(depositButton);

        withdrawPanel.add(withdrawLabel);
        withdrawPanel.add(withdrawField);
        withdrawPanel.add(withdrawButton);


        JPanel pane = new JPanel(new GridBagLayout());
        pane.setBorder(BorderFactory.createTitledBorder("Information"));
        pane.setBackground(Color.lightGray);

        pane.add(userNameLable);
        pane.add(userNameShowLable);
        pane.add(initialBalanceLabel); //Added label to panel to center it
        pane.add(finalbalanceLabelshow);
        pane.add(userIdLable);
        pane.add(userIdShowLable); 
      
        depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				i=Integer.parseInt(depositField.getText());
				  
				d=i+d;
				 finalbalanceLabelshow.setText(String.valueOf(d)); 
				
				  depositField.setText("0");
			}});
        
        
        withdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=Integer.parseInt(withdrawField.getText());
		  
					if(i>d){  
				
					   JOptionPane.showMessageDialog(null, "Insufficient Balance");
					}else{  
					d=d-i;  
					 finalbalanceLabelshow.setText(String.valueOf(d)); 
					 
					}  
				     withdrawField.setText("0");
				   
			}});
 
   
      
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.add(pane);
        frame.setPreferredSize(new Dimension(500,200));
        frame.setSize(300, 300);
        frame.add(depositPanel);
        frame.add(withdrawPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
	
}

 

