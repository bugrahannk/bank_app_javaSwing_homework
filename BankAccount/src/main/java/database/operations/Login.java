package database.operations;

import database.IDataControl;
import database.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends User implements IDataControl{
    
    public boolean isLoginInfoTrue(){
        if(this.isThereData()){
            if(isLoginInfoMatch()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public boolean isLoginInfoMatch(){
        
            String query = "select tc_no,customer_no,password from users"
            + " where " 
            + "(tc_no = '" + this.tc_no + "'"
            + " OR " 
            + "customer_no = '" + this.tc_no + "')"
            + " AND "
            + "(password = '" + this.password + "')";
            
            
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }      
        return false;
    }
    @Override
    public boolean isThereData() {
        return !(this.tc_no == null ||
                this.password == null);
    }

    @Override
    public AccountInfo getAccountInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
