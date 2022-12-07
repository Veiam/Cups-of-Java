<!-- User Enumeration is a type of application security vulnerability whereby the vulnerable web application reveals whether a username (email address or account name) exists or not, this can be a consequence of a misconfiguration or a design decision. The information obtained via user enumeration can then be used by an attacker to gain a list of users on system. This information can be used to further attack the web application, for example, such as through a brute force credential guessing attack.  -->
<c:choose>
    <c:when test="${statusCode == 'emailNotFound'}">
        <!-- <div id="reminder-message">We are unable to find an account matching the email address you entered. Please
            contact an administrator.</div> -->
        <div id="reminder-message"> A reminder email has been sent to this user.</div>
    </c:when>
    <c:when test="${statusCode =='emailFound'}">
        <div id="reminder-message"> A reminder email has been sent to this user.</div>
    </c:when>
    </c:when>
</c:choose>