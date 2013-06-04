/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Mensagens_Enviadas 
{
    Integer ID;
    String Numero_Enviado;
    Integer Status_Retorno_Msg;
    String Data_Envio;
    String Hora_Envio;

    public Mensagens_Enviadas(Integer ID, String Numero_Enviado, Integer Status_Retorno_Msg, String Data_Envio, String Hora_Envio) {
        super();
        this.ID = ID;
        this.Numero_Enviado = Numero_Enviado;
        this.Status_Retorno_Msg = Status_Retorno_Msg;
        this.Data_Envio = Data_Envio;
        this.Hora_Envio = Hora_Envio;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNumero_Enviado() {
        return Numero_Enviado;
    }

    public void setNumero_Enviado(String Numero_Enviado) {
        this.Numero_Enviado = Numero_Enviado;
    }

    public Integer getStatus_Retorno_Msg() {
        return Status_Retorno_Msg;
    }

    public void setStatus_Retorno_Msg(Integer Status_Retorno_Msg) {
        this.Status_Retorno_Msg = Status_Retorno_Msg;
    }

    public String getData_Envio() {
        return Data_Envio;
    }

    public void setData_Envio(String Data_Envio) {
        this.Data_Envio = Data_Envio;
    }

    public String getHora_Envio() {
        return Hora_Envio;
    }

    public void setHora_Envio(String Hora_Envio) {
        this.Hora_Envio = Hora_Envio;
    }
    
    
    
    
    
    
    
}
