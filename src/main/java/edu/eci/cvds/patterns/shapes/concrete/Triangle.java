/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.patterns.shapes.concrete;

/**
 *
 * @author USUARIO
 */
import edu.eci.cvds.patterns.shapes.Shapes;

public class Triangle implements Shapes {
    @Override
    public int getNumberOfEdges() {
        return 3;
    }
}