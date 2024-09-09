
import java.sql.*;
import java.sql.ResultSet;

class Database {
  public static void main(String[] args) {
    try {
      // Step 1: load the JDBS driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Connecting to database...");

      
      String url = "jdbc:mysql://localhost:3306/PPA";
      String username = "root";
      String password = "1232";
      String Query = "select * from student where Marks >90";
      Connection conn = DriverManager.getConnection(url, username, password);
      if (conn.isClosed()) {
        System.out.println("Database connection is closed!");
      } else {
        System.out.println("Connected Sucessfully");
      }
      Statement sobj = conn.createStatement();
      ResultSet robj = sobj.executeQuery(Query);
      while (robj.next()) {
        System.out.println("Rno :" + robj.getInt("Rno"));
        System.out.println("Name:" + robj.getString("Name"));
        System.out.println("Marks:" + robj.getInt("Marks"));
        System.out.println("City:" + robj.getString("City"));
        System.out.println("\n");
      }
    } catch (Exception e) {
      System.err.println("Error Conneting to  database" + e);
    }
  }
}
