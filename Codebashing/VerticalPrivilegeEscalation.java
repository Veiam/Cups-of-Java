// Missing Function Level Access Control is an application vulnerability that allows either an Anonymous User or Legitimate User of the application to access the create, read, update and/or delete functionality belonging to another user of the application. This example we show how Vertical Privilege Escalation is a potential outcome of this vulnerability.
public class VerticalPrivilegeEscalation {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Subject currentUser = SecurityUtils.getSubject();
        String url = "/login.jsp";
        if (currentUser.isAuthenticated() && currentUser.hasRole("admin")) {
            // if (currentUser.isAuthenticated()) {
            url = "/admin/show.jsp";
            List<User> userList = UserDAO.getAllUsers();
            request.setAttribute("userList", userList);
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
