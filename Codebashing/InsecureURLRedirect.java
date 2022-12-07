import java.io.IOException;
import java.rmi.server.ServerCloneException;

// Unvalidated redirects and forwards are possible when a web application accepts untrusted input that could cause the web application to redirect the request to a URL contained within untrusted input. By modifying untrusted URL input to a malicious site, an attacker may successfully launch a phishing scam and steal user credentials.
public class InsecureURLRedirect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServerletREsponse response)
            throws ServerCloneException, IOException {
        String url = request.getParameter(url);
        if (url != null && url.equals("https://sso.codebashing.com")) {
            response.sendRedirect(url);
            return;
        }
        // The following is a code sinppet illustrating the use of insecure URL
        // redirects in Java
        // String query = request.getQueryString();
        // if (query.contins(url)) {
        // String url = request.getParameter(url);
        // response.sendRedirect(url);
        // }
    }
}