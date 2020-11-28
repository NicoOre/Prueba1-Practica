/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.util.Date;
import ups.edu.ec.modelo.Matrimonio;
import ups.edu.ec.modelo.Persona;
import ups.edu.ec.visitor.GrupoMatrimonio;

/**
 *
 * @author GAMER PC
 */
public class Ejemplo {
    public static void main(String[] args) {
        
        GrupoMatrimonio g = new GrupoMatrimonio();
 
        Matrimonio m1 = new Matrimonio();
        
        m1.agregarAutoridad(new Persona("Pepe"));
        m1.agregarContrayente(new Persona("Juan"));
        m1.agregarContrayente(new Persona("Maria"));
        m1.agregarTestigo(new Persona("Sech"));
        m1.agregarTestigo(new Persona("Pepe 1"));
        
        g.agregarMatrimonio(m1);
        g.accept(new Mostrar());
        Matrimonio m2 = new Matrimonio();
        
        m2.agregarAutoridad(new Persona("Pepe1"));
        m2.agregarContrayente(new Persona("Jua1"));
        m2.agregarContrayente(new Persona("Maria1"));
        m2.agregarTestigo(new Persona("Sech1"));
        m2.agregarTestigo(new Persona("Pepe 2"));
        g.agregarMatrimonio(m2);
        g.accept(new Mostrar());
        
        /*Date fecha = new Date(2001-1900, 9, 5);
        
        System.out.println(fecha);*/
    }
}
