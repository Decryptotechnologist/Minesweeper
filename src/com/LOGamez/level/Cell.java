/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.graphics.Texture;
import com.LOGamez.minesweeper.Minesweeper;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Ghomez
 */
public class Cell {

    /**Attributes*/
    
    /**x variable of Cell*/
    private int x;
    
    /**y variable of Cell*/
    private int y;
    
    /**cellWidth variable of Cell*/
    private int cellWidth;
    
    /**cellHeight variable of Cell*/
    private int cellHeight;
    
    /**isBomb variable of Cell*/
    public boolean isBomb;
    
    /**isFlagged variable of Cell*/
    public boolean isFlagged;
    
    /**value variable of Cell*/
    private int value;
    
    /**cells variable of Cell*/
    private List<Cell> cells = null;
    
    /**btnFont variable of Cell*/
    private final Font btnFont = new Font("Arial", Font.BOLD, 8);
    
    /**labelFont variable of Cell*/
    private final Font labelFont = new Font("Arial", Font.BOLD, 18);
    
    /**btnCol variable of Cell*/
    private final Color btnCol = Color.decode("#a6a6a6");
    
    /**roundedBorder variable of Cell*/
    private final Border roundedBorder = new LineBorder(Color.BLACK, 2, true);
    
    /**plainBorder variable of Cell*/
    private final Border plainBorder = new LineBorder(Color.BLACK, 1);
    
    /**button variable of Cell*/
    private JButton button = null;
    
    /**label variable of Cell*/
    private JLabel label = null;
    
    /**id variable of Cell*/
    private int id;
    
    /**flag variable of Cell*/
    private final BufferedImage flag = new Texture("/sprites/flag_32").getImage();
    
    /**mine variable of Cell*/
    private final BufferedImage mine = new Texture("/sprites/mine_32").getImage();
    
    /**mines variable of Cell*/
    private int[] mines = null;
    
    /**gridSize variable of Cell*/
    private int gridSize;
    
    
    /**Links*/
    
    
    /**Constructor*/
    
    
    /**
     * Cell Constructor
     * 
     * @param _gridSize
     * @param _mines
     */
    public Cell(int _gridSize, int[] _mines){
        this.gridSize = _gridSize;
        this.mines = _mines;
        
        cells = new ArrayList<>();
    }
    
    
    /**
     * Cell Constructor
     * 
     * @param _x
     * @param _y
     * @param cellSize
     * @param _id
     */
    public Cell(int _x, int _y, int cellSize, int _id){
        this.x = _x;
        this.y = _y;
        this.cellWidth = cellSize;
        this.cellHeight = cellSize;
        this.isBomb = false;
        this.isFlagged = false;
        this.value = 0;
        this.label = new JLabel("0", SwingConstants.CENTER);
        label.setBounds(new Rectangle(this.x, this.y, this.cellWidth+2, this.cellHeight-2));
        label.setPreferredSize(new Dimension(this.cellWidth+2, this.cellHeight-2));
        label.setBackground(Color.decode("#b2b2b2"));
        label.setFont(labelFont);
        label.setLayout(new FlowLayout(FlowLayout.CENTER));
        label.setOpaque(true);
        label.setVisible(true);
        
        this.button = new JButton();
        button.setBounds(new Rectangle(this.x, this.y, this.cellWidth, this.cellHeight));
        button.setPreferredSize(new Dimension(this.cellWidth, this.cellHeight));
        button.setFont(btnFont);
        button.setBackground(btnCol);
        button.setMargin(new Insets(2, 2, 2, 2));
        button.setBorder(roundedBorder);
        button.setIcon(null);
        button.setVisible(true);
        
        this.id = _id;
    }
    
    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     */
    public void init(){
        JPanel[] cellPanels = new JPanel[gridSize];
        GridLayout experimentLayout = new GridLayout(0, gridSize);
        int i = 0;
        
        for(int y = 0; y < gridSize; y++){
            
            cellPanels[y] = new JPanel();
            cellPanels[y].setLayout(experimentLayout);
            cellPanels[y].setBounds(new Rectangle(0, 0, Minesweeper.getMainWidth(), this.cellHeight));
            cellPanels[y].setPreferredSize(new Dimension(Minesweeper.getMainWidth(), this.cellHeight));
            
            for(int x = 0; x < gridSize; x++){
                
                Cell aCell = new Cell(x * Minesweeper.getMainWidth()/gridSize, y * Minesweeper.getMainHeight()/gridSize, Minesweeper.getMainWidth()/gridSize, i);
                cells.add(aCell);
                aCell.label.add(aCell.button);
                cellPanels[y].add(aCell.label);
                
                aCell.button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent evt) {
                        BtnMouseEntered(evt, aCell.id);
                    }
                    @Override
                    public void mouseExited(MouseEvent evt) {
                        BtnMouseExited(evt, aCell.id);
                    }
                    @Override
                    public void mousePressed(MouseEvent evt) {
                        BtnMousePressed(evt, aCell.id);
                    }
                    @Override
                    public void mouseReleased(MouseEvent evt) {
                        BtnMouseReleased(evt, aCell.id);
                    }

                });
                
