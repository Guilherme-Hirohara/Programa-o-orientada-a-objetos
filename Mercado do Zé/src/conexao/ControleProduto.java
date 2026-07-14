
package conexao;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import modelo.exceptions.NotExistsException;

public class ControleProduto {
    

    public List<Produto> getListaProduto() throws SQLException {
        List<Produto> produto = new ArrayList<>(); 
        
        Connection conexao = ConexaoSql.getConexao(); 
        
        String comandoSQl = "SELECT * FROM Produto";
        
        PreparedStatement exec; 
        
        exec = conexao.prepareStatement(comandoSQl); 
        
        ResultSet resultadoConsulta; 
        
        resultadoConsulta = exec.executeQuery(); 
        
        Produto p; 
        while(resultadoConsulta.next()){
            p = new Produto(); 
            p.setNome(resultadoConsulta.getString("nome"));
            p.setQuantidade(Integer.parseInt(resultadoConsulta.getString("quantidade")));
            p.setPreco(Double.valueOf(resultadoConsulta.getString("preco")));
            p.setCodigo(Integer.parseInt(resultadoConsulta.getString("codigo")));
            produto.add(p); 
        }
        return produto; 
    }

    public void adicionarProduto(Produto p) throws SQLException{
        Connection conexao = ConexaoSql.getConexao(); 
        
        String comandoSQL = "insert into Produto (nome, quantidade, preco, codigo) values(?, ?, ?, ?)"; 
        
        PreparedStatement exec; 
        
        exec = conexao.prepareStatement(comandoSQL); 
        
        exec.setString(1, p.getNome());
        exec.setInt(2, p.getQuantidade());
        exec.setDouble(3, p.getPreco());
        exec.setInt(4, p.getCodigo()); 
        
        exec.executeUpdate(); 
        
        conexao.commit();
        
        exec.close(); 
        
        conexao.close();
        
    }
    
    
    public void deletarProduto(int codigo) throws SQLException, NotExistsException{
        Connection conexao = ConexaoSql.getConexao(); 
        
        String comandoSQL = "DELETE FROM Produto WHERE codigo = ?"; 
        
        PreparedStatement exec; 
        exec = conexao.prepareStatement(comandoSQL); 
        
        exec.setInt(1, codigo);
        
        int linha = exec.executeUpdate(); 
        
        conexao.commit(); 
        
        exec.close();
        
        conexao.close();
        
        if(linha==0){
            throw new NotExistsException("ERRO - CODIGO INEXISTENTE"); 
        }
        
    }
    
    public Produto procurarProduto(int codigo) throws SQLException, NotExistsException{
        
        Produto p = null; 
        
        Connection conexao = ConexaoSql.getConexao(); 
        
        String comandoSQL = "SELECT FROM * Produto WHERE codigo = ?"; 
        
        PreparedStatement exec; 
        
        exec = conexao.prepareStatement(comandoSQL); 
        
        exec.setInt(1, codigo);
        int linha = exec.executeUpdate(); 
        
        ResultSet resultadoConsulta; 
        
        resultadoConsulta = exec.executeQuery();
        
        if(resultadoConsulta.getRow()>0){
            p = new Produto(); 
            
            p.setCodigo(codigo);
            p.setNome(resultadoConsulta.getString("nome"));
            p.setPreco(resultadoConsulta.getDouble("preco"));
            p.setQuantidade(resultadoConsulta.getInt("quantidade"));
            
        }
        else{
            throw new NotExistsException("ERRO - CODIGO INEXISTENTE"); 
        }
        
        conexao.commit(); 
        
        exec.close(); 
        
        conexao.close();
        
        return p; 
        
    }
    
    public void alterarProduto(Produto p) throws NotExistsException, SQLException{
         Connection conexao = ConexaoSql.getConexao();
        
        String comandoSQL = "update Produto set nome = ?, quantidade = ?, preco = ? "
                          + " where codigo = ?";
        
        
        PreparedStatement execSQL;
     
       
        execSQL = conexao.prepareStatement(comandoSQL);
            
        
        execSQL.setInt(4, p.getCodigo());
        execSQL.setString(1, p.getNome());
        execSQL.setInt(2, p.getQuantidade());
        execSQL.setDouble(3, p.getPreco()); 

        
        int quantAlterados = execSQL.executeUpdate();
            
        
        conexao.commit();

        
        execSQL.close();
            
        
        conexao.close();
        
        if (quantAlterados == 0)
        {
            throw new NotExistsException("ERRO - PRODUTO NAO IDENTIFICADO");
        }
    }
}
