/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.visitor;

import java.util.ArrayList;
import java.util.List;
import ups.edu.ec.modelo.Matrimonio;

/**
 *
 * @author GAMER PC
 */
public class GrupoMatrimonio implements IPareja{
    
    List<Matrimonio> matrimonios;

    public GrupoMatrimonio() {
        matrimonios = new ArrayList<>();
    }

    public List<Matrimonio> getMatrimonios() {
        return matrimonios;
    }

    public void setMatrimonios(List<Matrimonio> matrimonios) {
        this.matrimonios = matrimonios;
    }
    
    public void agregarMatrimonio(Matrimonio m){
        this.matrimonios.add(m);
    }
    
    public Matrimonio getPareja(int codigo){
        
        return this.matrimonios.get(codigo);
    }

    @Override
    public void accept(IVisitor visitor) {
      
        matrimonios.stream().forEach(m -> m.accept(visitor));
    }
}
