package tonermanagement;
public class User {
    private int sno;
    private String printer;
    private String tonerno;
    private int filled;
    private int brandnew;
    private int empty;
    private int faulty;
    private String drumno;
    private int okstock;
    private int notokstock;
    private String date;
     
    
    public User (int sno,String printer,String tonerno,int filled,int brandnew,int empty,int faulty,String drumno,int okstock,int notokstock,String date)
    {
        this.sno=sno;
        this.printer=printer;
        this.tonerno=tonerno;
        this.filled=filled;
        this.brandnew=brandnew;
        this.empty=empty;
        this.faulty=faulty;
        this.drumno=drumno;
        this.okstock=okstock;
        this.notokstock=notokstock;
        this.date=date;
       
    }
     
    public int getsno() {
    return sno; 
    }     
    public String getprinter() {
    return printer; 
    }
    public String gettonerno() {
    return tonerno; 
    }
    public int getfilled() {
    return filled; 
    }
    public int getbrandnew() {
    return brandnew; 
    }
    public int getempty() {
    return empty; 
    }
    public int getfaulty() {
    return faulty; 
    }
    public String getdrumno() {
    return drumno; 
    }
    public int getokstock() {
    return okstock; 
    }
    public int getnotokstock() {
    return notokstock; 
    }
    public String getdate() {
    return date; 
    }
    
  
}