                for(int m : mines){
                    if(m == i) setBomb(i);
                }
                
                i++;
            }   
        }
        
        
        //Add Numbers
        for(Cell c : cells){
            boolean isLeftEdge = (c.id % gridSize == 0);
            boolean isRightEdge = (c.id % gridSize == gridSize-1);
            
            if(c.isBomb){
                if(c.id > 0 && !isLeftEdge && !cells.get(c.id - 1).isBomb) cells.get(c.id - 1).label.setText(String.valueOf(Integer.decode(cells.get(c.id - 1).label.getText())+1));
                if(c.id > 9 && !isRightEdge && !cells.get(c.id - gridSize+1).isBomb) cells.get(c.id - gridSize+1).label.setText(String.valueOf(Integer.decode(cells.get(c.id - gridSize+1).label.getText())+1));
                if(c.id > 10 && !cells.get(c.id - gridSize).isBomb) cells.get(c.id - gridSize).label.setText(String.valueOf(Integer.decode(cells.get(c.id - gridSize).label.getText())+1));                
                if(c.id > 11 && !isLeftEdge && !cells.get(c.id - gridSize-1).isBomb) cells.get(c.id - gridSize-1).label.setText(String.valueOf(Integer.decode(cells.get(c.id - gridSize-1).label.getText())+1));
                if(c.id < 88 && !isRightEdge && !cells.get(c.id + gridSize+1).isBomb) cells.get(c.id + gridSize+1).label.setText(String.valueOf(Integer.decode(cells.get(c.id + gridSize+1).label.getText())+1));
                if(c.id < 89 && !isLeftEdge && !cells.get(c.id + gridSize).isBomb) cells.get(c.id + gridSize).label.setText(String.valueOf(Integer.decode(cells.get(c.id + gridSize).label.getText())+1));
                if(c.id < 90 && !isLeftEdge && !cells.get(c.id + gridSize-1).isBomb) cells.get(c.id + gridSize-1).label.setText(String.valueOf(Integer.decode(cells.get(c.id + gridSize-1).label.getText())+1));
                if(c.id < 98 && !isRightEdge && !cells.get(c.id + 1).isBomb) cells.get(c.id + 1).label.setText(String.valueOf(Integer.decode(cells.get(c.id + 1).label.getText())+1));
            }
        }
        
        //Colour Numbers
        for(Cell c : cells){
            if(c.label.getText().equals("1")) c.label.setForeground(Color.decode("#008eDe"));
            if(c.label.getText().equals("2")) c.label.setForeground(Color.decode("#405500"));
            if(c.label.getText().equals("3")) c.label.setForeground(Color.decode("#fb0000"));
            if(c.label.getText().equals("4")) c.label.setForeground(Color.decode("#171b64"));
            if(c.label.getText().equals("5")) c.label.setForeground(Color.decode("#8e0000"));
            if(c.label.getText().equals("6")) c.label.setForeground(Color.decode("#ff7b00"));
            if(c.label.getText().equals("7")) c.label.setForeground(Color.decode("#ffbc00"));
            if(c.label.getText().equals("8")) c.label.setForeground(Color.decode("#9ec2e1"));
        }
        
        //Add Panels of Cells to Grid
        for(JPanel p : cellPanels){
            Grid.gridPanel.add(p);
        }
    }
    
    
    /**
     * tick()
     * 
     */
    public void tick(){}
    
    
    /**
     * render(Graphics2D g2d)
     * 
     * @param g2d
     */
    public void render(Graphics2D g2d){}
    
    
    /**
     * BtnMouseEntered(MouseEvent evt, int _id)
     * 
     */
    private void BtnMouseEntered(MouseEvent evt, int _id) {
        //System.out.println(_id+": Entered");
        JButton EventSource = (JButton)evt.getSource();
        EventSource.setBackground(Color.decode("#4c4c4c"));
    }

    
    /**
     * BtnMouseExited(MouseEvent evt, int _id)
     * 
     */
    private void BtnMouseExited(MouseEvent evt, int _id) {
        //System.out.println(_id+": Exited");
        JButton EventSource = (JButton)evt.getSource();
        EventSource.setBackground(btnCol);
    }

    
    /**
     * BtnMousePressed(MouseEvent evt, int _id)
     * 
     */
    private void BtnMousePressed(MouseEvent evt, int _id) {
        //System.out.println(_id+": Pressed");
    }

    
    /**
     * BtnMouseReleased(MouseEvent evt, int _id)
     * 
     */
    private void BtnMouseReleased(MouseEvent evt, int _id) {
        //System.out.println(_id+": Released");
        JButton EventSource = (JButton)evt.getSource();
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if(cells.get(_id).isFlagged){
                //Error Sound
                
            } else {
                reveal(_id);
            }
        }
        if (evt.getButton() == MouseEvent.BUTTON2) {
            EventSource.setText(String.valueOf(_id));
        }
        if (evt.getButton() == MouseEvent.BUTTON3) {
            setFlag(_id);
        }
    }
    
    
    /**
     * reveal(int _id)
     * 
     * @param _id
     */
    public void reveal(int _id){
        boolean isLeftEdge = (_id % gridSize == 0);
        boolean isRightEdge = (_id % gridSize == gridSize-1);
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            //Logger.getLogger(Cell.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Cell c : cells){
            if(c.id == _id){
                c.button.setVisible(false);
                c.label.setBorder(plainBorder);
                if(c.label.getText().equals("0")) c.label.setText("");
                if(c.isBomb) Level.gameOver();
                
                if(_id > 0 && !isLeftEdge && !cells.get(_id-1).isBomb && cells.get(_id-1).button.isVisible()){
                    cells.get(_id-1).button.setVisible(false);
                    cells.get(_id-1).label.setBorder(plainBorder);
                    if(cells.get(_id-1).label.getText().equals("0")) cells.get(_id-1).label.setText("");
                }
                if(_id > 9 && !isRightEdge && !cells.get(_id+1-gridSize).isBomb && cells.get(_id+1-gridSize).button.isVisible()){
                    cells.get(_id+1-gridSize).button.setVisible(false);
                    cells.get(_id+1-gridSize).label.setBorder(plainBorder);
                    if(cells.get(_id+1-gridSize).label.getText().equals("0")) cells.get(_id+1-gridSize).label.setText("");
                }
                if(_id > 10 && !cells.get(_id-gridSize).isBomb && cells.get(_id-gridSize).button.isVisible()){
                    cells.get(_id-gridSize).button.setVisible(false);
                    cells.get(_id-gridSize).label.setBorder(plainBorder);
                    if(cells.get(_id-gridSize).label.getText().equals("0")) cells.get(_id-gridSize).label.setText("");
                }
                if(_id > 11 && !isLeftEdge && !cells.get(_id-1-gridSize).isBomb && cells.get(_id-1-gridSize).button.isVisible()){
                    cells.get(_id-1-gridSize).button.setVisible(false);
                    cells.get(_id-1-gridSize).label.setBorder(plainBorder);
                    if(cells.get(_id-1-gridSize).label.getText().equals("0")) cells.get(_id-1-gridSize).label.setText("");
                }
                if(_id < 98 && !isRightEdge && !cells.get(_id+1).isBomb && cells.get(_id+1).button.isVisible()){
                    cells.get(_id+1).button.setVisible(false);
                    cells.get(_id+1).label.setBorder(plainBorder);
                    if(cells.get(_id+1).label.getText().equals("0")) cells.get(_id+1).label.setText("");
                }
                if(_id < 90 && !isLeftEdge && !cells.get(_id-1+gridSize).isBomb && cells.get(_id-1+gridSize).button.isVisible()){
                    cells.get(_id-1+gridSize).button.setVisible(false);
                    cells.get(_id-1+gridSize).label.setBorder(plainBorder);
                    if(cells.get(_id-1+gridSize).label.getText().equals("0")) cells.get(_id-1+gridSize).label.setText("");
                }
                if(_id < 88 && !isRightEdge && !cells.get(_id+1+gridSize).isBomb && cells.get(_id+1+gridSize).button.isVisible()){
                    cells.get(_id+1+gridSize).button.setVisible(false);
                    cells.get(_id+1+gridSize).label.setBorder(plainBorder);
                    if(cells.get(_id+1+gridSize).label.getText().equals("0")) cells.get(_id+1+gridSize).label.setText("");
                }
                if(_id < 89 && !cells.get(_id+gridSize).isBomb && cells.get(_id+gridSize).button.isVisible()){
                    cells.get(_id+gridSize).button.setVisible(false);
                    cells.get(_id+gridSize).label.setBorder(plainBorder);
                    if(cells.get(_id+gridSize).label.getText().equals("0")) cells.get(_id+gridSize).label.setText("");
                }
            }
        }
    }
    
    
    /**
     * getCell(int _id)
     * 
     * @param _id
     * 
     * @return aCell
     */
    public Cell getCell(int _id){
        Cell aCell = null;
        for(Cell c : cells){
            if(c.id == _id) aCell = c;
        }
        
        return aCell;
    }
    
    
    
    /**
     * getCellz()
     * 
     * 
     * @return cells
     */
    public List<Cell> getCellz(){
        return cells;
    }
    
    
    /**
     * setFlag(int _id)
     * 
     * @param _id
     */
    public void setFlag(int _id){
        for(Cell c : cells){
            if(c.id == _id){ 
                if(c.isFlagged){
                    c.isFlagged = false;
                    c.button.setIcon(null);
                    Level.increaseFlags();
                } else {
                    if(Integer.decode(Level.getFlags()) > 0){
                        c.isFlagged = true;
                        c.button.setIcon(new ImageIcon(flag));
                        Level.decreaseFlags();
                    }
                }
            }
        }
    }
    
    
    /**
     * setBomb(int _id)
     * 
     * @param _id
     */
    public void setBomb(int _id){
        for(Cell c : cells){
            if(c.id == _id){ 
                c.isBomb = true;
                c.label.setText("");
                c.label.setIcon(new ImageIcon(mine));
            }
        }
    }
    
    
}
