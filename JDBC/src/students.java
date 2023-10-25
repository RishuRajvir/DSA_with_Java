import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class students {
        public void createdatabase(){
                   try{
                String driver = "com.mysql.cj.jdbc.Driver";
                String dbURl = "jdbc:mysql://localhost:3306";
                String user = "root";
                String pass = "admin";
                Class.forName(driver);
                Connection con = DriverManager.getConnection(dbURl,user,pass);
                System.out.println("Connection Successfully");
                Statement stm  = con.createStatement();
                String query = "Create database Students";
                boolean bl =  stm.execute(query);
                System.out.println("Connection Successfully  "+bl);
                con.close();

            }  catch (Exception e){
                    System.out.println("Some Error "+e);
            }
        }
        public void createtable() {
            try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbURl = "jdbc:mysql://localhost:3306/students";
            String user = "root";
            String pass = "admin";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(dbURl,user,pass);
            System.out.println("Connection Successfully");
            Statement stm  = con.createStatement();
            String query = "CREATE TABLE Persons (\n" +
                    "    StuID int,\n" +
                    "    LastName varchar(255),\n" +
                    "    FirstName varchar(255),\n" +
                    "    Address varchar(255),\n" +
                    "    City varchar(255)\n" +
                    ");";
            boolean bl =  stm.execute(query);
            System.out.println("Table Created Successfully  "+bl);
            con.close();

        }  catch (Exception e){
            System.out.println("Some Error "+e);
        }
    }

    public void insertdata() {
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbURl = "jdbc:mysql://localhost:3306/students";
            String user = "root";
            String pass = "admin";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(dbURl,user,pass);
            System.out.println("Connection Successfully");
            Statement stm  = con.createStatement();
            String query = "INSERT INTO Persons VALUES (01, 'Mahnaz', 'Fatma', 'Takia_Bazaar','SSM')";
            boolean bl =  stm.execute(query);
            System.out.println("Insert Data  Successfully  "+bl);
            con.close();
        }  catch (Exception e){
            System.out.println("Some Error "+e);
        }
    }
    public void insertdata2() {
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbURl = "jdbc:mysql://localhost:3306/students";
            String user = "root";
            String pass = "admin";


            Class.forName(driver);
            Connection con = DriverManager.getConnection(dbURl,user,pass);
            String query = "INSERT INTO Persons values (?,?,?,?,?)";

            PreparedStatement pstm  = con.prepareStatement(query);
            pstm.setInt(1,2);
            pstm.setString(2,"Raj");
            pstm.setString(3,"Rishu");
            pstm.setString(4,"Takiya_bazar");
            pstm.setString(5,"Sasaram");


            pstm.execute();
            boolean bl =  pstm.execute(query);
            System.out.println("Insert Data  Successfully  "+bl);
            con.close();
        }  catch (Exception e){
            System.out.println("Some Error "+e);
        }
    }
}

