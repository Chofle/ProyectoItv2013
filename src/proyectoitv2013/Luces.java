/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itv2013;

/**
 *
 * @author DAW
 */
public class Luces {
    boolean estado = false;
    boolean larga;
    boolean corta;
    boolean  posicion;
    boolean freno;
    boolean  antiniebla;
    boolean  intermitentes;
    boolean  marchaAtras;
    
    public Luces(){
        
    }
    
    public Luces(boolean larga, boolean corta, boolean  posicion, boolean freno, boolean antiniebla, boolean intermitentes, boolean marchaAtras){
        this.larga = larga;
        this.corta = corta;
        this.posicion = posicion;
        this.freno = freno;
        this.antiniebla = antiniebla;
        this.intermitentes = intermitentes;
        this.marchaAtras = marchaAtras;    
    }
    
    public boolean getLuzLarga(){
        return estado;
    }
    
    public void setLuzLarga(boolean larga){
        this.larga = larga;
    }
    
    public boolean getLuzCorta(){
        return estado;
    }
    
    public void setLuzCorta(boolean corta){
        this.corta = corta;
    }
    
    public boolean getLuzPosicion(){
        return estado;
    }
    
    public void setLuzPosicion(boolean posicion){
        this.posicion = posicion;
    }
    
    public boolean getLuzFreno(){
        return estado;
    }
    
    public void setLuzFreno(boolean freno){
        this.freno = freno;
    }
    
    public boolean getLuzAntiniebla(){
        return estado;
    }
    
    public void setLuzAntiniebla(boolean antiniebla){
        this.antiniebla = antiniebla;
    }
    
    public boolean getIntermitentes(){
        return estado;
    }
    public void setIntermitentes(boolean intermitentes){
        this.intermitentes = intermitentes;
    }
    
    public boolean getLuzMarchaAtras(){
        return estado;
    }
    
    public void setLuzMarchaAtras(boolean marchaAtras){
        this.marchaAtras = marchaAtras;
    }
}
