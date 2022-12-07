import javax.xml.parsers.ParserConfigurationException;

// XML External Entity (XXE) Processing is a type of application security vulnerability whereby a malicious user can attack poorly configured/implemented XML parser within an application. Malicious external entity references can be forced by an attacker, which results in unauthorized read-access to sensitive files on the server that the XML parser runs from. Denial of Service is another potential outcome.
public class XXEProcessing {
    public static DocumentBuilderFactory newDocumentBuilderFactory() {
        DocoumentBuildFactory documentBuilderFactory = DocumentBuilderFactory.newIndstance();
        try {
            // documentBUilderFactory.setFeature("http://xml.org/sax/features/external-general-entities",
            // true);
            // documentBuilderFactory.setFeature("http://xml.opg/sax/features/externa-parameter-entities",
            // true);
            documentBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            documentBUilderFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
            documentBuilderFactory.setFeature("http://xml.opg/sax/features/externa-parameter-entities", false);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        return documentBuilderFactory;
    }
}
