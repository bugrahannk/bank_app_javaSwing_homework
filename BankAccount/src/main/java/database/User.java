
package database;


public class User extends DbConnection{
    protected int user_id;
    protected String name_surname, tc_no, phone_no, customer_no, password, security_question, answer_question;
    protected double balance;
    protected double electricity_bill, gas_bill, water_bill, internet_bill;        

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getTc_no() {
        return tc_no;
    }

    public void setTc_no(String tc_no) {
        this.tc_no = tc_no;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getElectricity_bill() {
        return electricity_bill;
    }

    public void setElectricity_bill(double electricity_bill) {
        this.electricity_bill = electricity_bill;
    }

    public double getGas_bill() {
        return gas_bill;
    }

    public void setGas_bill(double gas_bill) {
        this.gas_bill = gas_bill;
    }

    public double getWater_bill() {
        return water_bill;
    }

    public void setWater_bill(double water_bill) {
        this.water_bill = water_bill;
    }

    public double getInternet_bill() {
        return internet_bill;
    }

    public void setInternet_bill(double internet_bill) {
        this.internet_bill = internet_bill;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
       
}
