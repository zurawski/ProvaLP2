/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author aluno
 */
public class Grupos 
{

    Integer ID;
    String Nome;
    Integer ID_CONTATOS;
    
    public Grupos(Integer id, String NomeGrupo, Integer ID)
    {
        super();
        this.ID = id;
        this.Nome = NomeGrupo;
        this.ID_CONTATOS = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Integer getID_CONTATOS() {
        return ID_CONTATOS;
    }

    public void setID_CONTATOS(Integer ID_CONTATOS) {
        this.ID_CONTATOS = ID_CONTATOS;
    }
    
    
    
    
}
