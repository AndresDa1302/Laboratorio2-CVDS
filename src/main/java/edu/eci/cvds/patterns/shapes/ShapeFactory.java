/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;
/**
 *
 * @author USUARIO
 */
public class ShapeFactory { 
    
    public ShapeFactory()
    {
        
    }
    
    public Shapes create(RegularShapeType type) {
       Shapes shape = null;
       switch(type){
           case Triangle:
               shape=new Triangle();
               break;
           case Hexagon:
               shape=new Hexagon();
               break;
           case Quadrilateral:
               shape=new Quadrilateral();
               break;
           case Pentagon:
               shape=new Pentagon();
               break;
           default:
               break;
       } 
       return shape;
    }
    
}
