
package Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Classes.*;
/**
 *
 * @author Rafael
 */
public class SMSDao 
{
    /*
     * Inserts nas Tabelas
     */
    private static final String insertRegistraSMS = "insert into MENSAGENS_ENVIADAS(Numero_Enviado,Pessoa_Enviou,Status_Retorno_Msg,Data_Envio,Hora_Envio) values(?,?,?,?,?)";
    private static final String insertModelosSMS  = "insert into MODELO_MENSAGEM(Msg,Nome_Modelo) values(?,?)";
    private static final String insertGruposSMS   = "insert into GRUPOS(Nome) values(?)";
    private static final String insertContatosSMS = "insert into CONTATOS(Numero,Nome) values(?,?)";
    private static final String insertContatosGruposSMS = "insert into GRUPOS_CONTATOS(ID_Grupo,ID_Contato) values(?,?)";
    
    /*
     *   Updates nas Tabelas
     */
    private static final String updateModeloSMS = "update CONTATOS set Msg = ?, Nome_Modelo = ? where Nome_Modelo like(?)";
    private static final String updateContatoPorNome = "update CONTATOS set Numero = ?, Nome = ? where ID = ?";
    private static final String updateGrupoSMS = "update GRUPOS set Nome = ? where ID = ?";
   
    /*
     *   Deletes nas Tabelas
     */
    
    /**
     *
     * @param cont
     */
    public void addContatos(Contatos cont)
    {
        if (cont == null) {
			throw new IllegalArgumentException("O Contato não pode ser null!");
		}
        
        		try {
			Connection con = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/caixa", "postgres",
					"senacrs");

			PreparedStatement stmt = con.prepareStatement(insertContatosSMS);
			stmt.setString(1, cont.getNumero());
			stmt.setString(2, cont.getNome());
			int r = stmt.executeUpdate();
                        
			if (r != 1) {
				throw new RuntimeException("Erro ao inserir operação");
			}
		} catch (Exception e) {
			// FIXME: comunicar erro ao programa
			e.printStackTrace();
		} finally{
                            
                        }
                        
        
        
    }
}


