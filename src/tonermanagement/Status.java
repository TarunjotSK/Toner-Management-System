/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonermanagement;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class Status extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
    public Status() {
        initComponents();
        Show_Users_in_Jtable();
    }
public void close(){
   WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
  Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);  
}
    public ArrayList<Emp> userList(){
       ArrayList<Emp> usersList=new ArrayList<>();
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/toner","root", "namit123");
           String query="SELECT * from employee";
           Statement st=con.createStatement();
           rs=st.executeQuery(query);
           Emp emp;
           while (rs.next())
           {
               emp = new Emp(rs.getInt("sno"),rs.getString("date"),rs.getString("printer_type"),rs.getInt("employee_code"),rs.getString("employee_name"),rs.getString("designation"),rs.getString("department"),rs.getString("floor"),rs.getString("installed_by"));
               usersList.add(emp);
           }
       }
       catch(Exception e){
           //JOptionPane.showMessageDialog(null,e);
           e.printStackTrace();
           //System.out.println("Eror");
       }
        return usersList;
    }
    public void Show_Users_in_Jtable(){
        ArrayList<Emp> list = userList();
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        Object [] row = new Object[9];
        
        for (int i = 0; i < list.size() ; i++){
            row[0] = list.get(i).getsno();
            row[1]=list.get(i).getd();
            row[2]=list.get(i).getp();
            row[3]=list.get(i).getc();
            row[4]=list.get(i).getn();
            row[5]=list.get(i).getdes();
            row[6]=list.get(i).getdep();
            row[7]=list.get(i).getf();
            row[8]=list.get(i).geti();
            model.addRow(row);   
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jt_sno = new javax.swing.JLabel();
        jt_sno_printer = new javax.swing.JLabel();
        jt_date = new javax.swing.JLabel();
        jt_no = new javax.swing.JLabel();
        jt_name = new javax.swing.JLabel();
        jt_dep = new javax.swing.JLabel();
        jt_des = new javax.swing.JLabel();
        jt_flo = new javax.swing.JLabel();
        jt1 = new javax.swing.JTextField();
        jt3 = new javax.swing.JTextField();
        jt5 = new javax.swing.JTextField();
        jt7 = new javax.swing.JTextField();
        jt6 = new javax.swing.JTextField();
        jt8 = new javax.swing.JTextField();
        jt9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jt2 = new com.toedter.calendar.JDateChooser();
        jt10 = new javax.swing.JTextField();
        jt_flo1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jt_sno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jt_sno.setText("SNo.");

        jt_sno_printer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jt_sno_printer.setText("Printer");

        jt_date.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jt_date.setText("Date");

        jt_no.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jt_no.setText("Emp Number");

        jt_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jt_name.setText("Emp Name");

        jt_dep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jt_dep.setText("Department");

        jt_des.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jt_des.setText("Designation");

        jt_flo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jt_flo.setText("Installed by");

        jt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt1ActionPerformed(evt);
            }
        });

        jt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt5ActionPerformed(evt);
            }
        });

        jt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt6ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No", "Date", "Printer_Type", "Employee Number", "Employee Name", "Desigation", "Department", "Floor", "Installed By"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jt2.setDateFormatString("yyyy-MM-dd");

        jt_flo1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jt_flo1.setText("Floor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_flo1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jt_no)
                                    .addComponent(jt_sno_printer)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jt_sno)
                                        .addComponent(jt_date))
                                    .addComponent(jt_name)
                                    .addComponent(jt_des, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jt_dep)))
                            .addComponent(jt_flo))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt10)
                            .addComponent(jt1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jt3)
                            .addComponent(jt5)
                            .addComponent(jt6)
                            .addComponent(jt7)
                            .addComponent(jt8)
                            .addComponent(jt9)
                            .addComponent(jt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jt_sno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt_date, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_sno_printer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_des, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_flo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_flo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Main Menu");

        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt1ActionPerformed

    private void jt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt5ActionPerformed

    private void jt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String sql = "INSERT INTO employee"
            +"(sno,date,printer_type,employee_code,employee_name,designation,department,floor,installed_by)"
            +"VALUES (?,?,?,?,?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/toner","root", "namit123");
            pst = con.prepareStatement(sql);
            pst.setString(1,jt1.getText());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(jt2.getDate());
            pst.setString(2,date);
            pst.setString(3,jt3.getText());
            pst.setString(4,jt5.getText());
            pst.setString(5,jt6.getText());
            pst.setString(6,jt7.getText());
            pst.setString(7,jt8.getText());
            pst.setString(8,jt9.getText());
            pst.setString(9,jt10.getText());
            pst.executeUpdate();
            //DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            //Show_Users_in_Jtable();
            JOptionPane.showMessageDialog(null, "inserted successfully");
 
            }
        catch(SQLException | ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
            String sql = "DELETE FROM employee WHERE sno =?";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toner","root", "namit123");
            pst = con.prepareStatement(sql);
            pst.setString(1,jt1.getText());
            pst.executeUpdate();
            //DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            //Show_Users_in_Jtable();
            JOptionPane.showMessageDialog(null, "deleted successfully");
 
        }
            catch(SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
           String sql = "UPDATE employee SET date=?,printer_type=?,employee_code=?,employee_name=?,designation=?,department=?,floor=?,installed_by=? WHERE sno=?";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toner","root", "namit123");
            pst = con.prepareStatement(sql);
            pst.setString(9,jt1.getText());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(jt2.getDate());
            pst.setString(1,date);
            pst.setString(2,jt3.getText());
            pst.setString(3,jt5.getText());
            pst.setString(4,jt6.getText());
            pst.setString(5,jt7.getText());
            pst.setString(6,jt8.getText());
            pst.setString(7,jt9.getText());
            pst.setString(8,jt10.getText());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "updated successfully");
  
            }
        catch(SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
           }
        showTableData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i=jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        jt1.setText(model.getValueAt(i,0).toString());
         try{  
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i,1) );
                jt2.setDate(date);
                 
            }   catch(Exception ex){
                
            }
           
        jt3.setText(model.getValueAt(i,2).toString());
        jt5.setText(model.getValueAt(i,3).toString());
        jt6.setText(model.getValueAt(i,4).toString());
        jt7.setText(model.getValueAt(i,5).toString());
        jt8.setText(model.getValueAt(i,6).toString());
        jt9.setText(model.getValueAt(i,7).toString());
        jt10.setText(model.getValueAt(i,8).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       close();
        MainActivity obj=new MainActivity();
            obj.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
            System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public void showTableData(){
        try{    
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toner","root", "namit123");
         String sql = "SELECT * FROM employee";
         pst = con.prepareStatement(sql);
         rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
 
        }
 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt10;
    private com.toedter.calendar.JDateChooser jt2;
    private javax.swing.JTextField jt3;
    private javax.swing.JTextField jt5;
    private javax.swing.JTextField jt6;
    private javax.swing.JTextField jt7;
    private javax.swing.JTextField jt8;
    private javax.swing.JTextField jt9;
    private javax.swing.JLabel jt_date;
    private javax.swing.JLabel jt_dep;
    private javax.swing.JLabel jt_des;
    private javax.swing.JLabel jt_flo;
    private javax.swing.JLabel jt_flo1;
    private javax.swing.JLabel jt_name;
    private javax.swing.JLabel jt_no;
    private javax.swing.JLabel jt_sno;
    private javax.swing.JLabel jt_sno_printer;
    // End of variables declaration//GEN-END:variables
}
