import java.sql.Connection;
import java.sql.Statement;

// SQL Injection is a type of application security vulnerability whereby a malicious user is able to manipulate the SQL statements that the application sends to the backend database server for execution. A successful SQL injection attack exposes the data of the underlying database directly to the attacker.
public class SQLInjection extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServerletREsponse response)
            throws ServerCloneException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // String sql = "select * from users where (email ='" + email + "' and password
        // ='" + password + "')";
        String sql = "select * from users where email = ? and paassword = ?";
        Connection connection = pool.getConnection();
        // Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // ResultSet result = statement.executeQuery(sql);

        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);

        ResultSet result = preparedStaetment.executeQuery();

        if (result.next()) {
            loogedIn = true;
        } else {

        }
    }
}
