/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import ups.edu.ec.visitor.IPareja;
import ups.edu.ec.visitor.IVisitor;

/**
 *
 * @author GAMER PC
 */
public class Matrimonio implements IPareja {

    ArrayList<Persona> pareja;
    ArrayList<Persona> testigos;
    Persona autoridad;
    Date fecha;
    String lugar;
    

    public Matrimonio() {
        pareja = new ArrayList<Persona>();
        testigos = new ArrayList<Persona>();
    }

    public Matrimonio(ArrayList<Persona> pareja, ArrayList<Persona> testigos, Persona autoridad, Date fecha, String lugar) {
        this.pareja = pareja;
        this.testigos = testigos;
        this.autoridad = autoridad;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public ArrayList<Persona> getPareja() {
        return pareja;
    }

    public void setPareja(ArrayList<Persona> pareja) {
        this.pareja = pareja;
    }

    public ArrayList<Persona> getTestigos() {
        return testigos;
    }

    public void setTestigos(ArrayList<Persona> testigos) {
        this.testigos = testigos;
    }

    public Persona getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(Persona autoridad) {
        this.autoridad = autoridad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }


    public List<Persona> getPersonas() {
        return pareja;
    }


    public void agregarContrayente(Persona p) {
        pareja.add(p);
    }
    
    public void agregarTestigo(Persona p) {
        testigos.add(p);
    }
    
    public void agregarAutoridad(Persona p) {
        autoridad = p;
    }
    
    public void contrayente() {
        JOptionPane.showMessageDialog(null, "A iniciado sesion como contrayente");
    }
    
    public void testigo() {
        JOptionPane.showMessageDialog(null, "A iniciado sesion como testigo");
    }
    
    public void Autoridad() {
        JOptionPane.showMessageDialog(null, "A iniciado sesion como Autoridad");
    }

    @Override
    public void accept(IVisitor visitor) {

        visitor.visit(this);
        
        pareja.stream().forEach(n -> n.accept(visitor));
    }

    @Override
    public String toString() {
        return "Matrimonio{" + "pareja=" + pareja + ", testigos=" + testigos + ", autoridad=" + autoridad + ", fecha=" + fecha + ", lugar=" + lugar + '}';
    }
    
    
}
