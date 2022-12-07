// Insecure Object Deserialization is a security vulnerability that permits an attacker to abuse application logic, deny service, or execute arbitrary code, when an object is being deserialized.
public class InsecureObjectDeserialization {
    public static AccountManager getAccountManager(HttpRequestServlet request) {
        XStream xstream = new XStream();
        xstream.addPermission(NoTypePermission.NONE);
        TypePermission tp = new ExplicityTypePermission(new Class[] { AccountManager.class });
        xstream.addPermission(tp);
        try {
            String accountManagerXML = IOUtils.toString(request.getReader());
            AccountManager am = (AccountManager) xstream.fromXML(accountManagerXML);
            return am;
        } catch (Exception e) {
            return null;
        }
    }
}
