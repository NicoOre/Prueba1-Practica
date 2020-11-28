/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.visitor;

import ups.edu.ec.modelo.Matrimonio;
import ups.edu.ec.modelo.Persona;

/**
 *
 * @author GAMER PC
 */
public interface IVisitor {

    public void visit(Matrimonio matrimonio);

    public void visit(Persona persona);
}
