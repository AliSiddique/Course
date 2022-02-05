/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.neww;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author alisiddique
 */
public class LaunchPage implements ActionListener{
    JFrame frame = new JFrame();
JMenuItem loadItem;
JMenuItem save;
 JMenuItem exit;
 JMenuBar menubar;
 JMenu Filemenu;
  JMenu Editmenu;
  JMenu Helpmenu;
  JLabel label;
  JTextArea textarea;
  JFileChooser filechooser;
    LaunchPage(){
        
        
        menubar = new JMenuBar();
        Filemenu = new JMenu("File");        
        Editmenu = new JMenu("Edit");
        Helpmenu = new JMenu("Help");
         loadItem = new JMenuItem("Load");
         save = new JMenuItem("Save");
       exit  = new JMenuItem("Exit");
        loadItem.addActionListener(e -> {
             filechooser = new JFileChooser();
             int response = filechooser.showSaveDialog(null); //select file to open

        });
        Filemenu.add(loadItem);
         Filemenu.add(save);
        Filemenu.add(exit);
        label = new JLabel();
        label.setBounds(0, 0, 200,200);
        label.setBackground(Color.red);
        label.setOpaque(true);
        menubar.add(Filemenu);
        menubar.add(Editmenu);
        menubar.add(Helpmenu);
        
        save.addActionListener(this);
        
       textarea = new JTextArea();
       textarea.setBounds(0, 0, 500, 500);
       frame.add(textarea);
                frame.setTitle("Alis is the best");
        frame.setJMenuBar(menubar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource() == save){
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setCurrentDirectory(new File("."));
    int response  = fileChooser.showSaveDialog(null);
    if(response == JFileChooser.APPROVE_OPTION){
        File file;
        PrintWriter fileOut = null;
        file = new File(fileChooser.getSelectedFile().getAbsolutePath());
        try{
        fileOut = new PrintWriter(file);
        fileOut.println(textarea.getText());
        
        } catch(FileNotFoundException e1){
            e1.printStackTrace();
        } finally {
        fileOut.close();
    }
    }
}
    }

   

    
}
