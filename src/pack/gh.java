package pack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class gh extends JFrame{

private int screenWidth = 800;
private int screenHeight = 600;

public gh(){

    //Initial Setup
    super("NAMEHERE - Chat Client Alpha v0.0.1");
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(screenWidth,screenHeight);
    GridBagConstraints c = new GridBagConstraints();

    //Main Panel
    JPanel window = new JPanel();
    window.setLayout(new GridBagLayout());
    window.setBackground(Color.black);

    //Panels
    JPanel display = new JPanel();
    JPanel chat = new JPanel();
    chat.setLayout(new GridBagLayout());
    JPanel users = new JPanel();


    display.setBackground(Color.blue);
    c.gridx = 0;
    c.gridy = 0;
    c.insets= new Insets(5,5,5,5);
    window.add(display, c);

    chat.setBackground(Color.red);
    c.gridx = 0;
    c.gridy = 3;
    c.gridheight = 2;
    c.gridwidth = 1;
    c.insets= new Insets(5,5,5,5);
    window.add(chat, c);

    users.setBackground(Color.green);
    c.gridx = 2;
    c.gridy = 0;
    c.insets= new Insets(5,5,5,5);
    window.add(users, c);

    //Buttons


    //Text fields
    JTextArea text = new JTextArea("DEREADFADSFEWFASDFSADFASDF");
    c.gridx = 0;
    c.gridy = 0;
    chat.add(text);
    JTextField input = new JTextField("type here to chat", 50);
    c.gridx = 0;
    c.gridy = 1;
    c.insets= new Insets(5,5,5,5);
    chat.add(input);


    add(window);
    setVisible(true);
    
    


}

static class ActLis implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
}