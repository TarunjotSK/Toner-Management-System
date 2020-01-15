/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonermanagement;


public class Dbs {
    private int sno;
    private String printertype;
    private int emp_code;
    private String emp_name;
    private String designation;
    private String department;
    private String floor;

    public Dbs(int sno,String printertype,int emp_code,String emp_name,String department,String designation ,String floor) {
        this.sno=sno;
        this.printertype=printertype;
        this.emp_code=emp_code;
        this.emp_name=emp_name;
        this.department= department;
        this.designation=designation;
        this.floor=floor;
    }
    
    public int getsno() {
    return sno; 
    }     
    public String getp() {
    return printertype; 
    }
    public int getc() {
    return emp_code; 
    }
    public String getn() {
    return emp_name; 
    }
    public String getdes() {
    return designation; 
    }
    public String getdep() {
    return department; 
    }
    public String getf() {
    return floor; 
    }
}
    

