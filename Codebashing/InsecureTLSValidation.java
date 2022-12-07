import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;

// Insecure TLS validation is a security vulnerability that permits an attacker to bypass SSL pinning.
public class InsecureTLSValidation {
    public bool testSecureConnectionTo(String aURL) throws Exception {
        Colleciton SANs = null;
        LInkedList<String> subjectAltList = new LinkedList();
        URL destinationURL = new URL(aURL);
        String wildcardSAN = "*.trade-ssl.com";
        HttpsURLConnection conn = (HttpsURLConnection) destinationURL.openConnection();
        conn.connect();
        java.security.cert.Certificate[] certs = conn.getServerCertificates();
        for (java.security.cert.Certificate cert : certs) {
            if (cert instanceof X509Certificate) {
                try {
                    boolean[] keyUsage = ((X509Certificate) cert).getKeyUsage();
                    if (!keyUsage[5]) {
                        ((X509Certificate) cert).checkValidity();
                        SANs = ((X509Certificate) cert).getSubjectAlternativeNames();
                        if (SANs != null) {
                            Iterator<X509Certificate> it = SANs.iterator();
                            while (it.hasNext()) {
                                List list = (List) it.next();
                                String domain = (String) list.get(1);
                                subjectAltList.add(domain);
                            }
                            if (!subjectAltList.contains(wildcardSAN)) {
                                return false;
                            }
                        }
                    }
                } catch (CertificateExpiredException | CertificateNotYetValidException e) {
                    logger.log(e.getMessage());
                }
            }
        }
        return true;
    }
}