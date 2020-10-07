/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.graphics.Texture;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Ghomez
 */
public class Display {

    /**Attributes*/
    
    /**x variable of Display*/
    private final int x;
    
    /**y variable of Display*/
    private final int y;
    
    /**displayWidth variable of Display*/
    private final int displayWidth;
    
    /**displayHeight variable of Display*/
    private final int displayHeight;
    
    /**noOfFlags variable of Display*/
    public String noOfFlags;
    
    /**time variable of Display*/
    public String time;
    
    /**displayFont variable of Display*/
    private final Font displayFont = new Font(getFont("DSEG7Classic-Regular.ttf").getFontName(), Font.BOLD, 32);//new Font(getFont("digital-7 (mono).ttf").getFontName(), Font.PLAIN, 18);
    
    /**textArea variable of Display*/
    public JTextArea textArea;
    
    /**displayPanel variable of Display*/
    public JPanel displayPanel;
    
    /**textArea1 variable of Display*/
    private final JTextArea textArea1;
    
    /**smileyButton variable of Display*/
    private final JButton smileyButton;
    
    /**btnCol variable of Display*/
    private final Color btnCol = Color.decode("#a6a6a6");
    
    /**smiley variable of Display*/
    private final BufferedImage smiley = new Texture("/sprites/smiley_32").getImage();
    
    /**smileyShades variable of Display*/
    private final BufferedImage smileyShades = new Texture("/sprites/smiley-shades_32").getImage();
    
    /**smileyGoggle variable of Display*/
    private final BufferedImage smileyGoggle = new Texture("/sprites/smiley-goggle_32").getImage();
    
    /**displayBorder variable of Display*/
    private final Border displayBorder = new LineBorder(Color.decode("#b6b6b6"), 5);
    
    /**displayLabel variable of Display*/
    private final JLabel displayLabel;
    
    /**displayLabel1 variable of Display*/
    private final JLabel displayLabel1;
    
    /**firstTick variable of Display*/
    private boolean firstTick;
    
    /**lastTick variable of Display*/
    private boolean lastTick;
    
    /**nextTick variable of Display*/
    private long nextTick;
    
    
    /**Links*/
    
    
    
    /**Constructor*/
    
    /**
     * Display Constructor
     * 
     * @param _x
     * @param _y
     * @param _w
     * @param _h
     * @param _noOfFlags
     * @param _time
     */
    public Display(int _x, int _y, int _w, int _h, String _noOfFlags, String _time){
        this.x = _x;
        this.y = _y;
        this.displayWidth = _w;
        this.displayHeight = _h;
        this.noOfFlags = _noOfFlags;
        this.time = _time;
        
        this.textArea = new JTextArea("0"+this.noOfFlags);
        textArea.setBounds(new Rectangle(this.x, this.y, this.displayWidth/6, this.displayHeight-5));
        textArea.setPreferredSize(new Dimension(this.displayWidth/6, this.displayHeight-5));
        textArea.setFont(displayFont);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.RED);
        textArea.setLineWrap(false);
        textArea.setEditable(false);
        textArea.setColumns(3);
        textArea.setRows(1);
        textArea.setVisible(true);
        
        this.smileyButton = new JButton();
        smileyButton.setBounds(new Rectangle(this.x, this.y+5, 35, 35));
        smileyButton.setPreferredSize(new Dimension(35, 35));
        smileyButton.setBackground(btnCol);
        smileyButton.setMargin(new Insets(2, 2, 2, 2));
        smileyButton.setBorder(LineBorder.createBlackLineBorder());
        smileyButton.setIcon(new ImageIcon(smiley));
        smileyButton.setVisible(true);
        
        this.textArea1 = new JTextArea(this.time);
        textArea1.setBounds(new Rectangle(this.x, this.y, this.displayWidth/6, this.displayHeight-5));
        textArea1.setPreferredSize(new Dimension(this.displayWidth/6, this.displayHeight-5));
        textArea1.setFont(displayFont);
        textArea1.setBackground(Color.BLACK);
        textArea1.setForeground(Color.RED);
        textArea1.setLineWrap(false);
        textArea1.setEditable(false);
        textArea1.setColumns(3);
        textArea1.setRows(1);
        textArea1.setVisible(true);
        
        displayLabel = new JLabel();
        displayLabel.setBounds(new Rectangle(0, 0, this.displayWidth/4, this.displayHeight-5));
        displayLabel.setPreferredSize(new Dimension(this.displayWidth/4, this.displayHeight-5));
        displayLabel.setBackground(Color.BLACK);
        
        displayLabel1 = new JLabel();
        displayLabel1.setBounds(new Rectangle(0, 0, this.displayWidth/4, this.displayHeight-5));
        displayLabel1.setPreferredSize(new Dimension(this.displayWidth/4, this.displayHeight-5));
        displayLabel1.setBackground(Color.BLACK);
        
        displayPanel = new JPanel();
        displayPanel.setBounds(new Rectangle(this.x, this.y, this.displayWidth, this.displayHeight+15));
        displayPanel.setPreferredSize(new Dimension(this.displayWidth, this.displayHeight+15));
        displayPanel.setBackground(btnCol);
        displayPanel.setBorder(displayBorder);
        
