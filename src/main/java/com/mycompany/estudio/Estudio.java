/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estudio;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Paul
 */
public class Estudio extends JPanel implements MouseListener{
    
    private int x1=0;
    private int x2=0;
    private int y1=0;
    private int y2=0;
    private int figura=0;
    
    private int dimx=0;
    private int dimy=0;
    private Color colorLinea = Color.BLACK;
    
    public void Estudio(){
        this.addMouseListener(this);
    }
    public void numfigura(String e){
        if(e.equalsIgnoreCase("Cuadrado")){
            this.figura=0;
        }
        if(e.equalsIgnoreCase("Circulo")){
            this.figura=1;
        }
        if(e.equalsIgnoreCase("Triangulo")){
            this.figura=2;
        }
    }
    public void dimension(String e1, String e2){
        this.dimx=Integer.valueOf(e1).intValue();
        this.dimy=Integer.valueOf(e2).intValue();
    }
   
    @Override
    public void paint(Graphics g){
        super.paint(g);
        if(this.figura==0){
            g.setColor(colorLinea);
            g.drawRect(this.x1, this.y1, this.dimx, this.dimy);
        }
        if(this.figura==1){
            g.setColor(colorLinea);
            g.drawOval(this.x1-this.dimx/2, this.y1-dimy/2, dimx, dimy);
            g.setColor(colorLinea);
        }
        if(this.figura==2){
            g.setColor(colorLinea);
            g.drawLine(this.x1,this.y1-this.dimx,this.x1+this.dimx,this.y1+this.dimy);
            g.drawLine(this.x1-this.dimx,this.y1+this.dimy,this.x1,this.y1-this.dimx);
           g.drawLine(this.x1-this.dimx,this.y1+this.dimy,this.x1+this.dimx,this.y1+this.dimy);
           g.setColor(colorLinea);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.x1 = e.getX();
        this.y1 = e.getY();
        
        super.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

    
        
    
}
