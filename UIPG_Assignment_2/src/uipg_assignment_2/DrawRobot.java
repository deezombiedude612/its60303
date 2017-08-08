/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipg_assignment_2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author SVSTEM
 */
public class DrawRobot extends JPanel{

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        
    // Draw Face
        grphcs.setColor(Color.GRAY);
        grphcs.fillRoundRect(115, 80, 100, 100, 20, 20);

    //Draw Hat
        grphcs.setColor(Color.ORANGE);
        grphcs.fillArc(90, 20, 150, 150, 0, 180);
        
    // Draw Eyes
        grphcs.setColor(Color.WHITE);
        
        //left eye
        grphcs.fillOval(125, 100, 30, 30);
        //right eye
        grphcs.fillOval(175, 100, 30, 30);
        
    // Draw Pupil
        grphcs.setColor(Color.BLACK);
        
        //left pupil
        grphcs.fillOval(139, 106, 18, 18);
        //right pupil
        grphcs.fillOval(173, 106, 18, 18);
        
    // Draw Ears
        grphcs.setColor(Color.BLACK);
        
        //left ear stick
        grphcs.fillRect(86, 113, 30, 10);
        //right ear stick
        grphcs.fillRect(215, 113, 30, 10);
        
        grphcs.setColor(Color.RED);
        
        //left ear ball
        grphcs.fillOval(69, 108, 18, 18);
        //right ear ball
        grphcs.fillOval(243, 108, 18, 18);
        
    // Draw Nose
        grphcs.setColor(Color.RED);
        grphcs.fillOval(155, 130, 23, 15);

    // Draw Mouth
        grphcs.setColor(Color.BLACK);
        grphcs.drawArc(142, 130, 50, 30, 180, 180);
            
    // Draw Neck
        grphcs.setColor(Color.BLACK);
        grphcs.fillRect(140, 180, 50, 20);

    // Draw Body
        grphcs.setColor(Color.GRAY);
        grphcs.fillRoundRect(85, 200, 160, 160, 15, 15);
    
    // Draw Hands
        grphcs.setColor(Color.BLACK);
        
        //left hand
        grphcs.fillRect(60, 220, 20, 150);
        //right hand
        grphcs.fillRect(250, 220, 20, 150);
    
        grphcs.setColor(Color.ORANGE);
    
        //left shoulder
        grphcs.fillArc(45, 206, 80, 40, 90, 180);
        //right shoulder
        grphcs.fillArc(205, 206, 80, 40, 270, 180);
        
        
        grphcs.setColor(Color.RED);
        
        //left palm
        grphcs.fillOval(50, 365, 40, 40);
        //right palm
        grphcs.fillOval(241, 365, 40, 40);
        
    // Draw Legs
    
        grphcs.setColor(Color.BLACK);
        
        //left leg   
        grphcs.fillRect(105, 360, 40, 250);
        //right leg
        grphcs.fillRect(183, 360, 40, 250);
        
        grphcs.setColor(Color.ORANGE);
        
        //left shoe
        grphcs.fillArc(87, 600, 70, 50, 0, 180);
        //right shoe
        grphcs.fillArc(171, 600, 70, 50, 0, 180);
    
    // Draw Red and Black Rectangle on the body
        grphcs.setColor(Color.BLACK);
        
        //black rectangle background
        grphcs.fillRect(104, 225, 121, 60);
        
        grphcs.setColor(Color.RED);
        //red strips
        grphcs.fillRect(104, 225, 11, 60);
        grphcs.fillRect(126, 225, 11, 60);
        grphcs.fillRect(148, 225, 11, 60);
        grphcs.fillRect(170, 225, 11, 60);
        grphcs.fillRect(192, 225, 11, 60);
        grphcs.fillRect(214, 225, 11, 60);
        
    // Draw four circles on the body
        
        // first circle
        grphcs.setColor(Color.BLUE);
        grphcs.fillOval(104, 300, 25, 25);
        
        //second circle
        grphcs.setColor(Color.GREEN);
        grphcs.fillOval(136, 300, 25, 25);
        
        //third circle
        grphcs.setColor(Color.ORANGE);
        grphcs.fillOval(168, 300, 25, 25);
        
        //forth circle
        grphcs.setColor(Color.WHITE);
        grphcs.fillOval(200, 300, 25, 25);
    }
}
