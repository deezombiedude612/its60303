/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipg_assignment_2;

import java.awt.GridLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author SVSTEM
 */
public class UIPG_Assignment_2 extends JFrame {

    public UIPG_Assignment_2() {
        setLayout(new GridLayout(0, 2));
        add(new DrawRobot());
        add(new DrawText());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UIPG_Assignment_2 frame = new UIPG_Assignment_2();
        frame.setVisible(true);
        String space = "                                          "
                     + "                                          ";
        frame.setTitle(space + "My First Robot");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
    
}
