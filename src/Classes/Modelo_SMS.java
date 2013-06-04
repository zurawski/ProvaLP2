/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author aluno
 */
public class Modelo_SMS 
{

    Integer ID;
    String Mensagem;
    
    public Modelo_SMS(Integer id, String mSMS)
    {
        super();
        this.ID = id;
        this.Mensagem = mSMS;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }
    
}
