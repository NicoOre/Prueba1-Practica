/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import ups.edu.ec.modelo.Matrimonio;
import ups.edu.ec.modelo.Persona;
import ups.edu.ec.visitor.IVisitor;

/**
 *
 * @author GAMER PC
 */
public class Mostrar implements IVisitor{

    public Mostrar() {
    }


    @Override
    public void visit(Matrimonio m) {
        System.out.println("Autoridad: " + m.getAutoridad().getNombre());
        System.out.println("Contrayente 1: " + m.getPareja().get(0).getNombre());
        System.out.println("Contrayente 2: " + m.getPareja().get(1).getNombre());
        System.out.println("Testigo 1: " + m.getTestigos().get(0).getNombre());
        System.out.println("Testigo 2: " + m.getTestigos().get(1).getNombre());
    }

    @Override
    public void visit(Persona persona) {
        
    }
    
}
