/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.neww;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


/**
 *
 * @author alisiddique
 */
public class MyFrame extends JFrame implements ActionListener {
     JButton button;
     
    MyFrame(){     

    JTextField t1 =new JTextField("Write something");  
    
       JButton button = new JButton("submit");
              button.setBounds(100,160, 200, 50);
              button.addActionListener(e -> System.out.println("ali is the best"));
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setLayout(null);
             this.add(button);
               this.setSize(500, 500);
                  this.setVisible(true);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("ali is the best");
        }
    }
}
