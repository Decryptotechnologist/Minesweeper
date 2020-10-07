/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Ghomez
 */
public class Grid {

    /**Attributes*/
    
    /**gridWidth variable of Grid*/
    private final int gridWidth;
    
    /**gridHeight variable of Grid*/
    private final int gridHeight;
    
    /**gridPanel variable of Grid*/
    public static JPanel gridPanel;
    
    /**noOfCells variable of Grid*/
    private final int noOfCells;
    
    
    /**Links*/
    
    
    /**Constructor*/
    
    
    /**
     * Grid Constructor
     * 
     * @param _w
     * @param _h
     * @param _noOfCells
     */
    public Grid(int _w, int _h, int _noOfCells){
        this.gridWidth = _w;
        this.gridHeight = _h;
        this.noOfCells = _noOfCells;
    }
    
    
    /**Public Protocol*/
    
    /**
     * init()
     * 
     */
    public void init(){
        System.out.println("Grid: Initiating grid . . .");
        GridLayout experimentLayout = new GridLayout(noOfCells, 0);
        
        gridPanel = new JPanel();
        gridPanel.setLayout(experimentLayout);
        gridPanel.setBackground(Color.decode("#8D8D8D"));
        gridPanel.setOpaque(true);
        gridPanel.setVisible(true);
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
    
}
