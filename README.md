# Toner-Management-System
This is a java based project which includes sql to store data in the DBMS.
The TonerManagemnt.jar should be handled by
admin

The TonerReq.jar should be handled by 
Employees


In TonerReq the employee shall enter his Employee Number to generate Request

In TonerManagent the admin can Handle tables after logging in 
Username : root
Password : tarun543

System Requirement:

JDK 8 and above
MySQL 5.6.4 and above



To change password Go to Source Packages -> Toner Management -> Login.java

In source code : (private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
	       if(pass.contains("namit123")&&(username.contains("root")))  })

For Password : pass.contains("...Enter password here...")
For UserName : username.contains("...Enter username here...")

The database in which the tables are created in named "toner"
   The tables are:
		employee
		pending
		rso 
		stats

For the table description check the pictures attached in folder

How To Use:

Enter Username and Password (first use Username:root Password:namit123)
When Logged in The Main Activity Screen appers

For Pending Request : 			Go to File -> Pending
For Accesing the Employee Database:	Go to File -> Directory
To acknowledge requests:		Go to File -> Current Status
To check current inventory:		Go to Status -> Show Inventory

Take care of the following:

1) Don't add same Sno twice
2) Don't leave any field empty and if no entry is found enter 0
3) To insert any record Use "Insert" button.
4) To update any record Use "Update" button.
5) To delete any record Use "Delete" button.



Add to libraries(if not present) present in "jar files" folder :
 
1) jcalender-1.4.jar
2) rs2xml.jar
3) mysql-connector.jar

The database is available in database folder

To use it to on your server use mysql workbench 6.0 data import/restore function
