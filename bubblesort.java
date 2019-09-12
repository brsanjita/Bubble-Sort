import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class bubblesort{
  
    public static void main(String[] args){
       
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
          
        }
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new bubblesort();
            }
        });
    }
    
      JFrame mainFrame = new JFrame();
      JPanel mainPanel = new JPanel();
      JLabel title = new JLabel("Bubble Sort");
      JLabel Label1 = new JLabel("Please enter the numbers: ");
      JButton sort = new JButton("Sort"); 
      double[] myArray = new double[10];
      
      JTextField textfield_1 = new JTextField();
      JTextField textfield_2 = new JTextField();
      JTextField textfield_3 = new JTextField();
      JTextField textfield_4 = new JTextField();
      JTextField textfield_5 = new JTextField();
      JTextField textfield_6 = new JTextField();
      JTextField textfield_7 = new JTextField();
      JTextField textfield_8 = new JTextField();
      JTextField textfield_9 = new JTextField();
      JTextField textfield_10 = new JTextField();
      JTextArea textarea_1 = new JTextArea();
      


public bubblesort()
{
    mainFrame.add(mainPanel);
    mainFrame.setVisible(true);
    mainPanel.setLayout(null);
    mainFrame.setSize(700,900);
    mainFrame.setResizable(true);
    sort.setBounds(70,550,70,30);
    title.setBounds(224,10,300,150);
    Label1.setBounds(90,30,600,180);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    title.setFont(new Font("Work Sans SemiBold", Font.BOLD,30));
    Label1.setFont(new Font("Work Sans SemiBold", Font.PLAIN,26));
    
    mainPanel.add(textfield_1);
    mainPanel.add(textfield_2);
    mainPanel.add(textfield_3);
    mainPanel.add(textfield_4);
    mainPanel.add(textfield_5);
    mainPanel.add(textfield_6);
    mainPanel.add(textfield_7);
    mainPanel.add(textfield_8);
    mainPanel.add(textfield_9);
    mainPanel.add(textfield_10);
    mainPanel.add(textarea_1);
    mainPanel.add(sort);
    mainPanel.add(title);
    mainPanel.add(Label1);
    
    
    
    textfield_1.setBounds(70,510,200,32);
    textfield_2.setBounds(70,150,200,32);
    textfield_3.setBounds(70,190,200,32);
    textfield_4.setBounds(70,230,200,32);
    textfield_5.setBounds(70,270,200,32);
    textfield_6.setBounds(70,310,200,32);
    textfield_7.setBounds(70,350,200,32);
    textfield_8.setBounds(70,390,200,32);
    textfield_9.setBounds(70,430,200,32);
    textfield_10.setBounds(70,470,200,32);
    textarea_1.setBounds(120,590,450,240);
    
    sort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
               readInData();
    	doBubbleSort();
    	displayResult();
    
}
});
}

	public void readInData() 
    {    	
		myArray[0] = Integer.parseInt(textfield_1.getText());
		myArray[1] = Integer.parseInt(textfield_2.getText());
		myArray[2] = Integer.parseInt(textfield_3.getText());
		myArray[3] = Integer.parseInt(textfield_4.getText());
		myArray[4] = Integer.parseInt(textfield_5.getText());
                myArray[5] = Integer.parseInt(textfield_6.getText());
                myArray[6] = Integer.parseInt(textfield_7.getText());
                myArray[7] = Integer.parseInt(textfield_8.getText());
                myArray[8] = Integer.parseInt(textfield_9.getText());
                myArray[9] = Integer.parseInt(textfield_10.getText());
    }

	public void doBubbleSort() 
    {
		double temp = 0;
    	
    	for (int counter = 0; counter < myArray.length - 1; counter++)
    	{ 
			for (int index = 0; index < myArray.length - 1 - counter; index++) 
			{ 
				if (myArray[index] > myArray[index + 1]) 
				{ 
					temp = myArray[index]; 
					myArray[index] = myArray[index + 1];
					myArray[index + 1] = temp;
				}
			}
		}
	 }

	public void displayResult() 
    {
    	textarea_1.setText("");
    	
		for (int i = 0; i < myArray.length; i++) 
		{
    		textarea_1.append(myArray[i] + "\n");
		}    	  	
	}
}

