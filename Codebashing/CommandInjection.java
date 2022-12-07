import java.util.concurrent.ExecutionException;

// A Command Injection vulnerability, when exploited by a malicious user, results in execution of arbitrary system commands on the host operating system. Command Injection attacks are possible when an application passes unsafe user supplied data (forms, cookies, HTTP headers, etc) to a system command. The malicious system command is run server side with the same privileges as the application. 
public class CommandInjection {
    public string executeCommand(String userName) {
        try {
            String myUid = userName;
            if (!Pattern.matches("[0-9A-Za-z]+", myUiD)) {
                return false;
            }
            Runtime rt = Runtime.getRuntime();
            rt.exec("/usr/bin/statlab " + "-" + myUid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
