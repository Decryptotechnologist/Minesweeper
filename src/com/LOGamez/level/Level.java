package com.LOGamez.level;

import com.LOGamez.graphics.*;
import com.LOGamez.minesweeper.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Nicholas Wright
 */
public class Level {
    
    /**Attributes*/
    
    /**levelNo variable of Level*/ 
    public static int levelNo;
    
    /**levelName variable of Level*/ 
    private static String levelName;
    
    /**levelComplete variable of Level*/ 
    public static boolean levelComplete = false;
    
    /**gameComplete variable of Level*/ 
    private static boolean gameComplete;
    
    /**firstTick variable of Level*/
    public static boolean firstTick;
    
    /**lastTick variable of Level*/
    public static boolean lastTick;
    
    /**theLevelTime variable of Level*/
    public static String theLevelTime;
    
    /**gameOver variable of Level*/
    public static boolean gameOver = false;
    
    /**score variable of Level*/
    int score = 0;
    
    /**gradientPaintRed variable of Level*/
    private final GradientPaint gradientPaintRed = new GradientPaint(0, 0, Color.BLACK, 36, 30, Color.decode("#BF0000"), false);
    
    /**gradientPaintRed1 variable of Level*/
//    private final GradientPaint gradientPaintRed1 = new GradientPaint(0, 15, Color.WHITE, pieceWidth, pieceHeight, Color.decode("#262626"), false);
    
    /**gradientPaintYellow variable of Level*/
//    private final GradientPaint gradientPaintYellow = new GradientPaint(0, 15, Color.lightGray, pieceWidth, pieceHeight, Color.decode("#BFBF00"), false);
    
    /**gradientPaintGreen variable of Level*/
//    private final GradientPaint gradientPaintGreen = new GradientPaint(0, 15, Color.lightGray, pieceWidth, pieceHeight, Color.decode("#00BF00"), false);
    
    /**gradientPaintBlue variable of Level*/
//    private final GradientPaint gradientPaintBlue = new GradientPaint(0, 15, Color.lightGray, pieceWidth, pieceHeight, Color.decode("#00007F"), false);
    
    /**gradientPaintCyan variable of Level*/
//    private final GradientPaint gradientPaintCyan = new GradientPaint(0, 15, Color.lightGray, pieceWidth, pieceHeight, Color.decode("#00BF60"), false);
    
    /**gradientPaintOrange variable of Level*/
//    private final GradientPaint gradientPaintOrange = new GradientPaint(0, 15, Color.lightGray, pieceWidth, pieceHeight, Color.decode("#BF8000"), false);
    
    /**gradientPaintMagenta variable of Level*/
//    private final GradientPaint gradientPaintMagenta = new GradientPaint(0, 15, Color.lightGray, pieceWidth, pieceHeight, Color.decode("#BF005F"), false);
    
    /**gradientPaintGray variable of Level*/
//    private final GradientPaint gradientPaintGray = new GradientPaint(0, 15, Color.lightGray, pieceWidth, pieceHeight, Color.decode("#262626"), false);
    
    /**cellz variable of Level*/
    public static Cell cellz = null;
    
    /**panel variable of Level*/
    public static JPanel panel;
    
    /**grid variable of Level*/
    private Grid grid = null;
    
    /**MAX_MINES variable of Level*/
    private static int MAX_MINES;
    
    /**display variable of Level*/
    public static Display display = null;
    
    /**MAX_FLAGS variable of Level*/
    private int MAX_FLAGS;
    
    /**LEVEL_TIME variable of Level*/
    private int LEVEL_TIME;
    
    /**GRID_SIZE variable of Level*/
    private int GRID_SIZE;
    
    
    
    
    /**Constructor*/
    
