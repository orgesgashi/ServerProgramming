package login;
import java.sql.*;

public class UsersDao {
	 public Users checkLogin(String email, String password) throws SQLException,
     ClassNotFoundException {

  
   String jdbcURL = "jdbc:mysql://127.0.0.1:3306/vaalikone?user=root";

   String dbUser = "root";
   String dbPassword = "password";

   Class.forName("com.mysql.jdbc.Driver");
   Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
   String sql = "SELECT * FROM users WHERE email = ? and password = ?";
   PreparedStatement statement = connection.prepareStatement(sql);
   statement.setString(1, email);
   statement.setString(2, password);

   ResultSet result = statement.executeQuery();

   Users user = null;

   if (result.next()) {
       user = new Users();
       user.setFullname(result.getString("fullname"));
       user.setEmail(email);
   }

   connection.close();

   return user;
}

	

}
