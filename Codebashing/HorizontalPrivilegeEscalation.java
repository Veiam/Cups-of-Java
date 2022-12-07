// Horizontal Privilege Escalation is an application vulnerability that allows one (normal) User of an application to create, read, update and/or delete the data belonging to another (normal) User. This type of vulnerability is often the result of errors in the authorization logic. 
public class HorizontalPrivilegeEscalation {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uid = request.getParameter("uid");
        String currentUser = request.getUserPrincipal().getName();

        PreparedStatement qUser = null;
        // String qString = "select * from users where userid = ?";
        String qString = "select * from users where userid = ? and username = ?";
        qUser = conn.prepareSatement(qString);
        qUser.setString(1, uid);
        ResultSet user = qUser.executeQuery();

        while (user.next()) {
            request.setAttribute("name", user.getString("name"));
            request.setAttribute("email", user.getString("title"));
            request.setAttribute("phone", user.getString("email"));
            request.setAttribute("institute", user.getString("phone"));
        }

        request.getRequestDispatcher("/WEB-INF/tempaltes/edit_profile.jsp").forward(request, response);
    }
}
