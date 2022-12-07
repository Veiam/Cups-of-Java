// Session Fixation is a type of application vulnerability where an application does not correctly renew session tokens when changing from a pre-login to post-login state. The same pre-login session token should not be used post-login, otherwise an attacker has the potential to steal authenticated sessions of legitimate users. When a session of one user is stolen by another, it is known as a hijacked session".
public class SessionFixation {
    private Boolean authenticate(HttpServletRequest request, String credentials, String password) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        try {
            request.getSession(true);
            if (request.getUserPrincipal() == null) {
                request.login(credential, password);
            }
            return true;
        } catch (ServeletException ex) {
            log.log(Level.WARNING, "Error when authenticate", ex);
        }
        return false;
    }
}
