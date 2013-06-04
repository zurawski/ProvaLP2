/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author aluno
 */
public class Contatos 
{
    Integer ID;
    String Numero;
    String Nome;
    
    public Contatos(Integer id, String Num, String Contato)
    {
        super();
        this.ID = id;
        this.Numero = Num;
        this.Nome = Contato;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    
}
