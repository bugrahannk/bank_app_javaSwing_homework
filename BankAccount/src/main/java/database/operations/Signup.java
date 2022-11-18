
package database.operations;

import database.DbConnection;
import database.User;
import database.IDataControl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Signup extends User implements IDataControl{
    /*
    private String name_surname = null;
    private String phone_no = null;
    private String tc_no = null;
    private String security_question = null;
    private String answer_question = null;
    
    private String customerNo = null;
    private String password = null;
    */
    
    //DbDatas datas = new User();
    
    public boolean isSignUpConfirm(){
        if(this.isThereData()){
            if(this.isTcNoUnique()){
                return false;
            }else{
                this.AddDataToDatabase();
                return true;
            }
        }else{
            return false;
        }
    }
    
    //Veri tabanına veri ekleme
    private void AddDataToDatabase(){
        String query = "insert into users(customer_no, password,"
                + "name_surname, tc_no, phone_no, security_question, security_answer)"
                + " VALUES("
                + "'" + this.customer_no + "',"
                + "'" + this.password + "',"
                + "'" + this.name_surname + "',"
                + "'" + this.tc_no + "',"
                + "'" + this.phone_no + "',"
                + "'" + this.security_question + "',"
                + "'" + this.answer_question + "'"
                + ")";
        
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Datalar boş mu diye kontrol ediyoruz.
    @Override
    public boolean isThereData() {
        return !(
                this.name_surname == null ||
                this.phone_no == null ||
                this.tc_no == null ||
                this.security_question == null ||
                this.answer_question == null ||
                this.customer_no == null ||
                this.password == null
                );
    }
    
    //Bu tc no daha önce kayıt olmuş mu 'yu kontrol ediyoruz.
    private boolean isTcNoUnique(){
        
        try {
            String query = "Select tc_no from users where tc_no = '" + this.tc_no + "'";
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                return true; //tabloda bu veriyi bulursa true dönecek
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Bu müşteri no daha önce kullanılmış mı 'yı kontrol ediyoruz.
    public boolean isCustomerNoUnique(){
        
        try {
            String query = "Select customer_no from users where customer_no = '" + this.customer_no + "'";
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                return true; //tabloda bu veriyi bulursa true dönecek
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public AccountInfo getAccountInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
/*
    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getTc_no() {
        return tc_no;
    }

    public void setTc_no(String tc_no) {
        this.tc_no = tc_no;
    }

    public String getSecurity_question() {
        return security_question;
    }

    public void setSecurity_question(String security_question) {
        this.security_question = security_question;
    }

    public String getAnswer_question() {
        return answer_question;
    }

    public void setAnswer_question(String answer_question) {
        this.answer_question = answer_question;
    }

    public String getCustomerNo() {
        return customer_no;
    }

    public void setCustomerNo(String musteriNo) {
        this.customer_no = musteriNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String sifre) {
        this.password = sifre;
    }
    */
    
}
