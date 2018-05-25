
package domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class ImportanMethods {
    
    //method to make the lines of images
    public void graphic(int d1, int pixel, Graphics g){
        
        g.drawRect(720, 100, d1, d1);
  
        
        for (int y = 100; y <100+d1 ; y+=pixel) {//for (int y = 0; y <d1+100 ; y+=pixel) {
            g.drawLine(720, y, 720+d1, y);
            
        }
        for (int y = 720; y <720+d1 ; y+=pixel)
            g.drawLine(y,100+d1,y, 100);
        
        //fullmatrixNewImage(d1, pixel);
        //fillMatrixFile(d1, pixel);
    }//end method
    
    public void drawTable(int size, int d1, int d2, Graphics g){
        
        for (int i = size; i < d1+size; i+=size) {
            g.drawLine(size, i, d2, i);
            
        }
        for (int y = size; y < d2+size; y+=size){
            g.drawLine(y,size,y, d1);
        }
    }
    
    public void fillMatrixBool(){
        boolean matrix[][] = new boolean[7][14];
        for(int i=0; i < matrix.length;i++){
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=false;
            }
        }
    }
    
    public void paint(int size, int d1, int d2, Graphics2D g2){
        g2.setColor(Color.CYAN);
        for (int i = 0; i < 7; i++) {
            for (int j = 0,c=size; j < 14; j++,size+=size) {
                g2.drawRect(80,size,size,size);
//                size+=size;
//g2.drawRect(160,size,size,size);
            }
        }
    }

}