    /**
     * Level Constructor
     * 
     * @param lNo - level number of Level Object
     * @param w
     * @param h
     */
    public Level(int lNo, int w, int h){
        System.out.println("Level: New Level "+lNo+" Created");
        Game.labels = new Labels();
        //Game.hud = new HUD();
        levelNo = lNo;
        
        System.out.println("Level: Loading Level "+levelNo+" : "+getLevelName());
        
        //Create Player
//        if(Player.getLives() > 0 && levelNo != 1){
//            //set player lives to current player lives
//            Game.player = new Player(Game.gameWidth/2 +10, Game.gameHeight - 120, 80, 80, Game.getPName(), Player.getLives());
//        } else {
//            //set player lives to 3
//            Game.player = new Player(Game.gameWidth/2 +10, Game.gameHeight - 120, 80, 80, Game.getPName(), 1);
//        }
        //gameOver = false;
        
        setUp();
        
        init();
    }
    
    
    /**
     * setUp()
     * 
     */
    private void setUp(){
        
        switch(levelNo){
            case 1:
                setUpLevel1();
                break;
            case 2:
                setUpLevel2();
                break;
            case 3:
                setUpLevel3();
                break;
            case 4:
                setUpLevel4();
                break;
            case 5:
                setUpLevel5();
                break;
            case 6:
                setUpLevel6();
                break;
            case 7:
                setUpLevel7();
                break;
            case 8:
                setUpLevel8();
                break;
            case 9:
                setUpLevel9();
                break;
        }
        
    }
    
    
    /**
     * setUpLevel1()
     * 
     */
    private void setUpLevel1() {
        int width = Minesweeper.getMainWidth();
        GRID_SIZE = 99;
        MAX_FLAGS = 10;
        MAX_MINES = 10;
        LEVEL_TIME = 250;
        
        switch(width){
            case 300:
                //Set Grid Width
                
                
                break;
                
            case 480:
                //Set Grid Width
                
                break;
                
            case 604:
                //Set Grid Width
                
                break;
                
            default:
                //Set Grid Width
                
                break;
                
        }
        
    }

    
    /**
     * setUpLevel2()
     * 
     */
    private void setUpLevel2(){
        int width = Minesweeper.getMainWidth();
        GRID_SIZE = 199;
        MAX_FLAGS = 20;
        MAX_MINES = 20;
        LEVEL_TIME = 450;
        
        switch(width){
            case 300:
                
                break;
                
            case 480:
                
                break;
                
            case 604:
                
                break;
                
            default:
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel3()
     * 
     */
    private void setUpLevel3(){
        int width = Minesweeper.getMainWidth();
        
        //Set Enemy Color: Cadet Blue
//        Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue

        //Set Enemy Bullet Color: Green
//        Bullet.setEnemyBulletCol(0x00ff00);//Green

        //Set Level Background: 3
//        setBackground(3);//3: Earth(Small)
        
        //Set Barricade Color: Blue
//        Barricade.setBarricadeCol(0x0000ff);//Blue
        
        //Set Ground Color: Medium Blue
//        setGroundColor(0x0000dd);//Medium Blue

        //Set Level Text Background Color: Medium Blue
//        levelTxtBGCol = 0x0000dd;//Medium Blue

        //Set Enter Level Icon Background Color: Green Blue
//        enterLvlIconBG = 0x00d5fc;//Green Blue

        //Set Enter Level Icon Foreground Color: Dark Green blue
//        enterLvlIconFG = 0xc0c0c0;//Dark Green blue
        
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 0, E1rows = 11, E2rows = 11, E3rows = 11, E4rows = 0, E5rows = 11, E6rows = 11, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   
                *   ***********
                *   ***********
                *   ***********
                *   
                *   ***********
                *   ***********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(0, 11, 11, 11, 0, 11, 11, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: Cadet Blue
//                Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue
//                
//                //Set Enemy Bullet Color: Green
//                Bullet.setEnemyBulletCol(0x00ff00);//Green
//    
//                //Set Level Background: 3
//                setBackground(3);//3: Earth(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
//                //Set Barricade Color: Blue
//                Barricade.setBarricadeCol(0x0000ff);//Blue
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = Minesweeper.getMainHeight() - 140;
                
//                //Set Ground Color: Medium Blue
//                setGroundColor(0x0000dd);//Medium Blue
//                
//                //Set Level Text Background Color: Medium Blue
//                levelTxtBGCol = 0x0000dd;//Medium Blue
//                
//                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
//                
//                //Set Enter Level Icon Foreground Color: Dark Green blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 480:
                //E0rows = 0, E1rows = 11, E2rows = 11, E3rows = 11, E4rows = 0, E5rows = 11, E6rows = 11, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   
                *   ***********
                *   ***********
                *   ***********
                *   
                *   ***********
                *   ***********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(0, 11, 11, 11, 0, 11, 11, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: Cadet Blue
//                Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue
//                
//                //Set Enemy Bullet Color: Green
//                Bullet.setEnemyBulletCol(0x00ff00);//Green
//    
//                //Set Level Background: 3
//                setBackground(3);//3: Earth(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
//                //Set Barricade Color: Blue
//                Barricade.setBarricadeCol(0x0000ff);//Blue
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = Minesweeper.getMainHeight() - 140;
                
//                //Set Ground Color: Medium Blue
//                setGroundColor(0x0000dd);//Medium Blue
//                
//                //Set Level Text Background Color: Medium Blue
//                levelTxtBGCol = 0x0000dd;//Medium Blue
//                
//                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
//                
//                //Set Enter Level Icon Foreground Color: Dark Green blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 604:
                //E0rows = 0, E1rows = 11, E2rows = 11, E3rows = 11, E4rows = 0, E5rows = 11, E6rows = 11, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   
                *   ***********
                *   ***********
                *   ***********
                *   
                *   ***********
                *   ***********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(0, 11, 11, 11, 0, 11, 11, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: Cadet Blue
//                Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue
//                
//                //Set Enemy Bullet Color: Green
//                Bullet.setEnemyBulletCol(0x00ff00);//Green
//    
//                //Set Level Background: 3
//                setBackground(3);//3: Earth(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
//                //Set Barricade Color: Blue
//                Barricade.setBarricadeCol(0x0000ff);//Blue
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
//                //Set Ground Color: Medium Blue
//                setGroundColor(0x0000dd);//Medium Blue
//                
//                //Set Level Text Background Color: Medium Blue
//                levelTxtBGCol = 0x0000dd;//Medium Blue
//                
//                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
//                
//                //Set Enter Level Icon Foreground Color: Dark Green blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            default:
                //E0rows = 0, E1rows = 11, E2rows = 11, E3rows = 11, E4rows = 0, E5rows = 11, E6rows = 11, E7rows = 0, E8rows = 0, E9rows = 0;
                /**
                *   
                *   ***********
                *   ***********
                *   ***********
                *   
                *   ***********
                *   ***********
                * 
                * 
                * 
                */
//                Enemy.setNoEnemy(0, 11, 11, 11, 0, 11, 11, 0, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
//                //Set Enemy Color: Cadet Blue
//                Enemy.setEnemyCol(0x5F9EA0);//Cadet Blue
//                
//                //Set Enemy Bullet Color: Green
//                Bullet.setEnemyBulletCol(0x00ff00);//Green
//    
//                //Set Level Background: 3
//                setBackground(3);//3; Earth(Small)
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
//                //Set Barricade Color: Blue
//                Barricade.setBarricadeCol(0x0000ff);//Blue
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
//                //Set Ground Color: Medium Blue
//                setGroundColor(0x0000dd);//Medium Blue
//                
//                //Set Level Text Background Color: Medium Blue
//                levelTxtBGCol = 0x0000dd;//Medium Blue
//                
//                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
//                
//                //Set Enter Level Icon Foreground Color: Dark Green blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel4()
     * 
     */
    private void setUpLevel4(){
        int width = Minesweeper.getMainWidth();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 11, E1rows = 6, E2rows = 11, E3rows = 11, E4rows = 6, E5rows = 11, E6rows = 4, E7rows = 0, E8rows = 0, E9rows = 2;
                /**
                *   ***********
                *     ******
                *   ***********
                *   ***********
                *     ******
                *   ***********
                *      ****
                * 
                * 
                *       **
                */
//                Enemy.setNoEnemy(11, 6, 11, 11, 6, 11, 4, 0, 0, 2);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: OrangeRed
//                setGroundColor(0xFF4500);//OrangeRed
                
                //Set Level Text Background Color: OrangeRed
//                levelTxtBGCol = 0xFF4500;//OrangeRed
                
                //Set Enter Level Icon Background Color: Orange
//                enterLvlIconBG = 0xFFA500;//Orange
                
                //Set Enter Level Icon Foreground Color: Gold
//                enterLvlIconFG = 0xffd700;//Gold
                
                break;
                
            case 480:
                //E0rows = 11, E1rows = 6, E2rows = 11, E3rows = 11, E4rows = 6, E5rows = 11, E6rows = 4, E7rows = 0, E8rows = 0, E9rows = 2;
                /**
                *   ***********
                *     ******
                *   ***********
                *   ***********
                *     ******
                *   ***********
                *      ****
                * 
                * 
                *       **
                */
//                Enemy.setNoEnemy(11, 6, 11, 11, 6, 11, 4, 0, 0, 2);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: OrangeRed
//                setGroundColor(0xFF4500);//OrangeRed
                
                //Set Level Text Background Color: OrangeRed
//                levelTxtBGCol = 0xFF4500;//OrangeRed
                
                //Set Enter Level Icon Background Color: Orange
//                enterLvlIconBG = 0xFFA500;//Orange
                
                //Set Enter Level Icon Foreground Color: Gold
//                enterLvlIconFG = 0xffd700;//Gold
                
                break;
                
            case 604:
                //E0rows = 11, E1rows = 6, E2rows = 11, E3rows = 11, E4rows = 6, E5rows = 11, E6rows = 4, E7rows = 0, E8rows = 0, E9rows = 2;
                /**
                *   ***********
                *     ******
                *   ***********
                *   ***********
                *     ******
                *   ***********
                *      ****
                * 
                * 
                *       **
                */
//                Enemy.setNoEnemy(11, 6, 11, 11, 6, 11, 4, 0, 0, 2);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: OrangeRed
//                setGroundColor(0xFF4500);//OrangeRed
                
                //Set Level Text Background Color: OrangeRed
//                levelTxtBGCol = 0xFF4500;//OrangeRed
                
                //Set Enter Level Icon Background Color: Orange
//                enterLvlIconBG = 0xFFA500;//Orange
                
                //Set Enter Level Icon Foreground Color: Gold
//                enterLvlIconFG = 0xffd700;//Gold
                
                break;
                
            default:
                //E0rows = 11, E1rows = 6, E2rows = 11, E3rows = 11, E4rows = 6, E5rows = 11, E6rows = 4, E7rows = 0, E8rows = 0, E9rows = 2;
                /**
                *   ***********
                *     ******
                *   ***********
                *   ***********
                *     ******
                *   ***********
                *      ****
                * 
                * 
                *       **
                */
//                Enemy.setNoEnemy(11, 6, 11, 11, 6, 11, 4, 0, 0, 2);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: OrangeRed
//                setGroundColor(0xFF4500);//OrangeRed
                
                //Set Level Text Background Color: OrangeRed
//                levelTxtBGCol = 0xFF4500;//OrangeRed
                
                //Set Enter Level Icon Background Color: Orange
//                enterLvlIconBG = 0xFFA500;//Orange
                
                //Set Enter Level Icon Foreground Color: Gold
//                enterLvlIconFG = 0xffd700;//Gold
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel5()
     * 
     */
    private void setUpLevel5() {
        int width = Minesweeper.getMainWidth();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 5, E1rows = 5, E2rows = 11, E3rows = 10, E4rows = 7, E5rows = 7, E6rows = 4, E7rows = 10, E8rows = 0, E9rows = 0;
                /**
                *      *****
                *      *****
                *   ***********
                *   **********
                *     *******
                *     *******
                *      ****
                *   **********
                * 
                *   
                */
//                Enemy.setNoEnemy(5, 5, 11, 10, 7, 7, 4, 10, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Grey
//                Enemy.setEnemyCol(0x778899);//Grey
                
                //Set Enemy Bullet Color: Dark Grey
//                Bullet.setEnemyBulletCol(0x2F4FFF);//Dark Grey
    
                //Set Level Background: 1
//                setBackground(1);//1: Moon
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Dark Grey
//                Barricade.setBarricadeCol(0x090909);//Dark Grey
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Grey
//                setGroundColor(0x696969);//Grey
                
                //Set Level Text Background Color: Grey
//                levelTxtBGCol = 0x696969;//Grey
                
                //Set Enter Level Icon Background Color: Grey
//                enterLvlIconBG = 0x696969;//Grey
                
                //Set Enter Level Icon Foreground Color: Dark Grey
//                enterLvlIconFG = 0x090909;//Dark Grey
                
                break;
                
            case 480:
                //E0rows = 5, E1rows = 5, E2rows = 11, E3rows = 10, E4rows = 7, E5rows = 7, E6rows = 4, E7rows = 10, E8rows = 0, E9rows = 0;
                /**
                *      *****
                *      *****
                *   ***********
                *   **********
                *     *******
                *     *******
                *      ****
                *   **********
                * 
                *   
                */
//                Enemy.setNoEnemy(5, 5, 11, 10, 7, 7, 4, 10, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Grey
//                Enemy.setEnemyCol(0x778899);//Grey
                
                //Set Enemy Bullet Color: Dark Grey
//                Bullet.setEnemyBulletCol(0x2F4FFF);//Dark Grey
    
                //Set Level Background: 1
//                setBackground(1);//1: Moon
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Dark Grey
//                Barricade.setBarricadeCol(0x090909);//Dark Grey
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Grey
//                setGroundColor(0x696969);//Grey
                
                //Set Level Text Background Color: Grey
//                levelTxtBGCol = 0x696969;//Grey
                
                //Set Enter Level Icon Background Color: Grey
//                enterLvlIconBG = 0x696969;//Grey
                
                //Set Enter Level Icon Foreground Color: Dark Grey
//                enterLvlIconFG = 0x090909;//Dark Grey
                
                break;
                
            case 604:
                //E0rows = 5, E1rows = 5, E2rows = 11, E3rows = 10, E4rows = 7, E5rows = 7, E6rows = 4, E7rows = 10, E8rows = 0, E9rows = 0;
                /**
                *      *****
                *      *****
                *   ***********
                *   **********
                *     *******
                *     *******
                *      ****
                *   **********
                * 
                *   
                */
//                Enemy.setNoEnemy(5, 5, 11, 10, 7, 7, 4, 10, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Grey
//                Enemy.setEnemyCol(0x778899);//Grey
                
                //Set Enemy Bullet Color: Dark Grey
//                Bullet.setEnemyBulletCol(0x2F4F4F);//Dark Grey
    
                //Set Level Background: 1
//                setBackground(1);//1: Moon
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Dark Grey
//                Barricade.setBarricadeCol(0x090909);//Dark Grey
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Grey
//                setGroundColor(0x696969);//Grey
                
                //Set Level Text Background Color: Grey
//                levelTxtBGCol = 0x696969;//Grey
                
                //Set Enter Level Icon Background Color: Grey
//                enterLvlIconBG = 0x696969;//Grey
                
                //Set Enter Level Icon Foreground Color: Dark Grey
//                enterLvlIconFG = 0x090909;//Dark Grey
                
                break;
                
            default:
                //E0rows = 5, E1rows = 5, E2rows = 11, E3rows = 10, E4rows = 7, E5rows = 7, E6rows = 4, E7rows = 10, E8rows = 0, E9rows = 0;
                /**
                *      *****
                *      *****
                *   ***********
                *   **********
                *     *******
                *     *******
                *      ****
                *   **********
                * 
                *   
                */
//                Enemy.setNoEnemy(5, 5, 11, 10, 7, 7, 4, 10, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Grey
//                Enemy.setEnemyCol(0x778899);//Grey
                
                //Set Enemy Bullet Color: Dark Grey
//                Bullet.setEnemyBulletCol(0x2F4F4F);//Dark Grey
    
                //Set Level Background: 1
//                setBackground(1);
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Dark Grey
//                Barricade.setBarricadeCol(0x090909);//Dark Grey
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Grey
//                setGroundColor(0x696969);//Grey
                
                //Set Level Text Background Color: Grey
//                levelTxtBGCol = 0x696969;//Grey
                
                //Set Enter Level Icon Background Color: Grey
//                enterLvlIconBG = 0x696969;//Grey
                
                //Set Enter Level Icon Foreground Color: Dark Grey
//                enterLvlIconFG = 0x090909;//Dark Grey
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel6()
     * 
     */
    private void setUpLevel6(){
        int width = Minesweeper.getMainWidth();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 6, E1rows = 6, E2rows = 6, E3rows = 6, E4rows = 6, E5rows = 6, E6rows = 10, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *   **********
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(6, 6, 6, 6, 6, 6, 10, 4, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
                //Set Enemy Color: Crimson
//                Enemy.setEnemyCol(0xDC1000);//Crimson
                
                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
    
                //Set Level Background: 2
//                setBackground(2);//2: Mars
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
                
                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 480:
                //E0rows = 6, E1rows = 6, E2rows = 6, E3rows = 6, E4rows = 6, E5rows = 6, E6rows = 10, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *   **********
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(6, 6, 6, 6, 6, 6, 10, 4, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
                //Set Enemy Color: Crimson
//                Enemy.setEnemyCol(0xDC1000);//Crimson
                
                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
    
                //Set Level Background: 2
//                setBackground(2);//2: Mars
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
                
                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 604:
                //E0rows = 6, E1rows = 6, E2rows = 6, E3rows = 6, E4rows = 6, E5rows = 6, E6rows = 10, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *   **********
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(6, 6, 6, 6, 6, 6, 10, 4, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
                //Set Enemy Color: Crimson
//                Enemy.setEnemyCol(0xDC1000);//Crimson
                
                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
    
                //Set Level Background: 2
//                setBackground(2);//2: Mars
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
                
                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            default:
                //E0rows = 6, E1rows = 6, E2rows = 6, E3rows = 6, E4rows = 6, E5rows = 6, E6rows = 10, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *     ******
                *   **********
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(6, 6, 6, 6, 6, 6, 10, 4, 0, 0);
                
                //Set Enemy UFOfreq: 8
//                Enemy.setUFOFreq(8);
                
                //Set Enemy Color: Crimson
//                Enemy.setEnemyCol(0xDC1000);//Crimson
                
                //Set Enemy Bullet Color: Red
//                Bullet.setEnemyBulletCol(0xff0000);//Red
    
                //Set Level Background: 2
//                setBackground(2);//2: Mars
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *      **     **
                *     ****   ****
                *     ****   ****
                */
//                Barricade.setNoBarricades(2);
                
                //Set Barricade Color: Red
//                Barricade.setBarricadeCol(0xff0000);//Red
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Maroon
//                setGroundColor(0x800000);//Maroon
                
                //Set Level Text Background Color: Maroon
//                levelTxtBGCol = 0x800000;//Maroon
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
        }
        
    }
    
    
    /**
     * setUpLevel7()
     * 
     */
    private void setUpLevel7(){
        int width = Minesweeper.getMainWidth();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 10, E1rows = 2, E2rows = 10, E3rows = 8, E4rows = 10, E5rows = 6, E6rows = 9, E7rows = 6, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *       **
                *   **********
                *    ********
                *   **********
                *     ******
                *    *********
                *     ******
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 2, 10, 8, 10, 6, 9, 6, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Gold
//                Barricade.setBarricadeCol(0xFFD700);//Gold
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Red
//                setGroundColor(0xff0000);//Red
                
                //Set Level Text Background Color: Red
//                levelTxtBGCol = 0xff0000;//Red
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 480:
                //E0rows = 10, E1rows = 2, E2rows = 10, E3rows = 8, E4rows = 10, E5rows = 6, E6rows = 9, E7rows = 6, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *       **
                *   **********
                *    ********
                *   **********
                *     ******
                *    *********
                *     ******
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 2, 10, 8, 10, 6, 9, 6, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Gold
//                Barricade.setBarricadeCol(0xFFD700);//Gold
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Red
//                setGroundColor(0xff0000);//Red
                
                //Set Level Text Background Color: Red
//                levelTxtBGCol = 0xff0000;//Red
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 604:
                //E0rows = 10, E1rows = 2, E2rows = 10, E3rows = 8, E4rows = 10, E5rows = 6, E6rows = 9, E7rows = 6, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *       **
                *   **********
                *    ********
                *   **********
                *     ******
                *    *********
                *     ******
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 2, 10, 8, 10, 6, 9, 6, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Gold
//                Barricade.setBarricadeCol(0xFFD700);//Gold
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Red
//                setGroundColor(0xff0000);//Red
                
                //Set Level Text Background Color: Red
//                levelTxtBGCol = 0xff0000;//Red
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            default:
                //E0rows = 10, E1rows = 2, E2rows = 10, E3rows = 8, E4rows = 10, E5rows = 6, E6rows = 9, E7rows = 6, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *       **
                *   **********
                *    ********
                *   **********
                *     ******
                *    *********
                *     ******
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 2, 10, 8, 10, 6, 9, 6, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: 0xf7cb07
//                Enemy.setEnemyCol(0xf7cb07);
                
                //Set Enemy Bullet Color: 0xf7cb07
//                Bullet.setEnemyBulletCol(0xf7cb07);
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Gold
//                Barricade.setBarricadeCol(0xFFD700);//Gold
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Red
//                setGroundColor(0xff0000);//Red
                
                //Set Level Text Background Color: Red
//                levelTxtBGCol = 0xff0000;//Red
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
        }
        
    }
    
    
    /**
     * setUpLevel8()
     * 
     */
    private void setUpLevel8(){
        int width = Minesweeper.getMainWidth();
        Random random = new Random();
        switch(width){
            case 300:
                //Set Enemies
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 8, E4rows = 8, E5rows = 6, E6rows = 6, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *    ********
                *    ********
                *     ******
                *     ******
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 10, 10, 8, 8, 6, 6, 4, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Random Blue
//                Enemy.setEnemyCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
                
                //Set Enemy Bullet Color: Random Blue
//                Bullet.setEnemyBulletCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
    
                //Set Level Background: 3
//                setBackground(3);//3: Earth
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
            
                //Set Ground
                //Set Ground Scale: 1.0
//                groundScale = 1.0;
                
                //Set Ground POS: 4, Game.getGameHeight() - 140;
//                groundX = 4;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Random Green
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 480:
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 8, E4rows = 8, E5rows = 6, E6rows = 6, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *    ********
                *    ********
                *     ******
                *     ******
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 10, 10, 8, 8, 6, 6, 4, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Random Blue
//                Enemy.setEnemyCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
                
                //Set Enemy Bullet Color: Random Blue
//                Bullet.setEnemyBulletCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
    
                //Set Level Background: 3
//                setBackground(3);//3: Earth
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 1.25
//                groundScale = 1.25;
                
                //Set Ground POS: 10, Game.getGameHeight() - 140;
//                groundX = 10;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Random Green
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            case 604:
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 8, E4rows = 8, E5rows = 6, E6rows = 6, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *    ********
                *    ********
                *     ******
                *     ******
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 10, 10, 8, 8, 6, 6, 4, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Random Blue
//                Enemy.setEnemyCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
                
                //Set Enemy Bullet Color: Random Blue
//                Bullet.setEnemyBulletCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
    
                //Set Level Background: 3
//                setBackground(3);//3: Earth
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Random Green
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
            default:
                //E0rows = 10, E1rows = 10, E2rows = 10, E3rows = 8, E4rows = 8, E5rows = 6, E6rows = 6, E7rows = 4, E8rows = 0, E9rows = 0;
                /**
                *   **********
                *   **********
                *   **********
                *    ********
                *    ********
                *     ******
                *     ******
                *      ****
                * 
                *   
                */
//                Enemy.setNoEnemy(10, 10, 10, 8, 8, 6, 6, 4, 0, 0);
                
                //Set Enemy UFOfreq: 5
//                Enemy.setUFOFreq(5);
                
                //Set Enemy Color: Random Blue
//                Enemy.setEnemyCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
                
                //Set Enemy Bullet Color: Random Blue
//                Bullet.setEnemyBulletCol(0x0000ff + random.nextInt(0x0000ff));//Random Blue
    
                //Set Level Background: 3
//                setBackground(3);//3: Earth
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set POW Scale: 0.75
//                powScale = 0.75;
           
                //Set Ground
                //Set Ground Scale: 2.45
//                groundScale = 2.45;
                
                //Set Ground POS: -14, Game.getGameHeight() - 140;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
                
                //Set Ground Color: Random Green
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
                //Set Level Text Background Color: Green
//                levelTxtBGCol = 0x00ff00;//Green
                
                //Set Enter Level Icon Background Color: Green Blue
//                enterLvlIconBG = 0x00d5fc;//Green Blue
                
                //Set Enter Level Icon Foreground Color: Dark Green Blue
//                enterLvlIconFG = 0xc0c0c0;//Dark Green blue
                
                break;
                
        }
        
    }
    
    
    /**
     * setUpLevel9()
     * 
     */
    private void setUpLevel9(){
        int width = Minesweeper.getMainWidth();
        Random random = new Random();
        switch(width){
            case 300:
                
            
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
//                powScale = 0.75;
            
//                groundScale = 1.0;
//                groundX = 4;
//                groundY = Minesweeper.getMainHeight() - 140;
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));
                
                break;
                
            case 480:
                
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
//                powScale = 0.75;
           
//                groundScale = 1.25;
//                groundX = 10;
//                groundY = Minesweeper.getMainHeight() - 140;
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));
                
                break;
                
            case 604:
                
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
//                powScale = 0.75;
           
//                groundScale = 2.45;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));
                
                break;
                
            default:
                
                /**
                *   
                *   
                *   
                *    
                *    
                *     
                *     
                *   **     **     **
                *  ****   ****   ****
                *  ****   ****   ****
                */
//                Barricade.setNoBarricades(3);
                
                //Set Barricade Color: Random Green
//                Barricade.setBarricadeCol(0x00ff00 + random.nextInt(0xffffff));//Random Green
                
//                powScale = 0.75;
           
//                groundScale = 2.45;
//                groundX = -14;
//                groundY = Minesweeper.getMainHeight() - 140;
//                setGroundColor(0x00ff00 + random.nextInt(0xffffff));
                
                break;
                
        }
    }
    
    
    /**
     * init()
     * 
     */
    private void init(){
        Texture.clearMaps();

        GridLayout experimentLayout = new GridLayout(1, 1);
        panel = new JPanel();
        display = new Display(5,10, Minesweeper.getMainWidth()-40, 40, String.valueOf(MAX_FLAGS), String.valueOf(LEVEL_TIME));
        panel.setLayout(experimentLayout);
        
        grid = new Grid(Minesweeper.getMainWidth()-100, Minesweeper.getMainHeight()-60, MAX_MINES);
        grid.init();
        panel.add(grid.gridPanel);
        panel.setBackground(Color.decode("#8D8D8D"));
        
        int[] minez = new int[MAX_MINES];
        Random random = new Random(System.currentTimeMillis());
        for(int i = 0; i < MAX_MINES; i++){
            minez[i] = random.nextInt(GRID_SIZE);
        }
        
        //Create Buttons
        cellz = new Cell(MAX_MINES, minez);
        cellz.init();
        
        
        firstTick = true;
        lastTick = false;

        //Reset Level Time
        resetLevelTime();
        
        //random = new Random(System.currentTimeMillis());
        
        display.init();
    }
    
    
    /**
     * changeLevel()
     * 
     */
    public static void changeLevel(){
        if(levelNo < 8){
            levelNo++;
            setLevelNo(levelNo);
        } else {
            gameComplete = true;
        }
    }
    
    
    /**
     * getLevelNo()
     * 
     * 
     * @return levelNo
     */
    public static int getLevelNo(){
        return levelNo;
    }
    
    
    /**
     * setLevelNo()
     * 
     * 
     * @param levNo
     */
    public static void setLevelNo(int levNo){
        levelNo = levNo;
        Game.level = new Level(levelNo, Minesweeper.getMainWidth(), Minesweeper.getMainHeight());
    }
    
    
    /**
     * getLevelName()
     * 
     * 
     * @return levelName
     */
    public static String getLevelName(){
        switch(levelNo){
            case 1:
                levelName = "Start Zone - Dark side of the moon";
                
                break;
                
            case 2:
                levelName = "Martian Orbit - The Red Planet";
                
                break;
                
            case 3:
                levelName = "Terra Ferma - Protect Earth";
                
                break;
                
            case 4:
                levelName = "Fourth Quarter - Save the Sun";
                
                break;
                
            case 5:
                levelName = "Lunar Orbit - The Full Moon";
                
                break;
                
            case 6:
                levelName = "Martian Resistance - Defend Mars";
                
                break;
                
            case 7:
                levelName = "3rd Rock From The Sun - Protect Earth (again)";
                
                break;
                
            case 8:
                levelName = "Final Frontier - Send em to the Sun";
                
                break;
            
            default:
                levelName = "GAME COMPLETE!";
                
                break;
            
        }

        return levelName;
    }
    
    
    /**
    * tick()
    * 
    * 
    * Updates Level Object
    */
    public static synchronized void tick(){
        //Manage Level: First Tick
        if(firstTick) {
            //Set firstTick: false
            firstTick = false;
            
            //Reset Game Time
            Game.resetGameTime();
            
            //Reset Level Time
            resetLevelTime();
            
            if(Game.getGame().getGameMusic()){
//                if(Game.levelNo == 1 && !Sound.Level1.isPlaying()){
//                    Sound.Level1.loop();
//                }
//                if(Game.levelNo == 2 && !Sound.Level2.isPlaying()){
//                    Sound.Level2.loop();
//                }
//                if(Game.levelNo == 3 && !Sound.Level3.isPlaying()){
//                    Sound.Level3.loop();
//                }
//                if(Game.levelNo == 4 && !Sound.Level4.isPlaying()){
//                    Sound.Level4.loop();
//                }
//                if(Game.levelNo == 5 && !Sound.Level5.isPlaying()){
//                    Sound.Level5.loop();
//                }
//                if(Game.levelNo == 6 && !Sound.Level6.isPlaying()){
//                    Sound.Level6.loop();
//                }
//                if(Game.levelNo == 7 && !Sound.Level7.isPlaying()){
//                    Sound.Level7.loop();
//                }
//                if(Game.levelNo == 8 && !Sound.Level8.isPlaying()){
//                    Sound.Level8.loop();
//                }
            }
        }
        
        //Manage Level: Last Tick
        if(lastTick) {
            lastTick = false;
//            Sound.stopAll();
//            if(!Sound.creditsSoundtrack.isPlaying()){
//                Sound.creditsSoundtrack.play();
//            }
            
            //Reset Level Time
            resetLevelTime();
        }
        display.tick();
        cellz.tick();
    }
    
    
    /**
    * render(Render target, Graphics2D g)
    * 
    * 
    * Renders/Repaints Level Objects
    * 
    * @param g2d
    */
    public void render(Graphics2D g2d){
        Graphics2D g2d_Level = g2d;
        AffineTransform oldXForm = g2d.getTransform();
        
        g2d_Level.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        
//        Game.hud.render(target, g2d_Level);
        
            if(Game.showFPS){
                g2d_Level.setColor(Color.decode("#fe1300"));
                g2d_Level.drawString(Game.theFPS, Labels.fpsX, Labels.fpsY);

            }
            if(Game.showUPS){
                g2d_Level.setColor(Color.decode("#f0ff00"));
                g2d_Level.drawString(Game.theUPS, Labels.upsX, Labels.upsY);
            }
            if(Game.showGameTime){
                g2d_Level.setFont(new Font("default", Font.BOLD, 18));
                g2d_Level.setColor(Color.DARK_GRAY);
                g2d_Level.drawString(Game.theGameTime, Labels.upsX+51, Labels.upsY+55);
                g2d_Level.setColor(Color.decode("#008fea"));
                g2d_Level.drawString(Game.theGameTime, Labels.upsX+50, Labels.upsY+54);
            }
            if(Game.showLevelTime){
                g2d_Level.setFont(new Font("default", Font.BOLD, 18));
                g2d_Level.setColor(Color.DARK_GRAY);
                g2d_Level.drawString(theLevelTime, Labels.upsX+231, Labels.upsY+55);
                g2d_Level.setColor(Color.decode("#ff8fea"));
                g2d_Level.drawString(theLevelTime, Labels.upsX+230, Labels.upsY+54);
            }

            g2d_Level.setFont(new Font("default", Font.BOLD, 18));
            g2d_Level.setColor(Color.DARK_GRAY);
//            g2d_Level.drawString("Lines Complete: "+linesComplete, Labels.upsX+401, Labels.upsY+55);
            g2d_Level.setColor(Color.BLUE);
//            g2d_Level.drawString("Lines Complete: "+linesComplete, Labels.upsX+400, Labels.upsY+54);
                

        if(gameOver) {
            //Game.player.P1Hit();
            if(Game.getGameSound()){
//                Sound.gameover.play();
            }
        }

        
        if(Game.showBounds){
//            g2d_Level.setColor(Color.GREEN);
//            g2d_Level.drawRect(groundBounds.x, groundBounds.y, groundBounds.width, groundBounds.height);
//            g2d_Level.setColor(Color.WHITE);
//            //g.drawRect(Enemy.leftSide - 5, 29, 5, Display.game.getHeight() - (28 + groundBounds.height + 8));
//            g2d_Level.setColor(Color.WHITE);
//            //g.drawRect(Enemy.rightSide + 19, 29, 5, Display.game.getHeight() - (28 + groundBounds.height + 8));
        }    
        
        g2d.setTransform(oldXForm);
        g2d_Level.setTransform(oldXForm);
    
    }
    
    
    /**
    * increaseFlags()
    * 
    */
    public static void increaseFlags(){
        display.increaseFlags();
    }
    
    
    /**
    * decreaseFlags()
    * 
    */
    public static void decreaseFlags(){
        display.decreaseFlags();
    }
    
    
    /**
    * getFlags()
    * 
    * @return 
    */
    public static String getFlags(){
        return display.getFlags();
    }

    
    /**
    * setBackground(int index)
    * 
    * 
    * @param index
    */
//    public static void setBackground(int index) {
//        background = index;
//    }

    
    /**
    * setGroundColor(int col)
    * 
    * 
    * @param col
    */
//    private void setGroundColor(int col) {
//        groundColor = col;
//    }

    
    /**
    * resetLevelTime()
    * 
    */
    public static void resetLevelTime() {
        System.out.println("Level: Resetting Level Time");
        Game.levelTime = 0;
    }
    
    
    /**
     * gameOver()
     * 
     */
    public static void gameOver() {
        System.out.println("Level: Game Over - "+gameOver);
        if(!gameOver){
            gameOver = true;
            display.gameOver();
            Game.loseGame();
            panel.removeAll();
//            init();
        }
    }
    
    
//    public int rotate(int px, int py, int r){
//        switch(r % 4){
//            case 0: return py * 4 + px; //0 Degrees
//            case 1: return 12 + py - (px * 4); //90 Degrees
//            case 2: return 15 - (py * 4) - px; //180 Degrees
//            case 3: return 3 - py + (px * 4); //270 Degrees
//        }
//        return 0;
//    }
    
    
//    public boolean doesPieceFit(int tetro, int rot, int posX, int posY){
//         
//        for(int px = 0; px < 4; px++){
//            for(int py = 0; py < 4; py++){
//                //Get index into piece
//                int pi = rotate(px, py, rot);
//                
//                //Get index into field
//                int fi = (posY + py) * fieldWidth + (posX + px);
//                
//                if(posX + px >= 0 && posX + px < fieldWidth){
//                    if(posY + py >= 0 && posY + py < fieldHeight){
//                        if(tetromino[tetro].toCharArray()[pi] == 'X' && pField[fi] != '0'){
//                            return false; // fail on first hit
//                        }
//                    }
//                }
//                
//            }
//        }
//        
//        
//        return true;
//    }
    
    
    /**
     * checkWin()
     * 
     * @return result
     */
    public static boolean checkWin(){
        System.out.println("Level: Check Win");
        boolean result = false;
        int count = 0;
        int numberOfFlags = Integer.decode(getFlags());
        if(numberOfFlags == 0){
            for(Cell c : cellz.getCellz()){
                if(c.isFlagged && c.isBomb) count++;
                result = (count == MAX_MINES);
                System.out.println("No Of Mines:"+MAX_MINES);
                System.out.println("No Of Mines Flagged:"+count);
                System.out.println("No Of Flags:"+numberOfFlags);
            }
        }
        
        return result;
    }
    
    
}
