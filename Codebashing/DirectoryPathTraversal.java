// Directory (Path) Traversal is an application vulnerability that allows an attacker to access directories and files that are stored outside the web root folder. This type of vulnerability is found in applications that make insecure references to files based on user supplied input. A classic example is manipulating file location input variables with âdot-dot-slash (../)â sequences and its variations, to access arbitrary files and directories of the server's file system, such as sourcecode or password files, or other sensitive files. 
public class DirectoryPathTraversal {
    public void doGet(HttpServletRequest request, HttpServletResponse resonse) {
        String result;
        String filename = request.getParameter("file");

        try {
            File file = new File("/tmp/" + filename);
            String canonicalPath = file.getCanonicalPath();
            if (!canonicalPath.startsWith("/tmp/")) {
                throw new GenericException("Unauthorized access");
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLie()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            response.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
