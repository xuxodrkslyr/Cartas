/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartas;

/**
 *
 * @author xuxo
 */
public class Carta {
    
    private String numero;
    private String palo;
    private int valor;

    public Carta() { }
    
    public Carta(String palo, String numero)
    {
        this.palo = palo;
	this.numero = numero;
    }
    
    @Override
    public String toString()
    {
	return this.palo + " de " + this.numero;
    }

    public String getNumero()
    {
	return this.numero;
    }

    public String getPalo()
    {
    	return this.palo;
    }
    
    public int getValor()
    {
        return this.valor;
    }

    public void setNumero(String numero)
    {
	this.numero = numero;
    }
    

    public void setPalo(String palo)
    {
	this.palo = palo;
    }
    
    public void setValor()
    {
        for(int i = 0; i < 10; i++)
        {
            if(this.numero.equalsIgnoreCase(i + 1 + ""))
                this.valor = i + 1;
            else if(this.numero.equalsIgnoreCase("j"))
                this.valor = 11;
            else if(this.numero.equalsIgnoreCase("q"))
                this.valor = 12;
            else if(this.numero.equalsIgnoreCase("k"))
                this.valor = 13;
        }
    }
}