        displayPanel.add(textArea, BorderLayout.LINE_START);
        displayPanel.add(displayLabel, BorderLayout.CENTER);
        displayPanel.add(smileyButton, BorderLayout.CENTER);
        displayPanel.add(displayLabel1, BorderLayout.CENTER);
        displayPanel.add(textArea1, BorderLayout.LINE_END);
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     */
    public void init(){
        System.out.println("Display: Initiating Display . . .");
        firstTick = true;
        lastTick = false;
        
        smileyButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                BtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                BtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                BtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                BtnMouseReleased(evt);
            }

        });
        
    }
    
    
    /**
     * tick()
     * 
     */
    public void tick(){
        if(firstTick) {
            //Set firstTick: false
            firstTick = false;
            
            nextTick = System.currentTimeMillis() + 1000 ;//Set time of first game tick
        }
        
        if (System.currentTimeMillis() >= nextTick && !Level.gameOver && Integer.decode(this.time) > -1) {//Check to see if it is time or past time to update
            nextTick += 1000;//Set next tick to one second in the future
            //System.out.println("Decreasing Time: "+this.time);
            decreaseTime();
        }
    }
    
    
    /**
     * render(Graphics2D g2d)
     * 
     * @param g2d
     */
    public void render(Graphics2D g2d){}
    
    
    /**
     * getFont(String fileName)
     * 
     * @param fileName
     * 
     * @return f
     */
    public Font getFont(String fileName) {
        Font f = null;
        try {
            String path = "/fonts/" + fileName;
            URL url = getClass().getResource(path);
            f = Font.createFont(Font.TRUETYPE_FONT, new File(url.toURI()));
            
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(f);
        } catch (FontFormatException | IOException | URISyntaxException ex) {
//            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
    
    /**
     * getFlags()
     * 
     * @return noOfFlags
     */
    public String getFlags(){
        System.out.println("Display: Get Flags -"+this.noOfFlags);
        return noOfFlags;
    }
    
    
    /**
     * increaseFlags()
     * 
     */
    public void increaseFlags(){
        System.out.println("Display: Increase Flags -"+this.noOfFlags);
        String newFlags = String.valueOf(Integer.decode(noOfFlags) + 1);
        if(Integer.decode(newFlags) < 100) textArea.setText("0"+newFlags);
        if(Integer.decode(newFlags) < 10) textArea.setText("00"+newFlags);
        
        noOfFlags = newFlags;
    }
    
    
    /**
     * decreaseFlags()
     * 
     */
    public void decreaseFlags(){
        System.out.println("Display: Decrease Flags -"+this.noOfFlags);
        if(Integer.decode(this.noOfFlags) > 0){
            String newFlags = String.valueOf(Integer.decode(this.noOfFlags) - 1);
            if(Integer.decode(newFlags) < 100) textArea.setText("0"+newFlags);
            if(Integer.decode(newFlags) < 10) textArea.setText("00"+newFlags);

            this.noOfFlags = newFlags;
        } else {
            //Error: Play Error Sound
        }
    }
    
    
    /**
     * decreaseTime()
     * 
     */
    public void decreaseTime(){
        
        if(Integer.decode(this.time) > -1 && !Level.gameOver){
            String newTime = String.valueOf(Integer.decode(this.time) - 1);
            if(Integer.decode(newTime) < 100) textArea1.setText("0"+newTime);
            if(Integer.decode(newTime) < 10)  textArea1.setText("00"+newTime);
            if(Integer.decode(newTime) > 100) textArea1.setText(""+newTime);

            this.time = newTime;
            System.out.println("Display: Decrease Time - "+this.time);
        } 
        if(Integer.decode(this.time) == 0) {
            //Game Over
            Level.gameOver();
        }
    }
    
    
    /**
     * BtnMouseEntered(MouseEvent evt)
     * 
     */
    private void BtnMouseEntered(MouseEvent evt) {
        System.out.println("Display: Button Entered");
        JButton EventSource = (JButton)evt.getSource();
        EventSource.setBackground(Color.decode("#4c4c4c"));
    }

    
    /**
     * BtnMouseExited(MouseEvent evt)
     * 
     */
    private void BtnMouseExited(MouseEvent evt) {
        System.out.println("Display: Button Exited");
        JButton EventSource = (JButton)evt.getSource();
        EventSource.setBackground(btnCol);
    }

    
    /**
     * BtnMousePressed(MouseEvent evt)
     * 
     */
    private void BtnMousePressed(MouseEvent evt) {
        System.out.println("Display: Button Pressed");
        smileyButton.setIcon(new ImageIcon(smileyGoggle));
    }

    
    /**
     * BtnMouseReleased(MouseEvent evt)
     * 
     */
    private void BtnMouseReleased(MouseEvent evt) {
        System.out.println("Display: Button Released");
        if (evt.getButton() == MouseEvent.BUTTON1) {
          smileyButton.setIcon(new ImageIcon(smiley));
          checkGameComplete();
        }
        if (evt.getButton() == MouseEvent.BUTTON2) {
          smileyButton.setIcon(new ImageIcon(smileyShades));
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
          
        }
    }

    
    /**
     * checkGameComplete()
     * 
     */
    private void checkGameComplete() {
        System.out.println("Display: Check Game Complete");
        //Check All Flags cover all Bombs
        boolean result = Level.checkWin();
        System.out.println("Game Complete: "+result);
        if(result) System.out.println("YOU WIN!");
        //Reset Game
    }
    
    
    /**
     * gameOver()
     * 
     */
    public void gameOver(){
        System.out.println("Display: Game Over");
        //Game Over
        smileyButton.setIcon(new ImageIcon(smileyGoggle));
    }
    
}
