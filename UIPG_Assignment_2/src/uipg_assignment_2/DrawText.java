/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipg_assignment_2;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author SVSTEM
 */
public class DrawText extends JPanel {

    public DrawText() {
        setLayout(new GridLayout(2, 0));
        add(new DrawTextType(DrawTextType.Line1));
        add(new DrawTextType(DrawTextType.Line2));
    }

    class DrawTextType extends JPanel{
        public static final int Line1 = 1;
        public static final int Line2 = 2;
        
        private int type = 1;

        private DrawTextType(int type) {
            this.type = type;
        }

        @Override
        protected void paintComponent(Graphics grphcs) {
            super.paintComponent(grphcs);
            
            switch(type){
                case 1 :
                    grphcs.setFont(new Font("Serif", Font.BOLD, 30)); 
                    grphcs.drawString("My First Robot in Java",10,320);
                    break;
                
                case 2 :
                    grphcs.setFont(new Font("Serif", Font.BOLD, 15)); 
                    grphcs.drawString("by Victor Teh Yang Jie (ID: 0328168)",10,30);
                    break;
                    
                default:
                    System.out.println("something wrong with Draw Text Switch");
            }
            
        }
        
        
    }
}
