package com.company.java;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="Main.class" height="1000" width="500"></applet>*/
public class Main extends Applet implements ActionListener{
    Button  button1;
    Button button2;
    Button button3;
    @Override
    public void init() {
        button1 = new Button("Button1");
        button2 = new Button("Button2");
       button3 = new Button("Button3");
        button1.setBackground(Color.red);
        button2.setBackground(Color.blue);
        button3.setBackground(Color.green);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        add(button1);
        add(button2);
        add(button3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button1)
    setBackground(Color.red);
    else if(e.getSource()==button2)
    setBackground(Color.blue);
    else
    setBackground(Color.green);
    }
    }

